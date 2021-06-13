package hu.progmasters.dinopark.repository;

import hu.progmasters.dinopark.domain.Dinosaur;

import java.util.List;

public interface DinoRepository {

    Dinosaur save(Dinosaur dinosaur);

    List<Dinosaur> list();
}
