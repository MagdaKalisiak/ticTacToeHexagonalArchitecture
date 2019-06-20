package ticGameHexagonal;

import ticGameHexagonal.domain.CellState;
import ticGameHexagonal.domain.Repository;

public class ArrayRepoAdapter implements Repository {
    private final ArrayRepo arrayRepo;

    public ArrayRepoAdapter(int size) {
        this.arrayRepo= new ArrayRepo(size);
    }



    @Override
    public void setSize(int size) {

    }

    @Override
    public int getSize() {
        return arrayRepo.getSize();
    }

    @Override
    public void addAt(CellState state, int x, int y) {
arrayRepo.addAt(state,x,y);
    }

    @Override
    public CellState getAt(int x, int y) {
      return  arrayRepo.getAt(x,y);
    }

}
