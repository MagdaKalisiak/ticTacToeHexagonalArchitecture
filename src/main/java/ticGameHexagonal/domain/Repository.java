package ticGameHexagonal.domain;

import ticGameHexagonal.domain.CellState;

public interface Repository<Cellstate> {
void  setSize(int size);
    int getSize();
    void addAt(CellState state,int x, int y);
    CellState getAt(int x,int y);
}
