package net.javaguides.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/card")
public class CardController {

	@GetMapping("")
	public String card(Model model) {
		return "card";
	}

}
