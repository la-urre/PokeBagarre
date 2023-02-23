package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    public Pokemon pokemon1;
    @BeforeEach
    public void preparer(){
        pokemon1 = new Pokemon("Joueur1","test", new Stats(180,200));
    }

    @Test
    public void egalite(){
        // GIVEN
        Pokemon pokemon2 = new Pokemon("Joueur 2", "test2", new Stats(180,200));

        // WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        Assertions.assertEquals(true, resultat);
    }
    @Test
    public void joueur1GagneAttaque(){
        // GIVEN
        Pokemon pokemon2 = new Pokemon("Joueur 2", "test2", new Stats(179,200));

        // WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        Assertions.assertEquals(true, resultat);
    }

    @Test
    public void joueur1GagneDefense(){
        // GIVEN
        Pokemon pokemon2 = new Pokemon("Joueur 2", "test2", new Stats(180,199));

        // WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        Assertions.assertEquals(true, resultat);
    }

    @Test
    public void joueur2GagneAttaque(){
        // GIVEN
        Pokemon pokemon2 = new Pokemon("Joueur 2", "test2", new Stats(181,200));

        // WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        Assertions.assertEquals(false, resultat);
    }

    @Test
    public void joueur2GagneDefense(){
        // GIVEN
        Pokemon pokemon2 = new Pokemon("Joueur 2", "test2", new Stats(180,201));

        // WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        Assertions.assertEquals(false, resultat);
    }

}