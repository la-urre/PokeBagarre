package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import static com.montaury.pokebagarre.fixtures.ConstructeurDePokemon.*;
import static org.junit.jupiter.api.Assertions.assertTrue;



class PokemonTest {
@Test
    void lePremierEstPlusFort(){
    // Given
    Pokemon premierPokemon = unPokemon()
            .avecAttaque(40)
            .avecDefense(50)
            .construire();

    Pokemon deuxiemePokemon = unPokemon()
            .avecAttaque(30)
            .avecDefense(40)
            .construire();

    // When
    boolean premierPokemonEstPlusFort = premierPokemon.estVainqueurContre(deuxiemePokemon);

    // Then
    assertTrue(premierPokemonEstPlusFort);
}

@Test
    void leSecondEstPlusFort(){
        // Given
        var premierPokemon = unPokemon()
                .avecAttaque(40)
                .construire();

        var deuxiemePokemon = unPokemon()
                .avecAttaque(60)
                .construire();

        // When
        boolean secondPokemonEstPlusFort = deuxiemePokemon.estVainqueurContre(premierPokemon);

        // Then
        assertTrue(secondPokemonEstPlusFort);
    }

    @Test
    void lePremierAUneMeilleureDefense(){

        //Given
        var premierPokemon = unPokemon()
                .avecDefense(50)
                .construire();

        var deuxiemePokemon = unPokemon()
                .avecDefense(40)
                .construire();

        //When

        boolean premierPlusFort = premierPokemon.estVainqueurContre(deuxiemePokemon);

        // Then
            assertTrue(premierPlusFort);

    }

    @Test
    void leSecondAUneMeilleureDefense(){

        //Given
        var premierPokemon = unPokemon()
                .avecDefense(50)
                .construire();

        var deuxiemePokemon = unPokemon()
                .avecDefense(60)
                .construire();

        //When

        boolean deuxiemePlusFort = deuxiemePokemon.estVainqueurContre(premierPokemon);

        // Then
            assertTrue(deuxiemePlusFort);
    }

    @Test
    void lePremierRenseigneGagne(){
        //Given
        var premierPokemon = unPokemon()
                .avecAttaque(50)
                .avecDefense(50)
                .construire();

        var deuxiemePokemon = unPokemon()
                .avecAttaque(50)
                .avecDefense(50)
                .construire();

        //When
        boolean premierPlusFort = premierPokemon.estVainqueurContre(deuxiemePokemon);

        // Then
        assertTrue(premierPlusFort);
    }

}