package kz.edu.nu.cs.exercise;

public class State2 extends State{
	protected StateContext sc;
    protected boolean accept = false;
    
	public State2(StateContext stateContext) {
		this.sc = stateContext; 
	}
	public void actionA() {
		this.sc.setCurrentState(this.sc.getState3());
    }

    public void actionB() {
    	this.sc.setCurrentState(this.sc.getState1());
    }

    public boolean isAccept() {
        return this.accept;
    }
}
	

