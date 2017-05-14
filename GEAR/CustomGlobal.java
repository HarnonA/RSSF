package projects.GEAR;

import jsensor.runtime.AbsCustomGlobal;

public class CustomGlobal extends AbsCustomGlobal{
	
    @Override
    public boolean hasTerminated() {
        return false;
    }
    
    @Override
    public void preRun() {
    }
    
    @Override
	public void postRun() {
	}

    @Override
    public void preRound() {
    }

    @Override
    public void postRound() {
    }
}
