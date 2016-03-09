package rtrk.pnrs;

import rtrk.pnrs.cats.*;
import rtrk.pnrs.food.*;


public class Main
{
	public static void main(String[] args)
	{
		Cat[] cats = { new Lion(), new Domestic() };
		Portion p = new Portion();
		Listener l = new Listener();

		try
		{
			p.setFood(5);
			for (int i = 0; i < cats.length; i++)
				cats[i].feed(p);
			System.out.println("Hrane ostalo " + p.getFood());

			p.setFood(2);
			for (int i = 0; i < cats.length; i++)
                                cats[i].feed(p);
			System.out.println("Hrane ostalo " + p.getFood());			
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Nedozvoljeni argument " + e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("Doslo je do nepoznate greske " + e.getMessage());
		}
	}
}
