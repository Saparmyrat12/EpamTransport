package model.dao;

import model.entities.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverDao extends GenericDao<Driver>{
    Optional<Driver> findById(int id) ;
    List<Driver> findAll();
    List<Optional<Driver>> findByName(String name);
}