package br.com.danielvictor.dao;

import org.springframework.stereotype.Repository;

import br.com.danielvictor.domain.Empresa;

@Repository
public class EmpresaDaoImpl extends AbstractDao<Empresa, Long> implements EmpresaDao {

}
