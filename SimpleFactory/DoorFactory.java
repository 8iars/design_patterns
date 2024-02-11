package SimpleFactory;

public class DoorFactory {
	public static Door makeWoddenDoor()
	{
		return new WoddenDoor(81.6f, 120.0f);
	}
}
