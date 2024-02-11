package FactoryMethod;

public class TestingManager extends HrManager{

	@Override
	public Interviewer makInterviewer() {
		return new Tester();
	}
	
}
