package service;

import domain.*;

import jakarta.persistence.EntityManagerFactory;
import java.util.*;

public record JpaService(EntityManagerFactory entityManagerFactory) implements Service {

    @Override
    public Rental save(Rental rental) {
        return null;
    }

    @Override
    public Station save(Station station) {
        return null;
    }

    @Override
    public Car save(Car car) {
        return null;
    }

    @Override
    public List<Station> findAllStations() {
        return null;
    }

    @Override
    public List<Car> findAllCars() {
        return null;
    }

    @Override
    public List<Rental> findAllRentals() {
        return null;
    }

    @Override
    public Optional<Rental> findRentalById(long id) {
        return Optional.empty();
    }

    @Override
    public Set<Car> findCarsStationedAt(Station station) {
        return null;
    }

    @Override
    public Rental finish(Rental rental, Station station, double drivenKm) {
        return null;
    }
}