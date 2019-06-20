package ticGameHexagonal.domain;

import java.util.Optional;

public class GameFasade {
   private Input input;
   private Game game;

    public GameFasade(Input input) {
        this.input = input;
    }

    public void startGame(Input input, Repository repository) {
        GameFactory gameFactory = new GameFactory();
        Optional<Game> gameOpt = gameFactory.createNewGame(input);
        setGame(gameOpt);
        setRepository(repository);
        game.deliverEmptyBoard();
    }


    public void setGame(Optional<Game> gameOpt) {
        if (gameOpt.isPresent()) {
            this.game = gameOpt.get();
        }
    }

    public void setRepository(Repository repository) {
        game.setRepository(repository);
    }


    //todo zastap metode get repo jakims dto
    public Repository<CellState> getRepo() {
        return game.getRepository();
    }

}