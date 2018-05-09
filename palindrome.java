/* 
Reverses a string. 
*/


public class palindrome{
	public static String reverse(String input){
		if(input.length()==1){
			return input;
		}
		else{
			return reverse(input.substring(1, input.length())) + input.substring(0,1);
		}
	}
}
