package coding;

public class GoogleProblem1 {
	
	public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
	
	public static void permute(String str, int l, int r)
    {
		for(int i = 1; i<=r; i++)
		{
			str = swap(str,l,i);
            permute(str, l+1, r);
            str = swap(str,l,i);
		}
    }
 
	
    public static void main(String[] args)
    {
        String str = "1101";
        permute(str,0, str.length()-1);
    }
}
