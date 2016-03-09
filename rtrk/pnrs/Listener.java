package rtrk.pnrs;

import rtrk.pnrs.cats.*;
import rtrk.pnrs.food.*;


public class Listener implements IEatingListener
{
	public void onEatingFinished(Cat cat)
	{
		cat.pet();
	}
}
