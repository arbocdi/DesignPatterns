package arbocdi.dp.behavorial.state;

public class Client {
    public static void main(String[] args) {
        Door door = new Door(new DoorState.Closed());
        door.handle(new Command.OpenDoor());
        door.handle(new Command.OpenDoor());
        door.handle(new Command.CloseDoor());
    }
}
