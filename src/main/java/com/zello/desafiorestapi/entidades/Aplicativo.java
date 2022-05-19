package com.zello.desafiorestapi.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;

@Entity
public class Aplicativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idApp;
    private String nome;
    private String bundleId;
    //private String cpf;
    //Criar chave estrangeira 
    // @ManyToOne
    // @JoinColumn(name="cpf")
    // private Pessoa pessoa;

    public Long getIdApp() {
        return idApp;
    }
    
    public void setIdApp(Long idApp) {
        this.idApp = idApp;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getBundleId() {
        return bundleId;
    }
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    // public String getCpf() {
    //     return cpf;
    // }

    // public void setCpf(String cpf) {
    //     this.cpf = cpf;
    // }

}
