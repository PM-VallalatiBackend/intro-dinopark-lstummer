package hu.progmasters.dinopark.repository;

import hu.progmasters.dinopark.domain.DinoType;
import hu.progmasters.dinopark.domain.Dinosaur;

import java.util.List;

public interface DinoRepository {

// Ne feledjük, hogy minden Interface metódus public abstract,
// amit nem kell kiírni.

    public abstract Dinosaur save(Dinosaur dinosaur);

    List<Dinosaur> list();

    List<Dinosaur> getByType(DinoType dinoType);
}
