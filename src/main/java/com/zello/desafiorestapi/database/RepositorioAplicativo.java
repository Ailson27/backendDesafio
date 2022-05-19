package com.zello.desafiorestapi.database;

import com.zello.desafiorestapi.entidades.Aplicativo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioAplicativo extends JpaRepository<Aplicativo, Long> {
    
}
