package com.monikera.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monikera.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
