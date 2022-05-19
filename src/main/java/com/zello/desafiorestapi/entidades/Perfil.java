package com.zello.desafiorestapi.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerfil;
    private String perfil;

    public Long getIdPerfil() {
        return idPerfil;
    }
    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
