package FactoryMethod;

public abstract class HrManager {
	public abstract Interviewer makInterviewer();
	
	public void takeInterview()
	{
		this.makInterviewer().askQuestions();
	}
}
