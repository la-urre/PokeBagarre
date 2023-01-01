package com.montaury.pokebagarre.fixtures;

import com.montaury.pokebagarre.metier.Pokemon;
import com.montaury.pokebagarre.metier.Stats;

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
}
