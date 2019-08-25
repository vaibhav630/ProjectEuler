import java.util.ArrayList;
import java.util.List;

public class Prob3 {

	public static void main(String[] args) {
		/*The prime factors of 13195 are 5, 7, 13 and 29.

		What is the largest prime factor of the number 600851475143 ?*/
		int num = 600851475;
		List<Integer> divisor = new ArrayList<>();
		int[] div = {};
		for(int i=1;i<num/2;i++){
			if(num%i==0){
				divisor.add(i);
			}
		}
		
	}

}
