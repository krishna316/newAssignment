package kelltonTechAssigment;

import java.util.Arrays;
import java.util.Comparator;

public class second_highestNumber {

	public static void main(String[] args) {
	  Integer arr[]= {12,16,45,11,18,22,19,20,45};
	  
	  Integer result=Arrays.stream(arr)
			  .distinct()
			  .sorted(Comparator.reverseOrder())
			  .skip(1)
			  .findFirst()
			  .get();
			  
	  System.out.println("Second highest using java 8:"+result);

	}

}
