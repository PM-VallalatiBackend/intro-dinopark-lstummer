package hu.progmasters.dinopark.repository;

import hu.progmasters.dinopark.domain.Dinosaur;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class DinoRepositoryInMemory implements DinoRepository{

    private Map<Integer, Dinosaur> dinosaurs = new HashMap<>();
    private int lastIndexUsed = 0;

    @Override
    public Dinosaur save(Dinosaur dinosaur) {
        lastIndexUsed++;
        dinosaur.setId(lastIndexUsed);
        dinosaurs.put(lastIndexUsed, dinosaur);
        return dinosaur;
    }

    @Override
    public List<Dinosaur> list() {
        return dinosaurs.values().stream()
                .sorted((firstDino, secondDino) -> firstDino.getId().compareTo(secondDino.getId()))
                .collect(Collectors.toList());
    }
}
