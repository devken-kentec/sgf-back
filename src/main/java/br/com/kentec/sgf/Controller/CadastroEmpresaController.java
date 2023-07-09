package br.com.kentec.sgf.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.sgf.domain.Empresa;
import br.com.kentec.sgf.service.CadastroEmpresaService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/sisgesfin/api/cadastroEmpresa")
public class CadastroEmpresaController {
	
	@Autowired
	private CadastroEmpresaService ces;
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void cadastrarEmpresa(@RequestBody Empresa empresa) {
		ces.cadastrarEmpresa(empresa);
	}

}
