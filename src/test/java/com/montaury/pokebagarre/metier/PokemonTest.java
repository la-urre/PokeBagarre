package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;
import com.montaury.pokebagarre.metier.Pokemon;
import com.montaury.pokebagarre.metier.Stats;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class PokemonTest {
    @Test
    void le_pokemon1_avec_la_meilleure_attaque_gagne() {
        // GIVEN
        Stats gagnant = new Stats(150,20);
        Pokemon poke1 = new Pokemon("Mew","url",gagnant);

        Stats perdant = new Stats(20,150);
        Pokemon poke2 = new Pokemon("Racaillou","url2",perdant);
        // WHEN
        boolean vainqueur = poke1.estVainqueurContre(poke2);

        // THEN
        //assertEquals(true,vainqueur);
        assertThat(vainqueur).isTrue();
    }

    @Test
    void le_pokemon1_avec_la_meilleure_attaque_gagne_avec_fixtures() {
        // GIVEN
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(50).construire(); // Pokemon GAGNANT
        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecAttaque(50).avecDefense(100).construire();  // Pokemon PERDANT

        // WHEN
        boolean vainqueur = poke1.estVainqueurContre(poke2);
        // THEN
        //assertEquals(true,vainqueur);
        assertThat(vainqueur).isTrue();
    }

    @Test
    void le_pokemon1_avec_la_meilleure_defense_gagne_lorsque_les_deux_pokemon_ont_la_meme_attaque() {
        // GIVEN
        Stats gagnant = new Stats(100,200);
        Pokemon poke1 = new Pokemon("Mew","url",gagnant);

        Stats perdant = new Stats(100,10);
        Pokemon poke2 = new Pokemon("Racaillou","url",perdant);
        //WHEN
        boolean vainqueur = poke1.estVainqueurContre(poke2);

        // THEN
        //assertEquals(true, vainqueur);
        assertThat(vainqueur).isTrue();
    }

    @Test
    void le_pokemon1_avec_la_meilleure_defense_gagne_lorsque_les_deux_pokemon_ont_la_meme_attaque_avec_fixture() {
        // GIVEN
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(200).construire();
        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(20).construire();
        //WHEN
        boolean vainqueur = poke1.estVainqueurContre(poke2);

        // THEN
        //assertEquals(true, vainqueur);
        assertThat(vainqueur).isTrue();
    }

    @Test
    void le_pokemon1_gagne_lorsque_les_deux_pokemon_ont_la_meme_attaque_et_meme_defense() {
        // GIVEN
        Stats identique1 = new Stats(100,100);
        Pokemon poke1 = new Pokemon("Mew","url",identique1);

        Stats identique2 = new Stats(100,100);
        Pokemon poke2 = new Pokemon("Racaillou","url",identique2);

        // WHEN
        boolean vainqueur = poke1.estVainqueurContre(poke2);

        // THEN
        //assertEquals(true,vainqueur);
        assertThat(vainqueur).isTrue();
    }

    @Test
    void le_pokemon1_gagne_lorsque_les_deux_pokemon_ont_la_meme_attaque_et_meme_defense_avec_fixture() {
        // GIVEN
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(100).construire();
        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecAttaque(100).avecDefense(100).construire();

        // WHEN
        boolean vainqueur = poke1.estVainqueurContre(poke2);

        // THEN
        //assertEquals(true,vainqueur);
        assertThat(vainqueur).isTrue();
    }
}