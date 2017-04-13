import java.util.HashSet;

public class Swap {
	public static HashSet<Integer>  swap(int a,int b){
		HashSet<Integer> hs= new HashSet<Integer>();
		
			a=a+b;
			b=a-b;
			a=a-b;
			hs.add(a);
			hs.add(b);
			return hs;
		
		}
	}



