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
		
		
		int[][] twoDimArr1 = new int[5][7];
		
		// twoDimArr1[0] => [1, 2, 3, 4, 5, 6, 7]
		// twoDimArr1[1] => [11, 22, 33, 4, 5, 6, 7]
		
		// 1 2 3 4 5
		// 2 3 4 5 6
		// 3 4 5 6 7
		
		int[][][] mDarr = new int [10] [20] [30];
		
		twoDimArr1[0][0] = 11;
		
		int[][] twoDimArr2 = { {1, 2, 3}, {2, 3, 4}, {5, 3, 2}, {8, 7, 5} };
		
		System.out.println(twoDimArr2.length);
		System.out.println(twoDimArr2[0].length);
		
		for(int i =0; i < twoDimArr2.length; ++i) {
			for(int j = 0; j < twoDimArr2[i].length; ++j) {
				System.out.print(twoDimArr2[i][j] + " ");
			}
			System.out.print("\n");
		}

		char[][] twoDimArrChar = { {'*'}, {'*', '*'}, {'*', '*', '*'}, {'*', '*', '*', '*'} };
		
		for(int i =0; i < twoDimArrChar.length; ++i) {
			for(int j = 0; j < twoDimArrChar[i].length; ++j) {
				System.out.print(twoDimArrChar[i][j]);
			}
			System.out.print("\n");
		}
		
		
		int[][] counts = new int[5][2];
		System.out.println();
		
		
		System.out.println("method = " + inverseInt(-123456));
		
	}

	public static int inverseInt(int value) {
		
		int res = 0;
		
		while(value > 0) {
			res = res * 10 + value % 10;
			value = value / 10;
 		}
		
		return res;
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
