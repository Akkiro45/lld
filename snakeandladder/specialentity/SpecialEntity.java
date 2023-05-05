package snakeandladder.specialentity;

public abstract class SpecialEntity {
    private SpecialEntities type;
    private int start;
    private int end;

    public SpecialEntity(int start, int end, SpecialEntities type) {
        this.start = start;
        this.end = end;
        this.type = type;
    }

    public int getActionPosition() {
        return this.start;
    }

    public int getEndPosition() {
        return this.end;
    }

    public SpecialEntities getType() {
        return this.type;
    }
}
