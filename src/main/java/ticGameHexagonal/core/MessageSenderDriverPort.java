package ticGameHexagonal.core;

public interface MessageSenderDriverPort {
    void askForName(Player player);
    void askForSymbol(Player player);
    void askForSize();
    void yourTurn(Player player);
    void wrongInput();
    void gameOver(Player winner);

}
