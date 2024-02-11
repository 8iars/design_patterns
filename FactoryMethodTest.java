import FactoryMethod.DevelopmentManager;
import FactoryMethod.TestingManager;

public class FactoryMethodTest {
	public static void main(String[] args) {
		DevelopmentManager dManager = new DevelopmentManager();
		dManager.takeInterview();

		TestingManager tManager = new TestingManager();
		tManager.takeInterview();
	}
}
