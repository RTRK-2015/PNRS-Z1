package rtrk.pnrs.food;

public class Portion
{
	public void setFood(float food) throws IllegalArgumentException
	{
		if (food < 0)
			throw new IllegalArgumentException("food mora biti >= 0");

		mFood = food;
	}

	public float getFood()
	{
		return mFood;
	}

	
	private mFood;
}
