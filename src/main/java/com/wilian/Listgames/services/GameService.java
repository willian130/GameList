package com.wilian.Listgames.services;

import java.util.List;

import com.wilian.Listgames.entities.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wilian.Listgames.Repository.GameRepository;
import com.wilian.Listgames.dto.GameMinDTO;


@Service
public class GameService {

	@Autowired
	private  GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll(); 
        return result.stream()
            .map(x -> new GameMinDTO(x)) 
            .toList();
    }
}
	
 