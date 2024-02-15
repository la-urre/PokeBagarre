package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class PokemonTest {

    @Test
    void pokemon1_gagne_car_meilleur_attaque(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(150).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(100).construire();

        //WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        //assertEquals(true,resultat);
        assertThat(resultat).isTrue();
    }

    @Test
    void pokemon2_gagne_car_meilleur_attaque(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(50).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(200).construire();

        //WHEN
        boolean resultat = pokemon2.estVainqueurContre(pokemon1);

        //THEN
        //assertEquals(true,resultat);
        assertThat(resultat).isTrue();
    }

    @Test
    void deux_pokemon_avec_meme_attaque_pokemon1_gagne_car_meilleur_defense(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(100).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(50).construire();

        //WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        //assertEquals(true,resultat);
        assertThat(resultat).isTrue();
    }

    @Test
    void deux_pokemon_avec_meme_attaque_pokemon2_gagne_car_meilleur_defense(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(50).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(200).construire();

        //WHEN
        boolean resultat = pokemon2.estVainqueurContre(pokemon1);

        //THEN
        //assertEquals(true,resultat);
        assertThat(resultat).isTrue();
    }

    @Test
    void deux_pokemon_ont_meme_defense_et_attaque_mais_pokemon1_gagne_car_premier(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(200).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(200).construire();

        //WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        //assertEquals(true,resultat);
        assertThat(resultat).isTrue();
    }

    @Test
    void deux_pokemon_ont_meme_defense_et_attaque_et_pokemon2_perd_car_deuxieme(){
        //GIVEN
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(200).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(200).construire();

        //WHEN
        boolean resultat = pokemon1.estVainqueurContre(pokemon2);

        //THEN
        //assertEquals(true,resultat);
        assertThat(resultat).isTrue();
    }


}