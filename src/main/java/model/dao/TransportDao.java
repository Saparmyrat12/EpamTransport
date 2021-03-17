package model.dao;

import model.entities.Plan;
import model.entities.Route;
import model.entities.Transport;

import java.util.List;
import java.util.Optional;

public interface TransportDao extends GenericDao<Transport> {
    Optional<Transport> findById(int id);
    List<Transport> findAll() ;
    List<Optional<Transport>> findByNumber(String number) ;
    List<Transport> findTransportOnRoute(Route route);
    Optional<Transport> findTransportOnPlan(Plan plan);
}
