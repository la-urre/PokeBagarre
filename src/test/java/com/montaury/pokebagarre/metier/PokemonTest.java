package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PokemonTest {
    private static ConstructeurDePokemon constructeurDePokemon;

    @BeforeAll
    static void prepare()
    {
        constructeurDePokemon = new ConstructeurDePokemon();
    }

    @Test
    void tester_get_nom_pikachu()
    {
        // GIVEN
        Pokemon pokemon1 = new Pokemon("Pikachu","", new Stats(0,0));

        // WHEN
        String nom = pokemon1.getNom();

        // THEN
        assertThat(nom).isEqualTo("Pikachu");
    }

    @Test
    void tester_get_urlImage_pikachu()
    {
        // GIVEN
        Pokemon pokemon1 = new Pokemon("","img/Pikachu.png", new Stats(0,0));

        // WHEN
        String nom = pokemon1.getUrlImage();

        // THEN
        assertThat(nom).isEqualTo("img/Pikachu.png");
    }

    @Test
    void tester_pokemon_meilleure_attaque_j1_gagne()
    {
        // GIVEN
        constructeurDePokemon.avecAttaque(200).avecDefense(100);
        Pokemon pokemon1 = constructeurDePokemon.construire();
        constructeurDePokemon.avecAttaque(100).avecDefense(50);
        Pokemon pokemon2 = constructeurDePokemon.construire();

        // WHEN
        boolean gagne = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        assertThat(gagne).isEqualTo(true);
    }

    @Test
    void tester_pokemon_meilleure_attaque_j1_perd()
    {
        // GIVEN
        constructeurDePokemon.avecAttaque(100).avecDefense(50);
        Pokemon pokemon1 = constructeurDePokemon.construire();
        constructeurDePokemon.avecAttaque(200).avecDefense(100);
        Pokemon pokemon2 = constructeurDePokemon.construire();

        // WHEN
        boolean gagne = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        assertThat(gagne).isEqualTo(false);
    }

    @Test
    void tester_pokemon_meme_attaque_defense_differente_j1_gagne()
    {
        // GIVEN
        constructeurDePokemon.avecAttaque(200).avecDefense(110);
        Pokemon pokemon1 = constructeurDePokemon.construire();
        constructeurDePokemon.avecAttaque(200).avecDefense(100);
        Pokemon pokemon2 = constructeurDePokemon.construire();

        // WHEN
        boolean gagne = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        assertThat(gagne).isEqualTo(true);
    }

    @Test
    void tester_pokemon_meme_attaque_defense_differente_j1_perd()
    {
        // GIVEN
        constructeurDePokemon.avecAttaque(200).avecDefense(100);
        Pokemon pokemon1 = constructeurDePokemon.construire();
        constructeurDePokemon.avecAttaque(200).avecDefense(110);
        Pokemon pokemon2 = constructeurDePokemon.construire();

        // WHEN
        boolean gagne = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        assertThat(gagne).isEqualTo(false);
    }

    @Test
    void tester_pokemon_meme_attaque_meme_defense_j1_gagne()
    {
        // GIVEN
        constructeurDePokemon.avecAttaque(200).avecDefense(100);
        Pokemon pokemon1 = constructeurDePokemon.construire();
        constructeurDePokemon.avecAttaque(200).avecDefense(100);
        Pokemon pokemon2 = constructeurDePokemon.construire();

        // WHEN
        boolean gagne = pokemon1.estVainqueurContre(pokemon2);

        // THEN
        assertThat(gagne).isEqualTo(true);
    }
}