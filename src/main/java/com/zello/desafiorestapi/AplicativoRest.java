package com.zello.desafiorestapi;

import java.util.List;

import com.zello.desafiorestapi.database.RepositorioAplicativo;
import com.zello.desafiorestapi.entidades.Aplicativo;

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
@RequestMapping("/aplicativo")
public class AplicativoRest {
    @Autowired
    private RepositorioAplicativo repositorio;

    @CrossOrigin(origins = "*")
    @GetMapping
    public List<Aplicativo> listar(){
        return repositorio.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping
    public void salvar (@RequestBody Aplicativo app){
        repositorio.save(app);
    }
    @CrossOrigin(origins = "*")
    @PutMapping
    public void alterar (@RequestBody Aplicativo app){
        repositorio.save(app);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping
    public void deletar(@RequestBody Aplicativo app){
        repositorio.delete(app);
    }

    //Deletar aplicativo por idApp
    @CrossOrigin(origins = "*")
    @DeleteMapping("/{id}")
       @ResponseStatus(code = HttpStatus.NO_CONTENT)
       public void deleteById(@PathVariable Long id){
           repositorio.deleteById(id);
    }
}
