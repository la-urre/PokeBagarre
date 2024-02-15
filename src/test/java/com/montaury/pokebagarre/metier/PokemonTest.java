package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PokemonTest {

    @Test
    void devrait_etre_vainqueur_s_il_a_une_meilleure_attaque() {
        // GIVEN
        var premier = new ConstructeurDePokemon().avecAttaque(2).avecDefense(1).construire();
        var second = new ConstructeurDePokemon().avecAttaque(1).avecDefense(2).construire();

        // WHEN
        var vainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(vainqueur).isEqualTo(true);
    }

    @Test
    void devrait_etre_vainqueur_si_meme_attaque_mais_meilleure_defense() {
        // GIVEN
        var premier = new ConstructeurDePokemon().avecAttaque(1).avecDefense(2).construire();
        var second = new ConstructeurDePokemon().avecAttaque(1).avecDefense(1).construire();

        // WHEN
        var vainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(vainqueur).isEqualTo(true);
    }

    @Test
    void premier_devrait_etre_vainqueur_si_meme_stats() {
        // GIVEN
        var premier = new Pokemon("Mew", "",new Stats(100, 100));
        var second = new Pokemon("Jirachi", "", new Stats(100, 100));

        // WHEN
        var vainqueur = premier.estVainqueurContre(second);

        // THEN
        assertThat(vainqueur).isEqualTo(true);
    }
}