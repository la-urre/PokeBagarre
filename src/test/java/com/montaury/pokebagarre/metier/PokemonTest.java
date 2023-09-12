package com.montaury.pokebagarre.metier;
import static com.montaury.pokebagarre.fixtures.ConstructeurDePokemon.unPokemon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    public void devrait_etre_vainqueur_si_meilleure_attaque_Junit() {
        // GIVEN
        Pokemon premier = unPokemon().avecAttaque(150).construire();
        var second = unPokemon().avecAttaque(100).construire();

        // WHEN
        boolean estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertTrue(estVainqueur, "premier n'est PAS vainqueur de second");
    }
    @Test
    public void devrait_etre_vainqueur_si_meilleure_attaque_AssertJ() {
        // GIVEN
        var premier = unPokemon().avecAttaque(150).construire();
        var second = unPokemon().avecAttaque(100).construire();

        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isTrue();
    }
    @Test
    public void devrait_etre_vainqueur_si_attaque_identique_et_meilleure_defense_AssertJ() {
        // GIVEN
        /*
        var premier = unPokemon().avecAttaque(100).avecDefense(150).construire();
        var second = unPokemon().avecAttaque(100).avecDefense(100).construire();
         */
        var premier = unPokemon().avecDefense(150).construire();    // attaque = 0
        var second = unPokemon().avecDefense(100).construire();     // attaque = 0
        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isTrue();
    }
    @Test
    public void devrait_etre_perdant_si_attaque_identique_et_moins_bonne_defense_AssertJ() {
        // GIVEN
        /*
        var premier = unPokemon().avecAttaque(100).avecDefense(100).construire();
        var second = unPokemon().avecAttaque(100).avecDefense(150).construire();
         */
        var premier = unPokemon().avecDefense(100).construire();    // attaque = 0
        var second = unPokemon().avecDefense(150).construire();     // attaque = 0
        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isFalse();
    }
    @Test
    public void devrait_etre_vainqueur_si_attaque_et_defense_identique_car_joue_en_premier_AssertJ() {
        // GIVEN
        /*
        var premier = unPokemon().avecAttaque(100).avecDefense(100).construire();
        var second = unPokemon().avecAttaque(100).avecDefense(100).construire();
         */
        var premier = unPokemon().construire();    // attaque, defense = 0
        var second = unPokemon().construire();     // attaque, defense = 0
        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(estVainqueur).isTrue();
    }
}