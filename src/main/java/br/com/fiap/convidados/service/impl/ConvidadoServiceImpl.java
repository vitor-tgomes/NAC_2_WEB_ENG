package br.com.fiap.convidados.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.convidados.dto.ConvidadoDto;
import br.com.fiap.convidados.entity.ConvidadoEntity;
import br.com.fiap.convidados.repository.ConvidadosRepository;
import br.com.fiap.convidados.service.ConvidadoService;

@Service
public class ConvidadoServiceImpl implements ConvidadoService {
	
	@Autowired
	ConvidadosRepository repository;

	@Override
	public List<ConvidadoDto> findAllConvidado() {
		List<ConvidadoEntity> listaConvidados = repository.findAll();		
		List<ConvidadoDto> listaDtoConvidados = fromConvidadeEntityToConvidadoDto(listaConvidados);
		return listaDtoConvidados;
	}

	@Override
	public ConvidadoDto saveConvidado(ConvidadoDto dto) {		
		ConvidadoEntity entity = dto.toConvidadoEntity();		
		entity = repository.save(entity);
		ConvidadoDto convidadoDto = fromConvidadeEntityToConvidadoDto(entity);		
		return convidadoDto;
	}

	@Override
	public ConvidadoDto findByIdConvidado(Long id) {
		ConvidadoEntity entity = repository.findById(id).get();
		ConvidadoDto convidadoDto = fromConvidadeEntityToConvidadoDto(entity);		
		return convidadoDto;
	}

	@Override
	public void deleteByIdConvidado(Long id) {
		repository.deleteById(id);
	}
	
	private List<ConvidadoDto> fromConvidadeEntityToConvidadoDto(List<ConvidadoEntity> listaConvidados){		
		List<ConvidadoDto> listaConvidadoDto =  new ArrayList<ConvidadoDto>();		
		for (ConvidadoEntity entity : listaConvidados) {
			ConvidadoDto convidadoDto = new ConvidadoDto();
			convidadoDto.setNome(entity.getNome());
			convidadoDto.setEmail(entity.getEmail());
			convidadoDto.setEndereco(entity.getEndereco());
			convidadoDto.setId(entity.getId());
			convidadoDto.setNumero(entity.getNumero());
			convidadoDto.setCidade(entity.getCidade());
			convidadoDto.setCep(entity.getCep());
			convidadoDto.setCpf(entity.getCpf());
			convidadoDto.setRg(entity.getRg());
			convidadoDto.setDatanascimento(entity.getDatanascimento());
			convidadoDto.setTelresidencial(entity.getTelresidencial());
			convidadoDto.setCelular(entity.getCelular());
			convidadoDto.setTipfinan(entity.getTipfinan());
			convidadoDto.setQuantparc(entity.getQuantparc());
			convidadoDto.setValint(entity.getValint());
			convidadoDto.setSalario(entity.getSalario());
			
			listaConvidadoDto.add(convidadoDto);
		}		
		return listaConvidadoDto;		
	}
	
	private ConvidadoDto fromConvidadeEntityToConvidadoDto(ConvidadoEntity convidadoEntity){		
			ConvidadoDto convidadoDto = new ConvidadoDto();
			
			convidadoDto.setNome(convidadoEntity.getNome());
			convidadoDto.setEmail(convidadoEntity.getEmail());
			convidadoDto.setEndereco(convidadoEntity.getEndereco());
			convidadoDto.setId(convidadoEntity.getId());
			convidadoDto.setNumero(convidadoEntity.getNumero());
			convidadoDto.setCidade(convidadoEntity.getCidade());
			convidadoDto.setCep(convidadoEntity.getCep());
			convidadoDto.setCpf(convidadoEntity.getCpf());
			convidadoDto.setRg(convidadoEntity.getRg());
			convidadoDto.setDatanascimento(convidadoEntity.getDatanascimento());
			convidadoDto.setTelresidencial(convidadoEntity.getTelresidencial());
			convidadoDto.setCelular(convidadoEntity.getCelular());
			convidadoDto.setTipfinan(convidadoEntity.getTipfinan());
			convidadoDto.setQuantparc(convidadoEntity.getQuantparc());
			convidadoDto.setValint(convidadoEntity.getValint());
			convidadoDto.setSalario(convidadoEntity.getSalario());					
		return convidadoDto;		
	}

}
