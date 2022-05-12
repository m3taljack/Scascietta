import java.util.Iterator;
/**
 * 
 * @author <b>Bocco Jacopo</b>
 * <U>Trapezio</U>
 * <i>12/05/2022</i>
 * 
 * @version 0.0
 *
 */
public class BoccoJacopoClass 
{
	/**
	 * 
	 * @param f: indice iniziale
	 * @return r: sommatoria di u  certo numero di valori compresi tra l'indice iniziale e 0
	 */
	
	public int BoccoMet(int f)
	{
		int r=1;
		for (int i=f;i<0;i++) 
		{
			r = r*i;	
		}
		return r;
	}
	
	public static void main(String[] args) 
	{
		BoccoJacopoClass bj1 = new BoccoJacopoClass();
		
		
		System.out.println(bj1.BoccoMet(0));
		System.out.println(bj1.BoccoMet(5));	
	}
}
