package com.montaury.pokebagarre.metier;

public class Stats {
  // Final : attribut set à la construction de l'objet. Ne peut plus être modifié par la suite (sorte de constante)
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
