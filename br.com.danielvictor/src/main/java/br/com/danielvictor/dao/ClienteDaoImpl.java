package br.com.danielvictor.dao;

import org.springframework.stereotype.Repository;

import br.com.danielvictor.domain.Cliente;

@Repository
public class ClienteDaoImpl extends AbstractDao<Cliente, Long> implements ClienteDao {

}
