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
	}
}
