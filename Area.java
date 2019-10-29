/*Write a program to print the area of a rectangle by creating a class
named 'Area' taking the values of its length and breadth as
parameters of its constructor and having a method named
'returnArea' which returns the area of the rectangle. Length and
breadth of rectangle are entered through keyboard*/

class Area
{
	//Creating default instance variables
	int length;
	int breadth;
	//constructor for setting values of instance variables
	Area(int l, int b)
	{
		length=l;
		breadth=b;
	}
	//method named returnArea for calculating area of rectangle
	public int returnArea()
	{
		return length*breadth;
	}
	//creating Main method 
	public static void main(String[] args)
	{
		//creating instance of area
		Area rectangle = new Area(3,4);
		System.out.println(rectangle.returnArea());
	}
}
