package model.services;

import model.entities.User;

import java.util.Optional;

public interface UserServiceable extends GenericService<User> {
    Optional<User> login(String name, String password) ;
}
