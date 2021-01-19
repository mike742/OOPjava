import java.util.Arrays;
import java.util.Scanner;


class A3 {
	public static void main(String[] args) {

		int[] intArray1 = { 1, 2, 3, 4, 5 };
		int[] intArray2 = { 6, 7, 8, 9, 10 };

		int[] mergedArray = new int[intArray1.length + intArray2.length];
		System.arraycopy(intArray1, 0, mergedArray, 0, intArray1.length);
		System.arraycopy(intArray2, 0, mergedArray, intArray1.length, intArray2.length);

		System.out.println(Arrays.toString(mergedArray));


	}

}
