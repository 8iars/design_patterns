import AbstractFactory.Door;
import AbstractFactory.IronDoorFactory;
import AbstractFactory.WoodDoorFactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		WoodDoorFactory woodDoorFactory = new WoodDoorFactory();
		System.out.println(woodDoorFactory.makeDoor().getDescription());
		System.out.println(woodDoorFactory.makeDoorExpert().getDescription());

		IronDoorFactory ironDoorFactory = new IronDoorFactory();
		System.out.println(ironDoorFactory.makeDoor().getDescription());
		System.out.println(ironDoorFactory.makeDoorExpert().getDescription());

		Door door = woodDoorFactory.makeDoor(); //Calling WoodDoor through Door
		System.out.println(door.getDescription());
	}
}
