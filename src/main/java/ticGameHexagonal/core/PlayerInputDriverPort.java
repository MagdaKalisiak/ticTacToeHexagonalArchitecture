package ticGameHexagonal.core;

public interface PlayerInputDriverPort {
   String givePlayerName();
   String givePlayersSymbol();
   int giveBoardWidth();
   int [] putSymbolAt(String symbol);


}
