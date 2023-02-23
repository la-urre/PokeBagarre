package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PokemonTest {

    static protected Pokemon cePokemon;
    static protected Stats cePokemonStats;
    static protected Pokemon autrePokemon;
    static protected Stats autrePokemonStats;

    // TEST 1
    @Test
    void should_return_true_for_pikachu1515_vs_pachirisu_1017(){
        // GIVEN
        cePokemonStats = new Stats(15,15);
        cePokemon = new Pokemon("pikachu", "", cePokemonStats);
        autrePokemonStats = new Stats(10,17);
        autrePokemon = new Pokemon("pachirisu","", autrePokemonStats);

        // WHEN
        Boolean retour = cePokemon.estVainqueurContre(autrePokemon);

        // THEN
        Assertions.assertEquals(true, retour);
    }

    // TEST 1-2
    @Test
    void should_return_false_for_pachirisu_1017_vs_pikachu1515(){
        // GIVEN
        cePokemonStats = new Stats(10,17);
        cePokemon = new Pokemon("pachirisu","", cePokemonStats);
        autrePokemonStats = new Stats(15,15);
        autrePokemon = new Pokemon("pikachu", "", autrePokemonStats);

        // WHEN
        Boolean retour = cePokemon.estVainqueurContre(autrePokemon);

        // THEN
        Assertions.assertEquals(false, retour);
    }

    // TEST 2
    @Test
    void should_return_true_for_tortipousse_1017_vs_piafabec_1010(){
        // GIVEN
        cePokemonStats = new Stats(10,17);
        cePokemon = new Pokemon("tortipousse","", cePokemonStats);
        autrePokemonStats = new Stats(10,10);
        autrePokemon = new Pokemon("piafabec", "", autrePokemonStats);

        // WHEN
        Boolean retour = cePokemon.estVainqueurContre(autrePokemon);

        // THEN
        Assertions.assertEquals(true, retour);
    }

    // TEST 2-2
    @Test
    void should_return_false_for_piafabec_1010_vs_tortipousse_1017(){
        // GIVEN
        cePokemonStats = new Stats(10,10);
        cePokemon = new Pokemon("piafabec","", cePokemonStats);
        autrePokemonStats = new Stats(10,17);
        autrePokemon = new Pokemon("tortipousse", "", autrePokemonStats);

        // WHEN
        Boolean retour = cePokemon.estVainqueurContre(autrePokemon);

        // THEN
        Assertions.assertEquals(false, retour);
    }

    // TEST 3
    @Test
    void should_return_true_for_riolu_2525_vs_keunotor_2525(){
        // GIVEN
        cePokemonStats = new Stats(25,25);
        cePokemon = new Pokemon("riolu","", cePokemonStats);
        autrePokemonStats = new Stats(25,25);
        autrePokemon = new Pokemon("keunotor", "", autrePokemonStats);

        // WHEN
        Boolean retour = cePokemon.estVainqueurContre(autrePokemon);

        // THEN
        Assertions.assertEquals(true, retour);
    }

}