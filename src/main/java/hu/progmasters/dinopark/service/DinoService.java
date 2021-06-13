package hu.progmasters.dinopark.service;

import hu.progmasters.dinopark.domain.DinoType;
import hu.progmasters.dinopark.domain.Dinosaur;
import hu.progmasters.dinopark.dto.DinoCreateCommand;
import hu.progmasters.dinopark.dto.DinoInfo;
import hu.progmasters.dinopark.repository.DinoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DinoService {

    // A Spring-ben designed by interface-el dolgozunk.
    private DinoRepository dinoRepository;

    /*
     Spring 5 óta már nem kötelező kiírni az @Autowired annotációt!
     */
    public DinoService(DinoRepository dinoRepository) {
        this.dinoRepository = dinoRepository;
    }

    /*
    A Service rétegben szokás domain object-eket dto-kká konvertálgatni.
     */
    public DinoInfo save(DinoCreateCommand command) {

        // A commandból megcsinálni a Dinosaurt
        Dinosaur dinosaur = convertToDinosaur(command);

        // Elmenteni a repository-ba a Dinosaurt
        Dinosaur dinosaurSaved = dinoRepository.save(dinosaur);

        // A visszakapott elmentett példányt átalakítani DinoInfová
        return convertToInfo(dinosaurSaved);
    }

    public List<DinoInfo> list() {
        return dinoRepository.list().stream()
                .map(dinosaur -> convertToInfo(dinosaur))
                .collect(Collectors.toList());
    }

    private Dinosaur convertToDinosaur(DinoCreateCommand command) {
        return new Dinosaur()
                .setName(command.getName())
                .setBreed(command.getBreed())
                .setDinoType(DinoType.valueOf(command.getType().toUpperCase()));
    }

    private DinoInfo convertToInfo(Dinosaur dinosaur) {
        return new DinoInfo()
                .setId(dinosaur.getId())
                .setName(dinosaur.getName())
                .setBreed(dinosaur.getBreed())
                .setDinoType(dinosaur.getDinoType().name().toLowerCase());
    }
}
