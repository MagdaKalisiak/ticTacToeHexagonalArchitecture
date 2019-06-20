package ticGameHexagonal.domain;

public class Input
{

    private int size;
    private String playerOneName;
    private String playerOneSymbol;
    private String playerTwoName;

     int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

     String getPlayerOneName() {
        return playerOneName;
    }

    public void setPlayerOneName(String playerOneName) {
        this.playerOneName = playerOneName;
    }

     String getPlayerOneSymbol() {
        return playerOneSymbol;
    }

    public void setPlayerOneSymbol(String playerOneSymbol) {
        this.playerOneSymbol = playerOneSymbol;
    }

     String getPlayerTwoName() {
        return playerTwoName;
    }

    public void setPlayerTwoName(String playerTwoName) {
        this.playerTwoName = playerTwoName;
    }
}
