
public class Prob6 {

	public static void main(String[] args) {
		/*The sum of the squares of the first ten natural numbers is,

		1^2 + 2^2 + ... + 10^2 = 385
		The square of the sum of the first ten natural numbers is,

		(1 + 2 + ... + 10)2 = 552 = 3025
		Hence the difference between the sum of the squares of the first ten natural numbers 
		and the square of the sum is 3025 − 385 = 2640.

		Find the difference between the sum of the squares of the first one hundred natural numbers 
		and the square of the sum.*/
		
		long squareOfSum=0;
		int sum=0;
		long sumOfSquire=0;
		for(int i=1;i<=100;i++){
			sumOfSquire += Math.pow(i,2);
			sum+=i;
		}
		
		squareOfSum=(long) Math.pow(sum,2);
		long diff = squareOfSum-sumOfSquire;
		System.out.println(squareOfSum + " & " +sumOfSquire);
		System.out.println("Difference between the sum of squares of first 100 natural numbers and square of sum is "+ diff);
	}

}
