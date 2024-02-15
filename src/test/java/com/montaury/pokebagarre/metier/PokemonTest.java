package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class PokemonTest {
    @Test
    void devrait_etre_vainqueur_s_il_a_une_meilleure_attaque() {
        // GIVEN
        Pokemon premier = ConstructeurDePokemon.unPokemon().avecAttaque(12).avecDefense(10).construire();
        Pokemon second = ConstructeurDePokemon.unPokemon().avecAttaque(11).avecDefense(10).construire();

        // WHEN
        boolean estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isTrue();
    }

    @Test
    void devrait_etre_perdant_si_il_a_une_moins_bonne_attaque() {
        // GIVEN
        Pokemon premier = ConstructeurDePokemon.unPokemon().avecAttaque(9).avecDefense(10).construire();
        Pokemon second = ConstructeurDePokemon.unPokemon().avecAttaque(11).avecDefense(10).construire();

        // WHEN
        boolean estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isFalse();
    }

    @Test
    void devrait_etre_vainqueur_si_il_a_une_meilleure_defense() {
        // GIVEN
        Pokemon premier = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(12).construire();
        Pokemon second = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(11).construire();

        // WHEN
        boolean estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isTrue();
    }

    @Test
    void devrait_etre_perdant_si_il_a_une_moins_bonne_defense() {
        // GIVEN
        Pokemon premier = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(9).construire();
        Pokemon second = ConstructeurDePokemon.unPokemon().avecAttaque(10).avecDefense(11).construire();

        // WHEN
        boolean estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isFalse();
    }

    @Test
    void devrait_etre_vainqueur_si_il_a_les_memes_attaque_et_defense() {
        // GIVEN
        Pokemon premier = ConstructeurDePokemon.unPokemon().avecAttaque(12).avecDefense(12).construire();
        Pokemon second = ConstructeurDePokemon.unPokemon().avecAttaque(12).avecDefense(12).construire();

        // WHEN
        boolean estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isTrue();
    }
}