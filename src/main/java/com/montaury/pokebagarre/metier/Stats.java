package com.montaury.pokebagarre.metier;

public class Stats {
  private final int attaque;
  private final int defense;

  public Stats(int attaque, int defense) {
    this.attaque = attaque;
    this.defense = defense;
  }

  public int getAttaque() {
    return attaque;
  }

  public int getDefense() {
    return defense;
  }

}
