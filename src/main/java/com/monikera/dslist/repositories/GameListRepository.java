package com.monikera.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monikera.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
