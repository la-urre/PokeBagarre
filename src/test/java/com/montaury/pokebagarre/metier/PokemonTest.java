package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
        @Test
        void test_de_la_victoire_pokemon1_attaque_superieure()
    {
        //GIVEN

        Stats stat1 = new Stats(20,20);
        Pokemon pokemon1 = new Pokemon("pikachu1", "",stat1);

        Stats stat2 = new Stats(10,10);
        Pokemon pokemon2 = new Pokemon("pikachu2", "",stat2);

        //WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertEquals(true, resultat);


    }
    @Test
    void test_pokemon_avec_la_pire_defense_perd()
    {
        //GIVEN

        Stats stat1 = new Stats(20,20);
        Pokemon pokemon1 = new Pokemon("pikachu1", "",stat1);

        Stats stat2 = new Stats(10,10);
        Pokemon pokemon2 = new Pokemon("pikachu2", "",stat2);

        //WHEN
        boolean resultat = pokemon2.estVainqueurContre(pokemon1);
        //THEN
        assertEquals(false, resultat);


    }
    @Test
    void test_de_la_victoire_pokemon1_avec_meme_attaque_mais_meilleure_defense()
    {
        //GIVEN

        Stats stat1 = new Stats(20,20);
        Pokemon pokemon1 = new Pokemon("pikachu1", "",stat1);

        Stats stat2 = new Stats(20,10);
        Pokemon pokemon2 = new Pokemon("pikachu2", "",stat2);

        //WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertEquals(true, resultat);


    }
    @Test
    void test_de_la_defaite_pokemon_avec_meme_attaque_mais_pire_defense()
    {
        //GIVEN
        Pokemon pokemon1 = new Pokemon("pikachu1", "",new Stats(20,20));

        Stats stat2 = new Stats(20,10);
        Pokemon pokemon2 = new Pokemon("pikachu2", "",stat2);

        //WHEN
        boolean resultat = pokemon2.estVainqueurContre(pokemon1);
        //THEN
        assertEquals(false, resultat);


    }
    @Test
    void test_du_pokemon_saisi_en_premier_quand_meme_attaque_et_defense()
    {
        //GIVEN

        Stats stat1 = new Stats(20,20);
        Pokemon pokemon1 = new Pokemon("pikachu1", "",stat1);

        Stats stat2 = new Stats(20,20);
        Pokemon pokemon2 = new Pokemon("pikachu2", "",stat2);

        //WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertEquals(true, resultat);


    }
}