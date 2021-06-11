package hu.progmasters.dinopark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DinoParkApp {

    /*
     1. Absztrakciók, azaz minták (tervrajzok), azaz osztályok. Ennek a finomhangolása a példányosítás.

     2. Encapsulation - nagy erőssége, hogy nem csak az összetartozó adatokat foglalja egybe
     (ezt egy relációs adatbázis is tudja),
     hanem a metódusokat is, azaz, amit az adatokkal lehet csinálni.
     Akkor működik jól, ha ezekhez az adatokhoz nem is adunk ktlen hozzáférést kívülről.

     2.1. Loose Coupling (Encapsulation része): ez a jó, amikor laza összeköttetése van az osztályoknak, azaz nem,
     vagy minimálisan függnek egymástól.

     2.2. Tight Coupling: osztályok közti szoros összeköttetés. Nem jó, mert egy osztályon végzett módosítás
     hullámként söpör végig több, tőle függő osztályon.

     3. Öröklődés.

     4. Polimorfizmus.
    */

    public static void main(String[] args) {
        SpringApplication.run(DinoParkApp.class);
    }
}
