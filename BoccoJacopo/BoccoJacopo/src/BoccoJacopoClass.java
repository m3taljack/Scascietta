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
		/**
		 * r deve partire da 0
		 */
		int r=0;
		/**
		 * i deve essere maggiore di 0 perchè altrimenti si ferma subito e poi bisogna decrementare i (i--)
		 */
		for (int i=f;i>0;i--) 
		{
			/**
			 * r deve essere uguale ad r+i
			 */
			r = r+i;	
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
