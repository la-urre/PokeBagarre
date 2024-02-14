package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTests {

    @Test
    void victoire_du_pokemon1_si_attaque_plus_elevee()
    {
        //GIVEN
        Pokemon poke1 = new Pokemon("Patrice", "https://www.pokepedia.fr/images/2/2b/Miniature_0470_DEPS.png", new Stats(11, 5));
        Pokemon poke2 = new Pokemon("Solène", "https://img.pokemondb.net/sprites/brilliant-diamond-shining-pearl/normal/groudon.png", new Stats(10, 5));
        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon2_si_attaque_plus_elevee()
    {
        //GIVEN
        Pokemon poke1 = new Pokemon("Patrice", "", new Stats(11, 5));
        Pokemon poke2 = new Pokemon("Solène", "", new Stats(12, 5));
        //WHEN
        boolean result = poke2.estVainqueurContre(poke1);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon1_si_defense_plus_elevee()
    {
        //GIVEN
        Pokemon poke1 = new Pokemon("Patrice", "", new Stats(11, 7));
        Pokemon poke2 = new Pokemon("Solène", "", new Stats(11, 5));
        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon2_si_defense_plus_elevee()
    {
        //GIVEN
        Pokemon poke1 = new Pokemon("Patrice", "", new Stats(11, 5));
        Pokemon poke2 = new Pokemon("Solène", "", new Stats(11, 8));
        //WHEN
        boolean result = poke2.estVainqueurContre(poke1);
        //THEN
        assert result = true : "C'est cool";
    }

    @Test
    void victoire_du_pokemon1_si_egalite()
    {
        //GIVEN
        Pokemon poke1 = new Pokemon("Patrice", "", new Stats(11, 5));
        Pokemon poke2 = new Pokemon("Solène", "", new Stats(11, 5));
        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assert result = true : "C'est cool";
    }
}