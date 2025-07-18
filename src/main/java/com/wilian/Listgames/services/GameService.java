package com.wilian.Listgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilian.Listgames.Projections.GameMinProjection;
import com.wilian.Listgames.Repository.GameRepository;
import com.wilian.Listgames.dto.GameDTO;
import com.wilian.Listgames.dto.GameMinDTO;
import com.wilian.Listgames.entities.Game;


@Service
public class GameService {

	@Autowired
	private  GameRepository gameRepository;
	
    @Transactional(readOnly = true)
	public GameDTO fideById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);	
	}
    

    @Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll(); 
        return result.stream()
            .map(x -> new GameMinDTO(x)) 
            .toList();
   }
    
    @Transactional(readOnly = true)
 	public List<GameMinDTO> findByList(Long listId) {
    	List<GameMinProjection> result = gameRepository.searchByList(listId); 
         return result.stream()
             .map(x -> new GameMinDTO(x)) 
             .toList();
     }


	
 }


	
 