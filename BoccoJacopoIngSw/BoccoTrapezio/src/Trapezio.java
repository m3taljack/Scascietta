/**
 *
 * @author Jacopo Bocco
 * @version 0
 *
 */
public class Trapezio 
{
	private float B,b,h;
	/**
	 * 
	 * @param B  base maggiore in cm
	 * @param b  base minore in cm
	 * @param h  altezza in cm
	 */

	public Trapezio(float B, float b, float h) 
	{
		this.B = B;
		this.b = b;
		this.h = h;
	}
	
	/**
	 * 
	 * @return area in cm^2 area= B+b*h/2
	 */
	
	public float area()
	{
		float area = B+b*h/2;
		return area;
		
	}

}
