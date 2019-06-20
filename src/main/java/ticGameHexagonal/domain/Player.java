package ticGameHexagonal.domain;

class Player {

   private String name;
   private Symbol symbol;

    Player(String name, Symbol givenSymbol) throws InvalidSymbolException {
        this.name = name;
        this.symbol = givenSymbol;
    }



}


