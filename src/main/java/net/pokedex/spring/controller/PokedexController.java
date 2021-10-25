package net.pokedex.spring.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import net.pokedex.spring.app.PokemonService;

@Controller

public class PokedexController {

	@RequestMapping("/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		PokemonService ps = new PokemonService();
		if (ps.getPokemons() != null) {
			return new ModelAndView("pokedex", "pokemonList", ps.getPokemons());
		} else {
			return new ModelAndView("pokedex", "state", "Error Ocurred: Reload or try again later.");
		}

	}

}
