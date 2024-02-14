package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    public void test_pokemon1_gagne_avec_meilleure_attaque()
    {
        //GIVEN
        Pokemon leH = new Pokemon("leH", "leH.png", new Stats(200, 100) );
        Pokemon staline = new Pokemon("staline", "staline.png", new Stats(180, 120));

        //WHEN
        boolean est_vainqueur = leH.estVainqueurContre(staline);

        //THEN
        assertEquals(true, est_vainqueur);
    }

    @Test
    public void test_pokemon2_gagne_avec_meilleure_attaque()
    {
        //GIVEN
        Pokemon leH = new Pokemon("leH", "leH.png", new Stats(100, 100) );
        Pokemon staline = new Pokemon("staline", "staline.png", new Stats(180, 120));

        //WHEN
        boolean est_vainqueur = leH.estVainqueurContre(staline);

        //THEN
        assertEquals(false, est_vainqueur);
    }

    @Test
    public void test_pokemon1_gagne_avec_meilleure_defense_quand_attaque_egale()
    {
        //GIVEN
        Pokemon leH = new Pokemon("leH", "leH.png", new Stats(100, 100) );
        Pokemon staline = new Pokemon("staline", "staline.png", new Stats(100, 90));

        //WHEN
        boolean est_vainqueur = leH.estVainqueurContre(staline);

        //THEN
        assertEquals(true, est_vainqueur);
    }

    @Test
    public void test_pokemon2_gagne_avec_meilleure_defense_quand_attaque_egale()
    {
        //GIVEN
        Pokemon leH = new Pokemon("leH", "leH.png", new Stats(100, 100) );
        Pokemon staline = new Pokemon("staline", "staline.png", new Stats(100, 190));

        //WHEN
        boolean est_vainqueur = leH.estVainqueurContre(staline);

        //THEN
        assertEquals(false, est_vainqueur);
    }

    @Test
    public void test_pokemon1_gagne_quand_meme_stats()
    {
        //GIVEN
        Pokemon leH = new Pokemon("leH", "leH.png", new Stats(100, 100) );
        Pokemon staline = new Pokemon("staline", "staline.png", new Stats(100, 100));

        //WHEN
        boolean est_vainqueur = leH.estVainqueurContre(staline);

        //THEN
        assertEquals(true, est_vainqueur);
    }
}