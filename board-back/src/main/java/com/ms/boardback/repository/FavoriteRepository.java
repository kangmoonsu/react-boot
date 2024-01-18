package com.ms.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.boardback.entity.FavoriteEntity;
import com.ms.boardback.entity.primaryKey.FavoritePk;

public interface FavoriteRepository extends JpaRepository<FavoriteEntity, FavoritePk>{
    
}
