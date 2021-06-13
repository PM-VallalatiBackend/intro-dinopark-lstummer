package hu.progmasters.dinopark.service;

import hu.progmasters.dinopark.repository.DinoRepository;
import org.springframework.stereotype.Service;

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
}
