class Box
{
	double width;
	double height;
	double depth;

	Box()
	{
		//System.out.println("Constructing Box");
		width = -1;
		height = -1;
		depth = -1;
	}

	Box(Box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	Box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}

	Box(double len)	// cube
	{
		width = height = depth = len;
	}

	// display volume of a box
	/*void volume()
	{
		System.out.print("Volume is ");
		System.out.println(width * height * depth);
	}*/

	// compute and return volume
	double volume()
	{
		return width * height * depth;
	}

	void setDim(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}
}
