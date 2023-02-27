package com.montaury.pokebagarre.metier;

public class StatsTests {
  private final int attaque;
  private final int defense;

  public StatsTests(int attaque, int defense) {
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
