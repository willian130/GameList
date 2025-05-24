package com.wilian.Listgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilian.Listgames.Repository.GameListRepository;
import com.wilian.Listgames.dto.GameListDTO;
import com.wilian.Listgames.entities.GameList;


@Service
public class GameListService {

	@Autowired
	private  GameListRepository gameListRepository;	
	

    @Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll(); 
        return result.stream()
            .map(x -> new GameListDTO(x)) 
            .toList();
    }
}
	
 