import SimpleFactory.DoorFactory;
import SimpleFactory.WoddenDoor;

public class DoorFactoryTest {
	public static void main(String[] args) {
		WoddenDoor door = DoorFactory.makeWoddenDoor();
		System.out.println(door);
		System.out.println("Updating door");

		door.setHeight(85);
		door.setWidth(110);

		System.out.println(door);
	}
}
