/*package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat; // AssertTthat()

class PokemonTestAssertJ {
    @Test
    void pokemon_qui_a_meilleure_attaque_devrait_gagner() {
    // GIVEN
            Pokemon pkmn1 = new Pokemon("PkmnA", "PokeAPI/sprites/pokemon/pkmna.png",  new Stats(100, 50));
            Pokemon pkmn2 = new Pokemon("PkmnB", "PokeAPI/sprites/pokemon/pkmnb.png",  new Stats(50, 100));
    // WHEN
            boolean bagarreGagne = pkmn1.estVainqueurContre(pkmn2);
    // THEN
            assertEquals(true, bagarreGagne);
    }


    @Test
    void pokemon_avec_meme_attaque_meilleure_defense_devrait_gagner() {
        // GIVEN
        Pokemon pkmn1 = new Pokemon("PkmnA", "PokeAPI/sprites/pokemon/pkmna.png",  new Stats(100, 100));
        Pokemon pkmn2 = new Pokemon("PkmnB", "PokeAPI/sprites/pokemon/pkmnb.png",  new Stats(100, 50));
        // WHEN
        boolean bagarreGagne = pkmn1.estVainqueurContre(pkmn2);
        // THEN
        assertEquals(true, bagarreGagne);
    }


    @Test
    void pokemon_avec_meme_attaque_et_defense_le_premier_entre_devrait_gagner() {
        // GIVEN
        Pokemon pkmn1 = new Pokemon("PkmnA", "PokeAPI/sprites/pokemon/pkmna.png",  new Stats(100, 100));
        Pokemon pkmn2 = new Pokemon("PkmnB", "PokeAPI/sprites/pokemon/pkmnb.png",  new Stats(100, 100));
        // WHEN
        boolean bagarreGagneA = pkmn1.estVainqueurContre(pkmn2);
        // THEN
        assertEquals(true, bagarreGagneA);
    }

}*/