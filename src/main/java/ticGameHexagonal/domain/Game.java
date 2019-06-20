package ticGameHexagonal.domain;

class Game {

    private final int size;
    private final Player playerOne;
    private final Player playerTwo;
    private Repository repository;

    Game(int size, Player playerOne, Player playerTwo) throws InvalidSizeException {
        this.size = size;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

    }

    static Game newGameInstance(Input input) throws InvalidSizeException, InvalidSymbolException {
        int validatedSize = validateSize(input.getSize());
        Symbol validatedPlayerOneSymbol = validateSymbol(input.getPlayerOneSymbol());
        Player playerOne = new Player(input.getPlayerOneName(), validatedPlayerOneSymbol);
        Player playerTwo = new Player(input.getPlayerTwoName(), calculatePlayerTwoSymbol(validatedPlayerOneSymbol));
        Repository repository =s
        return new Game(validatedSize, playerOne, playerTwo);
    }

    private static int validateSize(int size) throws InvalidSizeException {
        if (isValidatedSize(size)) {
            return size;
        }
        throw new InvalidSizeException("The size is incorrect. The number of rows should be from 3 to 10");
    }

    private static boolean isValidatedSize(int givenNumber) {
        return givenNumber >= 3 && givenNumber <= 10;
    }

    private static Symbol calculatePlayerTwoSymbol(Symbol playerOneSymbol) {
        if (playerOneSymbol == Symbol.X) {
            return Symbol.O;
        } else {
            return Symbol.X;
        }
    }

    private static Symbol validateSymbol(String symbol) throws InvalidSymbolException {
        if (isCorrectSymbol(symbol)) {
            return Symbol.valueOf(symbol.toUpperCase());
        }
        throw new InvalidSymbolException("The symbol should be O or X");
    }

    private static boolean isCorrectSymbol(String givenSymbol) {
        return givenSymbol.equalsIgnoreCase("O") || givenSymbol.equalsIgnoreCase("X");
    }
//
   // todo
    private static Repository setRepository(int size,Repository repository) {
        repository.setSize();
        return repository

    }


    Repository<CellState> getRepository() {
        return repository;
    }

    void deliverEmptyBoard() {
        for (int i = 1; i < repository.getSize() + 1; i++) {
            for (int j = 1; j < repository.getSize() + 1; j++) {
                repository.addAt(CellState.EMPTY, i, j);
            }
        }
    }
}