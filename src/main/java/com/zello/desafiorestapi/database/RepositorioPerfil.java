package com.zello.desafiorestapi.database;

import com.zello.desafiorestapi.entidades.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPerfil extends JpaRepository<Perfil, Long> {
    
}