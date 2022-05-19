package com.zello.desafiorestapi.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PessoaAplicativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPessoaAplicativo;
    private String cpf;
    private Long idApp;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getIdApp() {
        return idApp;
    }

    public void setIdApp(Long idApp) {
        this.idApp = idApp;
    }
}
