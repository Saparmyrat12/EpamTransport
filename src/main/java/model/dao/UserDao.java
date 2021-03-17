package model.dao;

import model.entities.User;

import java.util.List;
import java.util.Optional;


public interface UserDao extends GenericDao<User>{

    Optional<User> findById(int id);
    List<User> findAll() ;
    Optional<User> getUserByEmail(String name) ;
    Optional<User> findByName(String login) ;
}