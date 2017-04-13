import java.util.LinkedHashSet;
import java.util.Set;

public class RemovinDuplicates {
	
	String result;
	public Set<Integer> removeDuplicates(int[] duplicateArray)
		{
			Set <Integer>  set=new LinkedHashSet();
			for(Integer a:duplicateArray){
				set.add(a);
			}
			
			return set;
		

}
}
