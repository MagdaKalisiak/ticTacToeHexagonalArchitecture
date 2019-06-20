package ticGameHexagonal.domain;

import java.util.Optional;

class GameFactory {


    Optional<Game> createNewGame(Input input,Repository repository) {
        Optional<Game> game = Optional.empty();
        try {
            game = Optional.ofNullable(Game.newGameInstance(input,repository));
        } catch (InvalidSizeException | InvalidSymbolException e) {
            e.printStackTrace();
        }

        return game;

    }
}