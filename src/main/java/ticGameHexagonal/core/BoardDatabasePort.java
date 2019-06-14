package ticGameHexagonal.core;



public interface BoardDatabasePort {
    void putSymbol(String symbol);
   boolean checkForWin(String playersName);
   String [][]showBoard();


}
