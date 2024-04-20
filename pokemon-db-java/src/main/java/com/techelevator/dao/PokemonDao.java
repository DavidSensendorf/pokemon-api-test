package com.techelevator.dao;

import com.techelevator.models.PokemonDetail;

import java.util.List;

public interface PokemonDao {

    PokemonDetail saveFavorites(PokemonDetail detail, int userId);
    List<PokemonDetail> getAllFavorites(int userId);
}
