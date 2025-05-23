package com.wilian.Listgames.Controller;

import java.util.List;

import com.wilian.Listgames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilian.Listgames.dto.GameMinDTO;
import com.wilian.Listgames.entities.Game;



@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping
	  public List<GameMinDTO> findAll() {
	    return gameService.findAll();
		
	
		
	}
}
