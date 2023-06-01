package com.udea.ciudad.dao;

import com.udea.ciudad.model.Ciudad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICiudadDAO extends CrudRepository<Ciudad,Long> {
}

