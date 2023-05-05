package snakeandladder;

import java.util.HashMap;
import java.util.Map;

import snakeandladder.specialentity.SpecialEntity;

public class Board {
    private int size;
    private Map<Integer, SpecialEntity> specialEntities;

    public Board(int size) {
        this.size = size;
        this.specialEntities = new HashMap<>();
    }

    public int getTotalCells() {
        return this.size;
    }

    public boolean hasSpecialEntity(int position) {
        return specialEntities.containsKey(position);
    }

    public SpecialEntity getSpecialEntity(int position) throws Exception {
        if(!hasSpecialEntity(position)) {
            throw new Exception("No special entity exist!");
        }
        return specialEntities.get(position);
    }

    public void printBoard() {
        System.out.println("Board");
    }

    public void addSepcialEntity(SpecialEntity specialEntity) {
        specialEntities.put(specialEntity.getActionPosition(), specialEntity);
    }
}
