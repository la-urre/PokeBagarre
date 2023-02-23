package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void meilleur_attaque_win(){
        //GIVEN
        Pokemon poke1 = new Pokemon("Matis", "dhzhd", new Stats(12, 10));
        Pokemon poke2 = new Pokemon("Titouan", "dhzhd", new Stats(10, 10));
        //WHEN & THEN
        assertEquals(true, poke1.estVainqueurContre(poke2));
    }
    @Test
    void moins_attaque_perds(){
        //GIVEN
        Pokemon poke1 = new Pokemon("Matis", "dhzhd", new Stats(10, 10));
        Pokemon poke2 = new Pokemon("Titouan", "dhzhd", new Stats(15, 10));
        //WHEN & THEN
        assertEquals(false, poke1.estVainqueurContre(poke2));
    }
    @Test
    void meme_attaque_meilleurs_defense_win(){
        //GIVEN
        Pokemon poke1 = new Pokemon("Matis", "dhzhd", new Stats(10, 12));
        Pokemon poke2 = new Pokemon("Titouan", "dhzhd", new Stats(10, 10));
        //WHEN & THEN
        assertEquals(true, poke1.estVainqueurContre(poke2));
    }
    @Test
    void meme_attaque_moins_bonne_defense_perds(){
        //GIVEN
        Pokemon poke1 = new Pokemon("Matis", "dhzhd", new Stats(10, 10));
        Pokemon poke2 = new Pokemon("Titouan", "dhzhd", new Stats(10, 15));
        //WHEN & THEN
        assertEquals(false, poke1.estVainqueurContre(poke2));
    }
    @Test
    void meme_stats_premiers_win(){
        //GIVEN
        Pokemon poke1 = new Pokemon("Matis", "dhzhd", new Stats(10, 10));
        Pokemon poke2 = new Pokemon("Titouan", "dhzhd", new Stats(10, 10));
        //WHEN & THEN
        assertEquals(true, poke1.estVainqueurContre(poke2));
    }

}