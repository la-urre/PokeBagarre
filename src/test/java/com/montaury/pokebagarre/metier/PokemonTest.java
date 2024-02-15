package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import com.montaury.pokebagarre.webapi.PokeBuildApi;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PokemonTest {
    @Test
    void est_vainqueur_si_meilleur_attaque() {
        // Given
        Pokemon pokemon1 = new ConstructeurDePokemon().avecAttaque(40).construire();
        Pokemon pokemon2 = new ConstructeurDePokemon().avecAttaque(30).construire();
        // When
        boolean resultatBagarre = pokemon1.estVainqueurContre(pokemon2);
        // Then
        assertThat(resultatBagarre).isEqualTo(true);
    }
    @Test
    void est_vainqueur_si_attaque_egale_et_meilleur_defense() {
        // Given
        Pokemon pokemon1 = new ConstructeurDePokemon().avecAttaque(30).avecDefense(40).construire();
        Pokemon pokemon2 = new ConstructeurDePokemon().avecAttaque(30).avecDefense(20).construire();
        // When
        boolean resultatBagarre = pokemon1.estVainqueurContre(pokemon2);
        // Then
        assertThat(resultatBagarre).isEqualTo(true);
    }
    @Test
    void est_vainqueur_si_attaque_et_defense_egale_et_premier_pokemon_saisie() {
        // Given
        Pokemon pokemon1 = new PokeBuildApi().recupererParNom("Mew").join();
        Pokemon pokemon2 = new PokeBuildApi().recupererParNom("Jirachi").join();
        // When
        boolean vainqueurBagarre = pokemon1.estVainqueurContre(pokemon2);
        // Then
        assertThat(vainqueurBagarre).isEqualTo(true);
    }
}