import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysDriver {

	public static void main(String[] args) {

		// int[] arr1 = new int[10]; // this!!
		// int arr2[] = new int[] { 1, 2, 3, 4, 5 };
		// int[] arr3 = { 1, 2, 3 };

		// Car[] cars;
		// Auto[] autos;

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = arr1;

		arr2[1] = 77;

		// System.out.println( arr1 );
		// System.out.println( arr2 );
		// System.out.println( Arrays.toString(arr1) ); // !! 1, 2, 3
		// System.out.println( Arrays.toString(arr2) ); // 1, 77, 3

		// System.out.println("Address arr1 : " + arr1);
		// System.out.println(sum(arr1));

		// System.out.println(Arrays.toString(arr1)); // !! 1, 2, 3
		// System.out.println(Arrays.toString(arr2)); // 1, 77, 3

		int[] ga1 = getArray();
		int[] ga2 = getArray();

		ga2[1] = 222;

		// System.out.println(Arrays.toString(ga1));
		// System.out.println(Arrays.toString(ga2));

		int[] intArray1 = { 1, 2, 3, 4, 5 };
		int[] intArray2 = { 6, 7, 8, 9, 10, 11, 12 };
		int[] resArray = new int[intArray1.length + intArray2.length];

		// System.out.println(resArray.length);

		// copy intArray1 to resArray
		/*
		 * for(int i = 0; i < intArray1.length; ++i) { resArray[i] = intArray1[i]; }
		 */
		/*
		 * for(int i = intArray1.length; i < resArray.length ; ++i) { // i = 5; i -
		 * intArray1.length resArray[i] = intArray2[i - intArray1.length]; }
		 */
		/*
		 * for(int i = 0; i < resArray.length - intArray1.length; ++i) { resArray[i +
		 * intArray1.length] = intArray2[i]; }
		 */

		// System.arraycopy(intArray1, 0, resArray, 0, intArray1.length);
		// System.arraycopy(intArray2, 0, resArray, intArray1.length, intArray2.length);

		// System.out.println(Arrays.toString(resArray));

		Integer[] findElementArr = { 3, 5, 1, 4, 2 };

		System.out.println(indexOf(55, findElementArr)); // 0 1 2 3 
		
		Arrays.sort(findElementArr);
		System.out.println( Arrays.toString(findElementArr) );
		
		//Arrays.sort(findElementArr, Collections.reverseOrder());
		Arrays.sort(findElementArr, Comparator.reverseOrder());
		System.out.println( Arrays.toString(findElementArr) );

	}

	private static int indexOf(int a, Integer[] arr) {

		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == a) {
				return i;
			}
		}

		return -1;
	}

	public static int[] getArray() {
		int[] output = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Address of output : " + output);

		return output;
	}

	public static int sum(int[] input) {
		System.out.println("Address input : " + input);
		int res = 0;
		int[] arr = input.clone();

		System.out.println("Address copy : " + arr);

		// System.out.println( Arrays.toString(arr) );
		/*
		 * for(int i = 0; i < arr.length; ++i) { arr[i] = input[i]; }
		 */
		System.out.println(Arrays.toString(arr));

		arr[0] = 22;
		/*
		 * for(int i = 0; i < arr.length; ++i) { res += arr[i]; }
		 */
		for (int a : arr) {
			res += a;
		}

		return res;
	}

}
