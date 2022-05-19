package com.zello.desafiorestapi.database;

import com.zello.desafiorestapi.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

public interface RepositorioPessoa extends JpaRepository<Pessoa, String> {
    
    
    // @Query(value = "SELECT  p.nome, p.cpf, p.rg, p.idPerfil FROM Pessoa p WHERE p.cpf = :cpf")
    // Pessoa bucarPessoaPorCpf(@Param("cpf") String cpf);

}
