package rtrk.pnrs.cats;

import rtrk.pnrs.food.Portion;

public class Lion extends Cat
{
	public String say()
	{
		return "Roar";
	}

	public void feed(Portion p)
	{
		p.setFood(p.getFood() - 2);
	}

	public void pet()
	{
		System.out.println("Lion");
	}
}
