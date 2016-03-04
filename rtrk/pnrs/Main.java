package rtrk.pnrs;

import rtrk.pnrs.cats.*;


public class Main
{
	public static void main(String[] args)
	{
		Cat[] cats = { new Lion(), new Domestic() };

		for (int i = 0; i < cats.length; i++)
			System.out.println("Ova macka kaze " + cats[i].say());
	}
}
