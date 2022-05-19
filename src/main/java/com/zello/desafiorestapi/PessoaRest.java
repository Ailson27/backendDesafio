package com.zello.desafiorestapi;

import java.util.List;

import com.zello.desafiorestapi.database.RepositorioPessoa;
import com.zello.desafiorestapi.entidades.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaRest {
    @Autowired
    private RepositorioPessoa repositorio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Pessoa> listar(){
        return repositorio.findAll();
    }

    //Listar pessoa por cpf
    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Pessoa getPessoaById(@PathVariable String id){
        return repositorio.findById(id).get();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public void salvar (@RequestBody Pessoa pessoa){
        repositorio.save(pessoa);
    }
    @CrossOrigin(origins = "*")
    @PutMapping
    public void alterar (@RequestBody Pessoa pessoa){
        if(!pessoa.getCpf().isEmpty()){
        repositorio.save(pessoa);
     }
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping
    public void deletar(@RequestBody Pessoa pessoa){
        repositorio.delete(pessoa);
    }

     //Deletar pessoa por cpf
     @CrossOrigin(origins = "*")
     @DeleteMapping("/{id}")
        @ResponseStatus(code = HttpStatus.NO_CONTENT)
        public void deleteById(@PathVariable String id){
            repositorio.deleteById(id);
     }
}