package rtrk.pnrs.cats;

import rtrk.pnrs.food.Portion;

public abstract class Cat
{
	public abstract String say();
	public abstract void feed(Portion p);

	public void pet()
	{
		System.out.println("Cat");
	}
}
