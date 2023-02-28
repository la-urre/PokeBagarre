package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static com.montaury.pokebagarre.fixtures.ConstructeurDePokemon.unPokemon;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PokemonTest {



    @Test
    void should_the_first_to_be_the_strongest_and_win(){
        //GIVEN
        var pokemon1 = unPokemon().avecAttaque(100).construire();
        var pokemon2 = unPokemon().avecAttaque(50).construire();
        //WHEN
        boolean winner = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertTrue(winner);
    }

    @Test
    void should_the_second_to_be_the_strongest_and_win(){
        //GIVEN
        var pokemon1 = unPokemon().avecAttaque(50).construire();
        var pokemon2 = unPokemon().avecAttaque(100).construire();
        //WHEN
        boolean winner = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertFalse(winner);
    }

    @Test
    void should_the_first_to_have_the_higher_defense_and_win(){
        //GIVEN
        var pokemon1 = unPokemon().avecDefense(100).construire();
        var pokemon2 = unPokemon().avecDefense(50).construire();
        //WHEN
        boolean winner = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertTrue(winner);
    }

    @Test
    void should_the_second_to_have_the_higher_defense_and_win(){
        //GIVEN
        var pokemon1 = unPokemon().avecDefense(50).construire();
        var pokemon2 = unPokemon().avecDefense(100).construire();
        //WHEN
        boolean winner = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertFalse(winner);
    }

    @Test
    void should_both_have_equals_stats_so_the_first_win(){
        //GIVEN
        var pokemon1 = unPokemon().avecAttaque(50).avecDefense(50).construire();
        var pokemon2 = unPokemon().avecAttaque(50).avecDefense(50).construire();
        //WHEN
        boolean winner = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertTrue(winner);
    }

}