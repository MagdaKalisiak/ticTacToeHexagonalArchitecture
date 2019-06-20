package ticGameHexagonal;

import ticGameHexagonal.domain.CellState;
import ticGameHexagonal.domain.Repository;

public class Board implements Repository<CellState> {

    private CellState[][] board;
    private int size;

    public Board(int size) {
        this.board = new CellState[size][size];
        this.size = size;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void addAt(CellState state, int x, int y) {
        board[x - 1][y - 1] = state;
    }

    @Override
    public CellState getAt(int x, int y) {
        return board[x - 1][y - 1];
    }
}











