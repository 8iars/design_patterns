package AbstractFactory;

public class WoodDoorFactory implements DoorFactory{

	@Override
	public Door makeDoor() {
		return new WoodDoor();
	}

	@Override
	public DoorExpert makeDoorExpert() {
		return new WoodDoorExpert();
	}
	
}
