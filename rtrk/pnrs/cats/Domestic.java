package rtrk.pnrs.cats;

import rtrk.pnrs.food.Portion;

public class Domestic extends Cat
{
	public String say()
	{
		return "Meow";
	}

	public void feed(Portion p)
	{
		p.setFood(p.getFood() - 1);
	}

	public void pet()
	{
		System.out.println("Domestic");
	}
}
