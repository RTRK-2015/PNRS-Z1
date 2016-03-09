package rtrk.pnrs.cats;

import rtrk.pnrs.food.*;

public abstract class Cat
{
	public abstract String say();
	
	public abstract void feed(Portion p);
	
	public void feed(Portion p, IEatingListener callback)
	{
		p.setFood(0);
		callback.onEatingFinished(this);
	}

	public void pet()
	{
		System.out.println("Cat");
	}
}
