package moda.SEM;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SemTest {

	public static void main(String[] args) {
		
		Integer[] arrayInt= {4, 5, 2, 25};
		System.out.println(calculateSem(arrayInt));
		
		System.out.println();
		
		Integer[] arrayInt2= {13, 120, 7, 6, 17, 2, 59};
		System.out.println(calculateSem(arrayInt2));

	}
	
	private static String calculateSem(Integer... arrayInt) {
		return IntStream.range(0, arrayInt.length)
			.mapToObj(index-> String.format("%d --> %s", arrayInt[index], 
					sem(index, arrayInt)))
			.collect(Collectors.joining("\n"));
	}
	
	private static Integer sem(Integer index, Integer[] arrayInt) { 
		for(int i=index+1; i<arrayInt.length; i++) {
			if(arrayInt[index]<arrayInt[i]) {
				return arrayInt[i];
			}
		}
		return -1;
	}
}
