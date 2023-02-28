package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTests {
    @Test
    void should_draw(){
        // GIVEN
        Pokemon pokemon  = new Pokemon("Pikachu", "lala", new Stats(140,140));
        Pokemon pokemon2 = new Pokemon("Mentali", "baba", new Stats(140,140));

        // WHEN
        boolean score = pokemon.estVainqueurContre(pokemon2);
        boolean score2 = pokemon2.estVainqueurContre(pokemon);

        // THEN
        Assertions.assertEquals(true, score);
        Assertions.assertEquals(true, score2);

    }

    @Test
    void should_win_poke1_meilleur_attaque_poke2(){
        // GIVEN
        Pokemon pokemon  = new Pokemon("Pikachu", "lala", new Stats(200,140));
        Pokemon pokemon2 = new Pokemon("Mentali", "baba", new Stats(140,140));

        // WHEN
        boolean score = pokemon.estVainqueurContre(pokemon2);
        boolean score2 = pokemon2.estVainqueurContre(pokemon);

        // THEN
        Assertions.assertEquals(true, score);
        Assertions.assertEquals(false, score2);

    }

    @Test
    void should_win_poke2_meilleur_attaque_poke1(){
        // GIVEN
        Pokemon pokemon  = new Pokemon("Pikachu", "lala", new Stats(200,140));
        Pokemon pokemon2 = new Pokemon("Mentali", "baba", new Stats(250,140));

        // WHEN
        boolean score = pokemon.estVainqueurContre(pokemon2);
        boolean score2 = pokemon2.estVainqueurContre(pokemon);

        // THEN
        Assertions.assertEquals(false, score);
        Assertions.assertEquals(true, score2);
    }

    @Test
    void should_win_poke2_meme_attaque_poke1_meilleur_defense_poke2_que_poke1(){
        // GIVEN
        Pokemon pokemon  = new Pokemon("Pikachu", "lala", new Stats(200,140));
        Pokemon pokemon2 = new Pokemon("Mentali", "baba", new Stats(200,150));

        // WHEN
        boolean score = pokemon.estVainqueurContre(pokemon2);
        boolean score2 = pokemon2.estVainqueurContre(pokemon);

        // THEN
        Assertions.assertEquals(false, score);
        Assertions.assertEquals(true, score2);
    }

    @Test
    void should_win_poke2_meme_attaque_poke1_meilleur_defense_poke1_que_poke2(){
        // GIVEN
        Pokemon pokemon  = new Pokemon("Pikachu", "lala", new Stats(200,150));
        Pokemon pokemon2 = new Pokemon("Mentali", "baba", new Stats(200,140));

        // WHEN
        boolean score = pokemon.estVainqueurContre(pokemon2);
        boolean score2 = pokemon2.estVainqueurContre(pokemon);

        // THEN
        Assertions.assertEquals(true, score);
        Assertions.assertEquals(false, score2);
    }

}