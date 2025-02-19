package com.example.apiSPB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiSPB.Model.Person;
import com.example.apiSPB.Repository.Repository;

import jakarta.persistence.PostRemove;

//indicar la manera en la que vamos a trabajar en este caso apiRest.
@RestController
public class ControllerPerson {

    // definir endpoints

    @Autowired // inyeccion de dependencia
    private Repository repo;

    // vacio este devuelve una conexion o sea si no conectamos.
    @GetMapping()
    public String index() {
        return "Estamos conectados";
    }


    @GetMapping("persons")
    public List<Person> getPersons(){
        return repo.findAll(); // con la inyeccion de dependencias usamos este metodo para que 
                               // nos devuelva todas las personas en la tabla
    }

    @PostMapping("save")
    public String save(@RequestBody Person person){ // recibe esto en forma de JSON
         repo.save(person);
         return "Guardado Exitosamente";
    }

    @PutMapping("edit/{id}") // se le pide el id a modificar
    public String update(@PathVariable Long id, @RequestBody Person person){

        Person updatePerson = repo.findById(id).get(); // me trae la informacion de una persona en especifico
        updatePerson.setName(person.getName());
        updatePerson.setAge(person.getAge());
        updatePerson.setTelephone(person.getTelephone());
        repo.save(updatePerson);
        return "Actualizado Exitosamente";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        repo.deleteById(id);
        return "Eliminado Exitosamente";
    }
    
}