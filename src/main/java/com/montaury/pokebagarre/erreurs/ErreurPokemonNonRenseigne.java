package com.montaury.pokebagarre.erreurs;

public class ErreurPokemonNonRenseigne extends ErreurBagarre {
  public ErreurPokemonNonRenseigne(String position) {
    super("Le " + position + " pokemon n'est pas renseigne");
  }

}