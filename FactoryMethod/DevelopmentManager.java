package FactoryMethod;

public class DevelopmentManager extends HrManager{

	@Override
	public Interviewer makInterviewer() {
		return new Developer();
	}

}
