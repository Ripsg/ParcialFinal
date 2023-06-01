package com.udea.ciudad.service;

import com.udea.ciudad.dao.ICiudadDAO;
import com.udea.ciudad.model.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CiudadService {

    @Autowired
    private ICiudadDAO dao;

    public Ciudad save(Ciudad p) {return dao.save(p);}
    public Ciudad update(Ciudad p) {return dao.save(p);}
    public void delete(Ciudad p) {dao.delete(p);}
    public Iterable<Ciudad> list(){return dao.findAll();}
    public Optional<Ciudad> listId(long id){return dao.findById(id);}

    //public Optional<Ciudad> listcountrycity(String countryname, String cityname ){return dao.findById(id);}





}