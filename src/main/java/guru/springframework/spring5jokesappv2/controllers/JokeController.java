package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

	private final JokeServices jokeServices;

	public JokeController(JokeServices jokeServices) {
		this.jokeServices = jokeServices;
	}

	@RequestMapping({"/", ""})
	public String showJoke(Model model) {

		model.addAttribute("joke", jokeServices.getJoke());

		return "index";
	}
}
