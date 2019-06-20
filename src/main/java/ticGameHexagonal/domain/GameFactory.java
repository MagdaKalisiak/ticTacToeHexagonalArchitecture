package ticGameHexagonal.domain;

import java.util.Optional;

class GameFactory {


    Optional<Game> createNewGame(Input input) {
        Optional<Game> game = Optional.empty();
        try {
            game = Optional.ofNullable(Game.newGameInstance(input));
        } catch (InvalidSizeException | InvalidSymbolException e) {
            e.printStackTrace();
        }

        return game;

    }
}