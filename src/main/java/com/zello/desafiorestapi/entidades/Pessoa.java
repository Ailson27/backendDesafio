package com.zello.desafiorestapi.entidades;


import javax.persistence.Entity;
import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;

@Entity
public class Pessoa {
    @Id
    private String cpf;
    private String nome;
    private String dataNascimento;
    private String rg;
    private Long idPerfil;

   // Criar chave estrangeira 
    // @ManyToOne
    // @JoinColumn(name="id_Perfil")
    // private Perfil perfil;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }  

    public Long getIdPerfil() {
        return idPerfil;
    }
    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }
}
