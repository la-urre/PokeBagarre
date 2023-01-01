package com.montaury.pokebagarre.webapi;

import com.google.gson.Gson;
import com.montaury.pokebagarre.erreurs.ErreurBagarre;
import com.montaury.pokebagarre.erreurs.ErreurRecuperationPokemon;
import com.montaury.pokebagarre.metier.Pokemon;
import com.montaury.pokebagarre.metier.Stats;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

public class PokeBuildApi {
  private static final String URL_BASE_API_PRODUCTION = "https://pokebuildapi.fr/";
  private final String urlBaseApi;

  public PokeBuildApi() {
    this(URL_BASE_API_PRODUCTION);
  }

  public PokeBuildApi(String urlBaseApi) {
    this.urlBaseApi = urlBaseApi;
  }

  public CompletableFuture<Pokemon> recupererParNom(String nom) throws ErreurBagarre {
    return HttpClient.newHttpClient().sendAsync(HttpRequest.newBuilder()
        .uri(getWebApiUri(nom.trim()))
        .build(), HttpResponse.BodyHandlers.ofString())
      .thenApply(reponseHttp -> essayerDeConvertirReponse(nom, reponseHttp));

  }

  private URI getWebApiUri(String nom) {
    try {
      return new URI(urlBaseApi + "api/v1/pokemon/" + URLEncoder.encode(nom.toLowerCase(), StandardCharsets.UTF_8));
    } catch (URISyntaxException e) {
      throw new ErreurRecuperationPokemon(nom);
    }
  }

  private Pokemon essayerDeConvertirReponse(String nom, HttpResponse<String> reponse) {
    var statut = reponse.statusCode();
    if (statut < 200 || statut >= 300) {
      throw new ErreurRecuperationPokemon(nom);
    }

    var pokemonPayload = new Gson().fromJson(reponse.body(), PokemonPayload.class);
    return new Pokemon(pokemonPayload.name, pokemonPayload.sprite, new Stats(pokemonPayload.stats.attack, pokemonPayload.stats.defense));
  }

  private static class PokemonPayload {
    private String name;
    private String sprite;
    private PokemonStatsPayload stats;

    private static class PokemonStatsPayload {
      private int attack;
      private int defense;
    }
  }
}
