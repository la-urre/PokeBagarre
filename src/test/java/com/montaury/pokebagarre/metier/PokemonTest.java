package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    public void meilleureAttaque() {
        //GIVEN
        Pokemon pokemonGagnant = ConstructeurDePokemon.unPokemon().avecAttaque(1).avecDefense(1).construire();
        Pokemon pokemonPerdant = ConstructeurDePokemon.unPokemon().avecAttaque(0).avecDefense(1).construire();

        //WHEN
        Boolean bagarre = pokemonGagnant.estVainqueurContre(pokemonPerdant);

        //THEN
        assertTrue(bagarre);
    }

    @Test
    public void pireAttaque() {
        //GIVEN
        Pokemon pokemonGagnant = ConstructeurDePokemon.unPokemon().avecAttaque(1).avecDefense(1).construire();
        Pokemon pokemonPerdant = ConstructeurDePokemon.unPokemon().avecAttaque(0).avecDefense(1).construire();

        //WHEN
        Boolean bagarre = pokemonPerdant.estVainqueurContre(pokemonGagnant);

        //THEN
        assertFalse(bagarre);
    }

    @Test
    public void meilleureDefence() {
        //GIVEN
        Pokemon pokemonGagnant = ConstructeurDePokemon.unPokemon().avecAttaque(1).avecDefense(1).construire();
        Pokemon pokemonPerdant = ConstructeurDePokemon.unPokemon().avecAttaque(1).avecDefense(0).construire();

        //WHEN
        Boolean bagarre = pokemonGagnant.estVainqueurContre(pokemonPerdant);

        //THEN
        assertTrue(bagarre);
    }

    @Test
    public void pireDefence() {
        //GIVEN
        Pokemon pokemonGagnant = ConstructeurDePokemon.unPokemon().avecAttaque(1).avecDefense(1).construire();
        Pokemon pokemonPerdant = ConstructeurDePokemon.unPokemon().avecAttaque(1).avecDefense(0).construire();

        //WHEN
        Boolean bagarre = pokemonPerdant.estVainqueurContre(pokemonGagnant);

        //THEN
        assertFalse(bagarre);
    }

    @Test
    public void PremierRenseigne() {
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(1).avecDefense(1).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(1).avecDefense(1).construire();

        //WHEN
        Boolean bagarre = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assertTrue(bagarre);
    }

}