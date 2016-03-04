package rtrk.pnrs;

import rtrk.pnrs.food.Portion;


public class Main
{
	public static void main(String[] args)
	{
		Portion p = new Portion();

		try
		{
			p.setFood(3);
			System.out.println("Trenutna porcija " + p.getFood());
			p.setFood(-1);
			System.out.println("Trenutna porcija " + p.getFood());
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
