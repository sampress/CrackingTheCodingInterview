import java.util.Arrays;
public class CheckPermutation {

 private static boolean isPermutation(String str1, String str2)
 {
	if(str1.length() != str2.length())
		return false;
	char [] ch1 = str1.toCharArray();
	char [] ch2 = str2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	return Arrays.equals(ch1, ch2);
 }
	
 public static void main(String[] args)
 {
   System.out.println(isPermutation("hello", "ohell"));
 }

	
}
