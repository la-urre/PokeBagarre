package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokemonTest {
    @BeforeEach
    

    @Test
    public void pokemon1Attaque_SUP_Pokemon2Attaque() {
    // GIVEN
        Pokemon p1 = new Pokemon("Rayquaza", "bibi", new Stats(10, 10));
        Pokemon p2 = new Pokemon("Pikachu", "bibi", new Stats(9, 10));
    // WHEN
    if(p1.getStats().getAttaque() > p2.getStats().getAttaque()){
        System.out.println("pokemon1Attaque_SUP_Pokemon2Attaque valide");
    }else{
        System.out.println("pokemon1Attaque_SUP_Pokemon2Attaque non valide");
    }
    // THEN
    
    }
    @Test
    public void pokemon2Attaque_SUP_Pokemon1Attaque() {
        // GIVEN
        Pokemon p2 = new Pokemon("Rayquaza", "bibi", new Stats(10, 10));
        Pokemon p1 = new Pokemon("Pikachu", "bibi", new Stats(9, 10));
        // WHEN
        if(p1.getStats().getAttaque() < p2.getStats().getAttaque()){
            System.out.println("pokemon2Attaque_SUP_Pokemon1Attaque valide");
        }else{
            System.out.println("pokemon2Attaque_SUP_Pokemon1Attaque non valide");
        }
    }
    

    @Test
    public void pokemon1Attaque_EGALE_Pokemon2Attaque() {
        // GIVEN
        Pokemon p1 = new Pokemon("Rayquaza", "bibi", new Stats(10, 10));
        Pokemon p2 = new Pokemon("Pikachu", "bibi", new Stats(10, 10));
        // WHEN
        if(p1.getStats().getAttaque() == p2.getStats().getAttaque()){
            System.out.println("pokemon1Attaque_EGALE_Pokemon2Attaque valide");
        }else{
            System.out.println("pokemon1Attaque_EGALE_Pokemon2Attaque non valide");
        }
        // THEN
    
    }
    @Test
    public void pokemon1Attaque_EGALE_Pokemon2Attaque_ET_pokemon1Def_SUP_pokemon2Def() {
        // GIVEN
        Pokemon p1 = new Pokemon("Rayquaza", "bibi", new Stats(10, 11));
        Pokemon p2 = new Pokemon("Pikachu", "bibi", new Stats(10, 10));
        // WHEN
        if(p1.getStats().getAttaque() == p2.getStats().getAttaque()){
            if(p1.getStats().getDefense() > p2.getStats().getDefense())
                System.out.println("pokemon1Attaque_EGALE_Pokemon2Attaque_ET_pokemon1Def_SUP_pokemon2Def valide");
            else
                System.out.println("pokemon1Attaque_EGALE_Pokemon2Attaque_ET_pokemon1Def_SUP_pokemon2Def non valide");
        }
        // THEN

    }
    @Test
    public void pokemon1Attaque_EGALE_Pokemon2Attaque_ET_pokemon2Def_SUP_pokemon1Def() {
        // GIVEN
        Pokemon p1 = new Pokemon("Rayquaza", "bibi", new Stats(10, 10));
        Pokemon p2 = new Pokemon("Pikachu", "bibi", new Stats(10, 11));
        // WHEN
        if(p1.getStats().getAttaque() == p2.getStats().getAttaque()){
            if(p1.getStats().getDefense() < p2.getStats().getDefense())
                System.out.println("pokemon1Attaque_EGALE_Pokemon2Attaque_ET_pokemon1Def_SUP_pokemon2Def valide");
            else
                System.out.println("pokemon1Attaque_EGALE_Pokemon2Attaque_ET_pokemon1Def_SUP_pokemon2Def non valide");
        }
        // THEN
    
    }
    @Test
    public void pokemon1Attaque_EGALE_Pokemon2Attaque_ET_pokemon2Def_EGALE_pokemon1Def() {        // GIVEN
        Pokemon p1 = new Pokemon("Rayquaza", "bibi", new Stats(10, 10));
        Pokemon p2 = new Pokemon("Pikachu", "bibi", new Stats(10, 10));
        // WHEN
        if(p1.getStats().getAttaque() == p2.getStats().getAttaque()){
            if(p1.getStats().getDefense() == p2.getStats().getDefense())
                System.out.println("pokemon1Attaque_EGALE_Pokemon2Attaque_ET_pokemon2Def_EGALE_pokemon1Def valide");
            else
                System.out.println("pokemon1Attaque_EGALE_Pokemon2Attaque_ET_pokemon2Def_EGALE_pokemon1Def non valide");
        }
        // THEN
    
    }

}