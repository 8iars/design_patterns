package AbstractFactory;

public class IronDoorFactory implements DoorFactory{

	@Override
	public Door makeDoor() {
		return new IronDoor();
	}

	@Override
	public DoorExpert makeDoorExpert() {
		return new IronDoorExpert();
	}
	
}
