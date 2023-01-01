package com.montaury.pokebagarre.erreurs;

public class ErreurRecuperationPokemon extends ErreurBagarre {
  public ErreurRecuperationPokemon(String nom) {
    super("Impossible de recuperer les details sur '" + nom + "'");
  }

}