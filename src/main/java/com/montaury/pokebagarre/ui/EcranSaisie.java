package com.montaury.pokebagarre.ui;

import com.montaury.pokebagarre.erreurs.ErreurBagarre;
import com.montaury.pokebagarre.metier.Bagarre;
import com.montaury.pokebagarre.metier.Pokemon;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class EcranSaisie {

  private static final Color RED = Color.color(1, 0, 0);
  private TextField nomPokemon1;
  private TextField nomPokemon2;
  private Label labelErreur;
  private Text labelResultat;
  private ProgressIndicator progressIndicator;
  private ImageView imageVainqueur;

  public Scene getScene() {
    var btn = new Button();
    btn.setText("Bagarre!");
    btn.setOnAction(event -> traiterClicBouton());

    var root = new VBox();
    root.setAlignment(Pos.BASELINE_CENTER);
    root.setSpacing(5);
    var inviteNomPokemon1 = new Label("Nom du premier Pokémon");
    nomPokemon1 = new TextField();
    nomPokemon1.setId("nomPokemon1");
    inviteNomPokemon1.setLabelFor(nomPokemon1);
    var inviteNomPokemon2 = new Label("Nom du second Pokémon");
    nomPokemon2 = new TextField();
    nomPokemon2.setId("nomPokemon2");
    inviteNomPokemon2.setLabelFor(nomPokemon2);
    progressIndicator = new ProgressIndicator();
    progressIndicator.setVisible(false);
    labelErreur = new Label();
    labelErreur.setId("resultatErreur");
    labelErreur.setTextFill(RED);
    labelResultat = new Text();
    labelResultat.setId("resultatBagarre");
    imageVainqueur = new ImageView();
    root.getChildren().add(inviteNomPokemon1);
    root.getChildren().add(nomPokemon1);
    root.getChildren().add(inviteNomPokemon2);
    root.getChildren().add(nomPokemon2);
    root.getChildren().add(btn);
    root.getChildren().add(progressIndicator);
    root.getChildren().add(labelErreur);
    root.getChildren().add(labelResultat);
    root.getChildren().add(imageVainqueur);
    return new Scene(root, 450, 300);
  }

  private void traiterClicBouton() {
    labelErreur.setText("");
    labelResultat.setText("");
    imageVainqueur.setImage(null);
    try {
      progressIndicator.setVisible(true);
      demarrerBagarre(nomPokemon1.getText(), nomPokemon2.getText());
    } finally {
      progressIndicator.setVisible(false);
    }
  }

  private void demarrerBagarre(String nomPremierPokemon, String nomSecondPokemon) {
    try {
      // la bagarre se fait de manière asynchrone pour ne pas bloquer la UI
      new Bagarre().demarrer(nomPremierPokemon, nomSecondPokemon)
        .whenComplete(this::terminerBagarre);
    } catch (ErreurBagarre e) {
      labelErreur.setText("Erreur: " + e.getMessage());
    }
  }

  private void terminerBagarre(Pokemon vainqueur, Throwable erreur) {
    // exécuter sur le thread de l'UI
    Platform.runLater(() -> {
      if (erreur != null) {
        labelErreur.setText("Erreur: " + erreur.getCause().getMessage());
        return;
      }
      labelResultat.setText("Le vainqueur est: " + vainqueur.getNom());
      imageVainqueur.setImage(new Image(vainqueur.getUrlImage()));
    });
  }
}
