package br.com.danielvictor.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.danielvictor.domain.Profissao;
import br.com.danielvictor.service.ProfissaoService;


@Component
public class StringToProfissao implements Converter<String, Profissao> {
	
	@Autowired
	private ProfissaoService service;
	
	@Override
	public Profissao convert(String text) {
		if(text.isEmpty()) {
		return null; 
			
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}


}
