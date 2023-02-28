package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {



    @Test
    void should_the_first_to_be_the_strongest_and_win(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(100).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(50).construire();

        //WHEN
        boolean winner = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertEquals(true, winner);
    }

    @Test
    void should_the_second_to_be_the_strongest_and_win(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(50).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(100).construire();
        //WHEN
        boolean winner = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertEquals(false, winner);
    }

    @Test
    void should_the_first_to_have_the_higher_defense_and_win(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(100).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(50).construire();
        //WHEN
        boolean winner = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertEquals(true,winner);
    }

    @Test
    void should_the_second_to_have_the_higher_defense_and_win(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(50).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(100).construire();
        //WHEN
        boolean winner = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertEquals(false,winner);
    }

    @Test
    void should_both_have_equals_stats_so_the_first_win(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(50).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(50).construire();
        //WHEN
        boolean winner = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertEquals(true,winner);
    }

}