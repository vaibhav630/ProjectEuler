
public class Prob4 {

	public static void main(String[] args) {
		/*A palindromic number reads the same both ways. 
		 The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

		Find the largest palindrome made from the product of two 3-digit numbers.*/

		int a=999;
		int b=999;
		int product=a*b;
		int max = largestPalindrome(product);
		/*if(true){
				System.out.println("Largest palindrome made from the product of two 3-digit numbers: "+a+" & "+b+" is "+ product);
				break;
			}

			if(a-b==1)
				a--;

			else if(a-b==0)
				b--;*/

	}

	private static int largestPalindrome(int product) {
		int temp=product;
		int rev=0;
		int rem=0;
		while(product!=0){
			rem=product%10;
			rev=rev*10+rem;
			product = product/10;
		}
		
		if(temp!=rev){
			temp--;
			largestPalindrome(temp);
		}
		return temp;
		
	}


}
