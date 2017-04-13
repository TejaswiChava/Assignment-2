import java.util.LinkedHashSet;

public class Prime {
	public LinkedHashSet<Integer> primeFactors(int num)
{
	int count=0;
	LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
	for(int i=2;i<num/2;i++)
	{
		if(num%i==0)
		{
		count=0;
		  for(int j=2;j<=i/2;j++)
		  {
			 if(i%j==0)
			 {
				 count++;
	            break;
			 }
		  }
		  if(count==0)
		  {
			lhs.add(i);
	
	      }
		}
	}

	return lhs;
}

}
