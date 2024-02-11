package FactoryMethod;

public class DevelopmentManager extends HrManager{

	@Override
	public Interviewer makInterviewer() {
		return new Developer();
	}

	public void sayName()
	{
		System.out.println("I'm developer");
	}

	//sayName() is child class method.
	//Can only be called by Child Object.
	//Even though extends abstract class can have its own methods.
}
