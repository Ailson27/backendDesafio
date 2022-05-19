package com.zello.desafiorestapi.database;

import java.util.List;

import javax.transaction.Transactional;

import com.zello.desafiorestapi.entidades.PessoaAplicativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositorioPessoaAplicativo extends JpaRepository<PessoaAplicativo, String> {
    
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM PessoaAplicativo as p where p.cpf = :cpf")
    void deletePorCpf(@Param("cpf") String cpf);

    @Query(value = "select * from pessoa_aplicativo p where p.cpf = :cpf", nativeQuery = true)
    List<PessoaAplicativo> listarAppPorPessoa(@Param("cpf") String cpf);
    
    


}