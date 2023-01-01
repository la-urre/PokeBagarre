package com.montaury.pokebagarre.ui;

import javafx.application.Application;
import javafx.stage.Stage;

public class PokeBagarreApp extends Application {

  private final EcranSaisie ecranSaisie = new EcranSaisie();

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("C'est l'heure de la PokeBagarre!");
    primaryStage.setScene(ecranSaisie.getScene());
    primaryStage.show();
  }
}
