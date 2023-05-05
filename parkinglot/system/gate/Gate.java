package parkinglot.system.gate;

public abstract class Gate {
    private String id;
    
    public Gate(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
