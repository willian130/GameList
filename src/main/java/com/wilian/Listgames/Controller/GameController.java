package com.wilian.Listgames.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilian.Listgames.dto.GameDTO;
import com.wilian.Listgames.dto.GameMinDTO;
import com.wilian.Listgames.services.GameService;



@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping (value = "/{id}")
	  public GameDTO findById(@PathVariable Long id) {
	    GameDTO result = gameService.fideById(id);
	    return result;
	}

	@GetMapping
	  public List<GameMinDTO> findAll() {
	    return gameService.findAll();
			
	}
}
