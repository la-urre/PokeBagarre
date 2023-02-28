package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static com.montaury.pokebagarre.fixtures.ConstructeurDePokemon.unPokemon;
import static org.junit.jupiter.api.Assertions.*;


class PokemonTest {

    @Test
    void EstVainqueur_Si_Attaque_Superieure_A_Attaque_Ennemi() {

        var pokemon = unPokemon().avecAttaque(10).construire();
        var ennemi = unPokemon().avecAttaque(5).construire();

        assertTrue(pokemon.estVainqueurContre(ennemi));
    }

    @Test
    void EstVainqueur_Attaque_Superieure_A_Attaque_Ennemi_Et_Defense_Superieure_A_Defense_Ennemi() {
        var pokemon = unPokemon().avecAttaque(10).avecDefense(10).construire();
        var ennemi = unPokemon().avecAttaque(5).avecDefense(5).construire();

        assertTrue(pokemon.estVainqueurContre(ennemi));
    }

    @Test
    void EstVainqueur_Attaque_Egale_A_Attaque_Ennemi_Et_Defense_Superieure_A_Defense_Ennemi() {
        var pokemon = unPokemon().avecAttaque(10).avecDefense(10).construire();
        var ennemi = unPokemon().avecAttaque(10).avecDefense(5).construire();


        assertTrue(pokemon.estVainqueurContre(ennemi));
    }

    @Test
    void EstVainqueur_Attaque_Superieure_A_Attaque_Ennemi_Et_Defense_Egale_A_Defense_Ennemi() {
        var pokemon = unPokemon().avecAttaque(10).avecDefense(10).construire();
        var ennemi = unPokemon().avecAttaque(5).avecDefense(10).construire();

        assertTrue(pokemon.estVainqueurContre(ennemi));
    }

    @Test
    void EstVainqueur_Attaque_Egale_A_Attaque_Ennemi_Et_Defense_Egale_A_Defense_Ennemi() {
        var pokemon = unPokemon().avecAttaque(10).avecDefense(10).construire();
        var ennemi = unPokemon().avecAttaque(10).avecDefense(10).construire();

        assertTrue(pokemon.estVainqueurContre(ennemi));

    }

}