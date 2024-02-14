package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTests {

    @Test
    void victoire_du_pokemon1_si_attaque_plus_elevee()
    {
        //GIVEN
        ConstructeurDePokemon test = new ConstructeurDePokemon();
        test.avecAttaque(11);
        test.avecDefense(5);
        Pokemon poke1 = test.construire();

        ConstructeurDePokemon test2 = new ConstructeurDePokemon();
        test2.avecAttaque(10);
        test2.avecDefense(4);
        Pokemon poke2 = test.construire();

        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon2_si_attaque_plus_elevee()
    {
        //GIVEN
        ConstructeurDePokemon test = new ConstructeurDePokemon();
        test.avecAttaque(9);
        test.avecDefense(5);
        Pokemon poke1 = test.construire();

        ConstructeurDePokemon test2 = new ConstructeurDePokemon();
        test2.avecAttaque(10);
        test2.avecDefense(4);
        Pokemon poke2 = test.construire();

        //WHEN
        boolean result = poke2.estVainqueurContre(poke1);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon1_si_defense_plus_elevee()
    {
        //GIVEN
        ConstructeurDePokemon test = new ConstructeurDePokemon();
        test.avecAttaque(11);
        test.avecDefense(5);
        Pokemon poke1 = test.construire();

        ConstructeurDePokemon test2 = new ConstructeurDePokemon();
        test2.avecAttaque(11);
        test2.avecDefense(4);
        Pokemon poke2 = test.construire();

        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon2_si_defense_plus_elevee()
    {
        //GIVEN
        ConstructeurDePokemon test = new ConstructeurDePokemon();
        test.avecAttaque(10);
        test.avecDefense(5);
        Pokemon poke1 = test.construire();

        ConstructeurDePokemon test2 = new ConstructeurDePokemon();
        test2.avecAttaque(10);
        test2.avecDefense(6);
        Pokemon poke2 = test.construire();

        //WHEN
        boolean result = poke2.estVainqueurContre(poke1);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon1_si_egalite()
    {
        //GIVEN
        ConstructeurDePokemon test = new ConstructeurDePokemon();
        test.avecAttaque(11);
        test.avecDefense(5);
        Pokemon poke1 = test.construire();

        ConstructeurDePokemon test2 = new ConstructeurDePokemon();
        test2.avecAttaque(11);
        test2.avecDefense(5);
        Pokemon poke2 = test.construire();

        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assert result = true : "C'est cool";
    }
}