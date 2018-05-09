/* 
Reverses the digits of positive integer values (ex. 1234 -> 4321)
*/


public class reverseInt{

	public static int reverse(int n){
		
		if(n / 10 == 0){
			return n;
		}
		else{
			return (n % 10) * (int)(Math.pow(10, (int)(Math.log10(n)))) + reverse(n / 10);
		}
	}

}
