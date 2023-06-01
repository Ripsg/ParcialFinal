package com.udea.ciudad.controller;

import com.udea.ciudad.exception.ModelNotFoundException;
import com.udea.ciudad.model.Ciudad;
import com.udea.ciudad.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ciudad")
@CrossOrigin("*")
public class CiudadController {

    @Autowired
    CiudadService ciudadService;

    @PostMapping("/save")
    public long save(@RequestBody Ciudad city){
        ciudadService.save(city);
        return city.getIdCity();
    }

    @GetMapping("/listAll")
    public Iterable<Ciudad> listAllCities(){return ciudadService.list();}

    @GetMapping("/list/{id}")
    public Ciudad listCityById(@PathVariable("id") int id){
        Optional<Ciudad> city = ciudadService.listId(id);
        if(city.isPresent()){
            return city.get();
        }

        throw new ModelNotFoundException("Id de ciudad invalido");
    }

    @GetMapping("/list/{countryname}/{countrycity}")
    public Ciudad listCityByCountry(@PathVariable ("countryname") String countryname, @PathVariable ("cityname") String cityname ){
        Iterable<Ciudad> lista = ciudadService.list();
        for (Ciudad ciudad: lista
             ) {
            if (ciudad.getCityName().equals(cityname)|| ciudad.getCountryName().equals(countryname)){
                return ciudad;
            }
            
        }


        throw new ModelNotFoundException("Id de ciudad invalido");
    }





}