package hu.progmasters.dinopark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DinoParkApp {

/*
Modell/Domain: azok az erősebb fogalmaink, amikkel dolgozunk. Adatbázisba vannak mentve, vagy a logikában
jelennek meg. Főnevek az üzleti logikában.

Dto: a domain-hez hasonlóan adathordozásra szolgáló osztályok. Ők a kisebbek, lazábban értelmezettek.
Arra vannak, hogy az összetartozó adatokat tudjuk egyben kezelni és csak dobálgatni jobbra-balra.
 */

    public static void main(String[] args) {
        SpringApplication.run(DinoParkApp.class);
    }
}
