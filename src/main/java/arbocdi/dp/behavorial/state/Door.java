package arbocdi.dp.behavorial.state;

import lombok.Setter;

public class Door {
    @Setter
    private DoorState state;

    public Door(DoorState state) {
        this.state = state;
    }

    public void handle(Command.OpenDoor command) {
        state.handle(this, command);
    }

    public void handle(Command.CloseDoor command) {
        state.handle(this, command);
    }
}
