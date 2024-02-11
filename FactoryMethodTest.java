import FactoryMethod.DevelopmentManager;
import FactoryMethod.HrManager;
import FactoryMethod.TestingManager;

public class FactoryMethodTest {
	public static void main(String[] args) {
		HrManager hrManager = new DevelopmentManager();
		hrManager.takeInterview();
		//hrManager.sayName();
		//The method sayName() is undefined for the type HrManager. 
		//Calling child method from parent class doesn't work.

		hrManager = new TestingManager();
		hrManager.takeInterview();
	}
}
