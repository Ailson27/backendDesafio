package com.zello.desafiorestapi;

import java.util.List;

import com.zello.desafiorestapi.database.RepositorioPerfil;
import com.zello.desafiorestapi.entidades.Perfil;

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
@RequestMapping("/perfil")
public class PerfilRest {
    @Autowired
    private RepositorioPerfil repositorio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Perfil> listar(){
        return repositorio.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public void salvar (@RequestBody Perfil perfil){
        repositorio.save(perfil);
    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public void alterar (@RequestBody Perfil perfil){
        repositorio.save(perfil);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping
    public void deletar(@RequestBody Perfil perfil){
        repositorio.delete(perfil);
    }

     //Deletar perfil por id
     @CrossOrigin(origins = "*")
     @DeleteMapping("/{id}")
        @ResponseStatus(code = HttpStatus.NO_CONTENT)
        public void deleteById(@PathVariable Long id){
            repositorio.deleteById(id);
     }
}
