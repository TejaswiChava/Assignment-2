
public class Character {
	public static String stringDuplicates(String str)
	{    char ch;
	   String out="";
		for(int i=0; i<str.length(); i++)
        {
             ch = str.charAt(i);
            if(ch!=' '){
                out=out + ch;
            
            str = str.replace(ch,' '); 
            }
        }
		return out;
	}
	
	

}
