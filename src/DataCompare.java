
public class DataCompare {

	public static void main(String[] args)
	{ 
		int a=2 ;
		float b=3.0f;
		double c=12d; 
		// integer cannot accept float type
		// so we have to  type cast  
		 a=(int)b; 
		 System.out.println(a);
	//	a=b;
		// float cannot accept double type
		// so we have to type cast 
	//	b=c;
	  b=(float)c;
	System.out.println(b);
	}
	
}
