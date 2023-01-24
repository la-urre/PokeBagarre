package com.montaury.pokebagarre.metier;

public class Pokemon {

  // Final : attribut set à la construction de l'objet. Ne peut plus être modifié par la suite (sorte de constante)
  private final String nom;
  private final String urlImage;
  private final Stats stats;

  public Pokemon(String nom, String urlImage, Stats stats) {
    this.nom = nom;
    this.urlImage = urlImage;
    this.stats = stats;
  }

  public String getNom() {
    return nom;
  }

  public String getUrlImage() {
    return urlImage;
  }

  public Stats getStats() {
    return stats;
  }

  public boolean estVainqueurContre(Pokemon autrePokemon) {
    var statsPremier = getStats();
    var statsSecond = autrePokemon.getStats();
    return statsPremier.getAttaque() > statsSecond.getAttaque()
      || statsPremier.getAttaque() == statsSecond.getAttaque() && statsPremier.getDefense() >= statsSecond.getDefense();
  }
}
