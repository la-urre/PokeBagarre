package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.montaury.pokebagarre.metier.Pokemon;

public class PokemonTests {
    @Test
    private void unPokemonEstVainqueurContreUnAutreAvecUneAttaqueMoinsForteMaisUneDefensePlusForte() {
        Pokemon pokemon1 = ConstructeurDePokemon.unPokemon().avecAttaque(8).avecDefense(15).construire();
        Pokemon pokemon2 = ConstructeurDePokemon.unPokemon().avecAttaque(9).avecDefense(10).construire();


        // Le vainqueur est le pokemon 2
        Assertions.assertTrue(pokemon2.estVainqueurContre(pokemon1));

    }
}
