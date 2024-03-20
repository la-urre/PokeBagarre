package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class PokemonTests {

    @Test
    void victoire_du_pokemon1_si_attaque_plus_elevee()
    {
        //GIVEN
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecAttaque(12).construire();

        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecAttaque(11).construire();

        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon1_si_attaque_plus_elevee_ASSERTJ()
    {
        //GIVEN
        assertThat(ConstructeurDePokemon.unPokemon().avecAttaque(12).construire().estVainqueurContre(ConstructeurDePokemon.unPokemon().avecAttaque(11).construire()));
    }

    @Test
    void victoire_du_pokemon2_si_attaque_plus_elevee()
    {
        //GIVEN
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecAttaque(11).construire();

        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecAttaque(10).construire();

        //WHEN
        boolean result = poke2.estVainqueurContre(poke1);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon2_si_attaque_plus_elevee_ASSERTJ()
    {
        //GIVEN
        assertThat(ConstructeurDePokemon.unPokemon().avecAttaque(12).construire().estVainqueurContre(ConstructeurDePokemon.unPokemon().avecAttaque(11).construire()));
    }

    @Test
    void victoire_du_pokemon1_si_defense_plus_elevee()
    {
        //GIVEN
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecDefense(12).construire();
        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecDefense(11).construire();

        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon1_si_defense_plus_elevee_ASSERTJ()
    {
        assertThat(ConstructeurDePokemon.unPokemon().avecDefense(12).construire().estVainqueurContre(ConstructeurDePokemon.unPokemon().avecDefense(11).construire()));
    }

    @Test
    void victoire_du_pokemon2_si_defense_plus_elevee()
    {
        //GIVEN
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecDefense(11).construire();
        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecDefense(12).construire();

        //WHEN
        boolean result = poke2.estVainqueurContre(poke1);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon2_si_defense_plus_elevee_ASSERTJ()
    {
        assertThat(ConstructeurDePokemon.unPokemon().avecDefense(12).construire().estVainqueurContre(ConstructeurDePokemon.unPokemon().avecDefense(11).construire()));
    }

    @Test
    void victoire_du_pokemon1_si_egalite()
    {
        //GIVEN
        Pokemon poke1 = ConstructeurDePokemon.unPokemon().avecDefense(10).construire();
        Pokemon poke2 = ConstructeurDePokemon.unPokemon().avecDefense(10).construire();


        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon1_si_egalite_ASSERTJ()
    {
        //GIVEN
        assertThat(ConstructeurDePokemon.unPokemon().avecAttaque(12).construire().estVainqueurContre(ConstructeurDePokemon.unPokemon().avecAttaque(12).construire()));
    }
}