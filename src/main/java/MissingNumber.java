import java.util.ArrayList;

public class MissingNumber {
	public ArrayList<Integer> missing(int a[]){
		
		int i=0,j=0;
		ArrayList<Integer> al= new ArrayList<Integer>();
		
	
		int temp=0;
		int num;
		for( i=0;i<a.length;i++)
		{
			for( j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		/*for (i=0;i<a.length;i++)
		{ 
			int k=a[i];
			
			
		    if (k==a[i])
		    {
		        k++;
		        continue;
		    }
		    else
		    {
		        al.add(j);
		        i--;
		    k++;
		    }
		}
		*/
		for(int k=0;k<a.length-1;k++)
		{
			num=a[k];
			while(++num<a[k+1])
			{
				al.add(num);
			}
		}
			
		
		
		
	return al;

}
}