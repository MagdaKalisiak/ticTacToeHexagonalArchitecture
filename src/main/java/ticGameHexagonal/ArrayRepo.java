package ticGameHexagonal;

import ticGameHexagonal.domain.CellState;
import ticGameHexagonal.domain.Repository;

public class ArrayRepo {

    private CellState[][] board;
    private int size;

    public ArrayRepo(int size) {
        this.board = new CellState[size][size];
        this.size = size;
    }


    public int getSize() {
        return size;
    }

    public void addAt(CellState state, int x, int y) {
        board[x - 1][y - 1] = state;
    }


    public CellState getAt(int x, int y) {
        return board[x - 1][y - 1];
    }
}











