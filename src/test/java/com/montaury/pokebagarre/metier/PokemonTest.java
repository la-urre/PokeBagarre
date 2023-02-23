package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


class PokemonTest {
@Test
    void lePremierEstPlusFort(){
    //GIVEN
    Stats stat1 = new Stats(5,6);
    Stats stat2 = new Stats(4,6);
    Pokemon poke1 = new Pokemon("Eduardo", "", stat1);
    Pokemon poke2 = new Pokemon("Romain", "", stat2);

    //THEN
    poke1.estVainqueurContre(poke2);

    //THEN
}
}