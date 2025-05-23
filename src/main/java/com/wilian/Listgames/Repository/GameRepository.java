package com.wilian.Listgames.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilian.Listgames.entities.Game;

 public interface GameRepository extends JpaRepository<Game,Long>{


}
