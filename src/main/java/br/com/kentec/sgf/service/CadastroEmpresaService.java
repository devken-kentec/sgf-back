package br.com.kentec.sgf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.sgf.domain.Empresa;
import br.com.kentec.sgf.reository.CadastroEmpresaRepository;
import br.com.kentec.sgf.utilitarios.Utils;

@Service
public class CadastroEmpresaService {
	
	@Autowired
	private CadastroEmpresaRepository cer;
	
	public void cadastrarEmpresa(Empresa empresa) {
			empresa.setStatusEmpresa("Ativo");
			empresa.setCertificador(Utils.certificador());
			cer.save(empresa);
	}

}
