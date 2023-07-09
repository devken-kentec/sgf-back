package br.com.kentec.sgf.reository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kentec.sgf.domain.Empresa;

public interface CadastroEmpresaRepository extends JpaRepository<Empresa, Long> {

}
