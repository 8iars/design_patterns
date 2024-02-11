import SimpleFactory.Door;
import SimpleFactory.DoorFactory;

public class DoorFactoryTest {
	public static void main(String[] args) {
		Door door = DoorFactory.makeWoddenDoor();
		System.out.println(door);
		// System.out.println("Updating door");

		// door.setHeight(85);
		// door.setWidth(110);

		// System.out.println(door);
	}
}
