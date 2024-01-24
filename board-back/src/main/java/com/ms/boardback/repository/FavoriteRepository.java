package com.ms.boardback.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ms.boardback.repository.resultSet.GetFavoriteListResultSet;
import com.ms.boardback.entity.FavoriteEntity;
import com.ms.boardback.entity.primaryKey.FavoritePk;

public interface FavoriteRepository extends JpaRepository<FavoriteEntity, FavoritePk> {

    FavoriteEntity findByBoardNumberAndUserEmail(Integer boardNumber, String userEmail);

    @Query(
        value = 
        "SELECT " +
        "   U.email AS email, " +
        "   U.nickname AS nickname, " +
        "   U.profile_image AS profile_image " +
        "FROM favorite AS F " + 
        "INNER JOIN user AS U " +
        "ON F.user_email = U.email " +
        "WHERE F.board_number = ?1",
        nativeQuery=true
    )
    List<GetFavoriteListResultSet> getFavoriteList(Integer boardNumber);

    @Transactional
    void deleteByBoardNumber(Integer boardNumber);
}
