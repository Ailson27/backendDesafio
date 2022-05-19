package com.zello.desafiorestapi;

import java.util.List;

import com.zello.desafiorestapi.database.RepositorioPessoaAplicativo;
import com.zello.desafiorestapi.entidades.PessoaAplicativo;

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
@RequestMapping("/pessoaAplicativo")
public class PessoaAplicativoRest {
    @Autowired
    private RepositorioPessoaAplicativo repositorio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<PessoaAplicativo> listar(){
        return repositorio.findAll();
    }

     //Listar AppPessoa por cpf
     @CrossOrigin(origins = "*")
     @GetMapping("/{cpf}")
     public List<PessoaAplicativo> listarAppPorPessoa(@PathVariable String cpf){
         return repositorio.listarAppPorPessoa(cpf);
     }

    @CrossOrigin(origins = "*")
    @PostMapping
    public void salvar (@RequestBody PessoaAplicativo pessoaAplicativo){
        repositorio.save(pessoaAplicativo);
    }

    //Cadastrar aplicativos da pessoa
    @CrossOrigin(origins = "*")
    @PostMapping("/{cpf}/{idApp}")
        @ResponseStatus(code = HttpStatus.NO_CONTENT)
        public void salvar(@PathVariable String cpf, @PathVariable Long idApp){
            PessoaAplicativo pessoaApp = new PessoaAplicativo();
            pessoaApp.setCpf(cpf);
            pessoaApp.setIdApp(idApp);
            repositorio.save(pessoaApp);
     }

    @CrossOrigin(origins = "*")
    @PutMapping
    public void alterar (@RequestBody PessoaAplicativo pessoaAplicativo){
        repositorio.save(pessoaAplicativo);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping
    public void deletar(@RequestBody PessoaAplicativo pessoaAplicativo){
        repositorio.delete(pessoaAplicativo);
    }

     //Deletar aplicativos por cpf
     @CrossOrigin(origins = "*")
     @DeleteMapping("/{cpf}")
        @ResponseStatus(code = HttpStatus.NO_CONTENT)
        public void deletarAppPessoaPorCpf(@PathVariable String cpf){
            repositorio.deletePorCpf(cpf);
     }


}
