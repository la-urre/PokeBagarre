package com.montaury.pokebagarre.fixtures;
import static org.assertj.core.api.Assertions.*;

import com.montaury.pokebagarre.metier.Pokemon;
import com.montaury.pokebagarre.metier.Stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructeurDePokemon {
  private int attaque;
  private int defense;

  public static ConstructeurDePokemon unPokemon() {
    return new ConstructeurDePokemon();
  }

  public ConstructeurDePokemon avecAttaque(int attaque) {
    this.attaque = attaque;
    return this;
  }

  public ConstructeurDePokemon avecDefense(int defense) {
    this.defense = defense;
    return this;
  }

  public Pokemon construire() {
    return new Pokemon("Nom", "", new Stats(attaque, defense));
  }


  @Test
  void premier_plus_fort_gagne() {
    // GIVEN
    Stats stats = new Stats(20, 20);
    Stats stats2 = new Stats(10, 10);
    Pokemon pokemon = new Pokemon("Pikachu", "url", stats);
    Pokemon pokemon2 = new Pokemon("Pikachu", "url", stats2);
    // WHEN
    Boolean bool = pokemon.estVainqueurContre(pokemon2);
    // THEN

    //Assertions.assertEquals(true,bool);
    assertThat(bool).isEqualTo(true);
  }

  @Test
  void premier_moins_fort_perd() {
    // GIVEN
    Stats stats = new Stats(10, 10);
    Stats stats2 = new Stats(20, 20);
    Pokemon pokemon = new Pokemon("Pikachu", "url", stats);
    Pokemon pokemon2 = new Pokemon("Pikachu", "url", stats2);
    // WHEN
    Boolean bool = pokemon.estVainqueurContre(pokemon2);
    // THEN

    //Assertions.assertEquals(false,bool);
    assertThat(bool).isEqualTo(false);
  }

  @Test
  void deuxieme_plus_fort_gagne() {
    // GIVEN
    Stats stats = new Stats(10, 10);
    Stats stats2 = new Stats(20, 20);
    Pokemon pokemon = new Pokemon("Pikachu", "url", stats);
    Pokemon pokemon2 = new Pokemon("Pikachu", "url", stats2);
    // WHEN
    Boolean bool = pokemon.estVainqueurContre(pokemon2);
    // THEN

    //Assertions.assertEquals(false,bool);
    assertThat(bool).isEqualTo(false);
  }

  @Test
  void deuxieme_moins_fort_perd() {
    // GIVEN
    Stats stats = new Stats(20, 20);
    Stats stats2 = new Stats(10, 10);
    Pokemon pokemon = new Pokemon("Pikachu", "url", stats);
    Pokemon pokemon2 = new Pokemon("Pikachu", "url", stats2);
    // WHEN
    Boolean bool = pokemon.estVainqueurContre(pokemon2);
    // THEN

    //Assertions.assertEquals(true,bool);
    assertThat(bool).isEqualTo(true);
  }
  @Test
  void premier_egale_deuxieme_gagne() {
    // GIVEN
    Stats stats = new Stats(10, 10);
    Stats stats2 = new Stats(10, 10);
    Pokemon pokemon = new Pokemon("Pikachu", "url", stats);
    Pokemon pokemon2 = new Pokemon("Pikachu", "url", stats2);
    // WHEN
    Boolean bool = pokemon.estVainqueurContre(pokemon2);
    // THEN

    //Assertions.assertEquals(true,bool);
    assertThat(bool).isEqualTo(true);

  }









}
