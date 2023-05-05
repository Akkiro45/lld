package vendingmachine.state;

import vendingmachine.Machine;

public class DispatchState extends State {
    public DispatchState(Machine machine) {
        super(machine);
    }

    public void getItem() throws Exception {
        this.getMachine().setState(new IdelState(this.getMachine()));
    }
}
