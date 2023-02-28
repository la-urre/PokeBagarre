package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PokemonTest {
    @Test
    void attaqueDuPlusFort1(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon
                .unPokemon()
                .avecAttaque(80)
                .avecDefense(50)
                .construire();

        Pokemon pokemon2 = ConstructeurDePokemon
                .unPokemon()
                .avecAttaque(50)
                .avecDefense(50)
                .construire();
        //WHEN

        boolean attaqueDuPlusFortBool = pokemon1.getStats().getAttaque() > pokemon2.getStats().getAttaque();
        //THEN
        assertTrue(attaqueDuPlusFortBool);
    }
    @Test
    void attaqueDuPlusFort2(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon
                .unPokemon()
                .avecAttaque(80)
                .avecDefense(50)
                .construire();

        Pokemon pokemon2 = ConstructeurDePokemon
                .unPokemon()
                .avecAttaque(90)
                .avecDefense(50)
                .construire();
        //WHEN

        boolean attaqueDuPlusFortBool = pokemon2.estVainqueurContre(pokemon1);
        //THEN
        assertTrue(attaqueDuPlusFortBool);
    }
    @Test
    void deffenseDuPlusFort1(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon
                .unPokemon()
                .avecAttaque(50)
                .avecDefense(70)
                .construire();

        Pokemon pokemon2 = ConstructeurDePokemon
                .unPokemon()
                .avecAttaque(50)
                .avecDefense(50)
                .construire();
        //WHEN

        boolean attaqueValeurEgal = pokemon1.getStats().getAttaque() == pokemon2.getStats().getAttaque();
        boolean laDeffenseDuplusFort = pokemon1.getStats().getDefense() > pokemon2.getStats().getDefense();
        //THEN
        assertTrue(attaqueValeurEgal);
        assertTrue(laDeffenseDuplusFort);
    }
    @Test
    void deffenseDuPlusFort2(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon
                .unPokemon()
                .avecAttaque(50)
                .avecDefense(50)
                .construire();

        Pokemon pokemon2 = ConstructeurDePokemon
                .unPokemon()
                .avecAttaque(50)
                .avecDefense(80)
                .construire();
        //WHEN

        boolean laDeffenseDuplusFort = pokemon2.estVainqueurContre(pokemon1);
        //THEN
        assertTrue(laDeffenseDuplusFort);
    }
    @Test
    void pokemonRenseigner(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon
                .unPokemon()
                .avecAttaque(50)
                .avecDefense(50)
                .construire();

        Pokemon pokemon2 = ConstructeurDePokemon
                .unPokemon()
                .avecAttaque(50)
                .avecDefense(50)
                .construire();
        //WHEN

        boolean pokemonDonner = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertTrue(pokemonDonner);
    }
}