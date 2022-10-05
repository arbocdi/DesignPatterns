package arbocdi.dp.behavorial.state;

public interface DoorState {
    void handle(Door door, Command.OpenDoor command);
    void handle(Door door, Command.CloseDoor command);


    class Closed implements DoorState{
        @Override
        public void handle(Door door, Command.OpenDoor command) {
            System.out.println("Opening door.");
            door.setState(new Opened());
        }

        @Override
        public void handle(Door door, Command.CloseDoor command) {
            System.out.println("The door is already closed.");
        }
    }
    class Opened implements DoorState{
        @Override
        public void handle(Door door, Command.OpenDoor command) {
            System.out.println("The door is already opened.");
        }

        @Override
        public void handle(Door door, Command.CloseDoor command) {
            System.out.println("Closing door.");
        }
    }
}
