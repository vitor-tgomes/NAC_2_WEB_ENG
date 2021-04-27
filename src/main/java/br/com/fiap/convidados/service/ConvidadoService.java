package br.com.fiap.convidados.service;

import java.util.List;

import br.com.fiap.convidados.dto.ConvidadoDto;


public interface ConvidadoService {
	
	List<ConvidadoDto> findAllConvidado();
	
	ConvidadoDto saveConvidado(ConvidadoDto dto);
	
	ConvidadoDto findByIdConvidado(Long id);
	
	void deleteByIdConvidado(Long id);
}
