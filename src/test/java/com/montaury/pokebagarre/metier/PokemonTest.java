package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void est_vainqueur_contre_doit_retourner_pouleto_vainqueur_car_attaque_superieur() {
        // GIVEN
        Stats statPokemon1 = new Stats (150, 168);
        Pokemon pokemon1 = new Pokemon("pouleto", "image/url", statPokemon1);
        Stats statPokemon2 = new Stats (100, 100);
        Pokemon pokemon2 = new Pokemon("astregon", "image2/url", statPokemon2);
        // WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);
        // THEN
        assertEquals (true, resultat);

    }
    @Test
    void est_vainqueur_contre_doit_retourner_pouleto_vainqueur_car_defense_superieur() {
        // GIVEN
        Stats statPokemon1 = new Stats (150, 168);
        Pokemon pokemon1 = new Pokemon("pouleto", "image/url", statPokemon1);
        Stats statPokemon2 = new Stats (150, 100);
        Pokemon pokemon2 = new Pokemon("astregon", "image2/url", statPokemon2);
        // WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);
        // THEN
        assertEquals (true, resultat);
    }
    @Test
    void est_vainqueur_contre_doit_retourner_pouleto_vainqueur_car_priorite() {
        // GIVEN
        Stats statPokemon1 = new Stats (150, 168);
        Pokemon pokemon1 = new Pokemon("pouleto", "image/url", statPokemon1);
        Stats statPokemon2 = new Stats (150, 168);
        Pokemon pokemon2 = new Pokemon("astregon", "image2/url", statPokemon2);
        // WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);
        // THEN
        assertEquals (true, resultat);
    }
}