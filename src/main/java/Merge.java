import java.util.ArrayList;

public class Merge {
	
	public static ArrayList<Integer> merge(int[] a, int[] b) {

		  
			ArrayList<Integer> al=new ArrayList<Integer>();
		    int i = 0, j = 0;
		    while (i < a.length && j < b.length)
		    {
		        if (a[i] < b[j])
		        {
		            al.add(a[i]);
		            i++;
		        }
		        else
		        {
		            al.add(b[j]);
		            j++;
		          
		        }
		        
		    }

		    while (i < a.length)
		    {
		        al.add(a[i]);
		        i++;
		       
		    }

		    while (j < b.length)
		    {
		        al.add(b[j]);
		        j++;
		        
		    }

		    return al;
		}

	}


