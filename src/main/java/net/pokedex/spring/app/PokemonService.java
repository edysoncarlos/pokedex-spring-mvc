package net.pokedex.spring.app;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class PokemonService {
	
	private String POKEAPI_URL="https://pokeapi.co/api/v2/pokemon/?limit=151";

	public ArrayList<Pokemon> getPokemons() {

		ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();

		HttpClient client = HttpClient.newHttpClient();

		try {
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(POKEAPI_URL)).build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			JSONObject jsonObject = new JSONObject(response.body());
			JSONArray result = jsonObject.getJSONArray("results");

			for (int i = 0; i <= 150; i++) {
				JSONObject pkm = result.getJSONObject(i);
				String pokename = pkm.getString("name");
				String pokeimg = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/"
						+ (i+1) + ".svg";
				String pokeurl = "https://pokeapi.co/api/v2/pokemon/" + (i+1) + "/";
				Pokemon pokemon = new Pokemon(pokename, pokeurl, pokeimg);
				pokemons.add(pokemon);
			}
			
			return pokemons;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
