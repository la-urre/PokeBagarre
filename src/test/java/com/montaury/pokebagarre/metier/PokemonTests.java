package com.montaury.pokebagarre.metier;

import javafx.scene.control.TextField;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTests {
    @Test
    void doit_renvoyer_le_pokemon1_avec_plus_grande_attaque(){
        //GIVEN
        Stats statsAttFortes = new Stats(100,100);
        Stats statsAttFaibles = new Stats(20,100);
        Pokemon pokemon1 = new Pokemon("PokemonFort","/image.png",statsAttFortes);
        Pokemon pokemon2 = new Pokemon("PokemonFaible","/image.png",statsAttFaibles);

        //WHEN
        boolean estVainqueur = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assert estVainqueur == true;
    }

    @Test
    void doit_renvoyer_le_pokemon2_avec_plus_grande_attaque(){
        //GIVEN
        Stats statsAttFortes = new Stats(100,100);
        Stats statsAttFaibles = new Stats(20,100);
        Pokemon pokemon1 = new Pokemon("PokemonFaible","/image.png",statsAttFaibles);
        Pokemon pokemon2 = new Pokemon("PokemonFort","/image.png",statsAttFortes);

        //WHEN
        boolean estVainqueur = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assert estVainqueur == false;
    }

    @Test
    void doit_renvoyer_le_pokemon1_avec_plus_grande_defense(){
        //GIVEN
        Stats statsDefFortes = new Stats(100,100);
        Stats statsDefFaibles = new Stats(100,20);
        Pokemon pokemon1 = new Pokemon("PokemonFort","/image.png",statsDefFortes);
        Pokemon pokemon2 = new Pokemon("PokemonFaible","/image.png",statsDefFaibles);

        //WHEN
        boolean estVainqueur = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assert estVainqueur == true;
    }

    @Test
    void doit_renvoyer_le_pokemon2_avec_plus_grande_defense(){
        //GIVEN
        Stats statsDefFortes = new Stats(100,100);
        Stats statsDefFaibles = new Stats(100,20);
        Pokemon pokemon1 = new Pokemon("PokemonFaible","/image.png",statsDefFaibles);
        Pokemon pokemon2 = new Pokemon("PokemonFort","/image.png",statsDefFortes);

        //WHEN
        boolean estVainqueur = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assert estVainqueur == false;
    }

    @Test
    void doit_renvoyer_le_premier_pokemon_car_meme_stats(){
        //GIVEN
        Stats stats = new Stats(100,100);
        Stats statsIdem = new Stats(100,100);
        Pokemon pokemon1 = new Pokemon("PokemonFort","/image.png",stats);
        Pokemon pokemon2 = new Pokemon("PokemonFaible","/image.png",statsIdem);

        //WHEN
        boolean estVainqueur = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        assert estVainqueur == true;
    }
}
