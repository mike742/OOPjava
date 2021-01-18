import java.util.Arrays;

public class ArraysDriver {

	public static void main(String[] args) {
		
		
		// int[] arr1 = new int[10]; // this!!
		// int arr2[] = new int[] { 1, 2, 3, 4, 5 };
		// int[] arr3 = { 1, 2, 3 };
		
		// Car[] cars;
		// Auto[] autos;
		
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = arr1;
		
		arr2[1] = 77;
		
		// System.out.println( arr1 );
		// System.out.println( arr2 );
		//System.out.println( Arrays.toString(arr1) ); // !! 1, 2, 3
		//System.out.println( Arrays.toString(arr2) ); // 1, 77, 3
		
		System.out.println( "Address arr1 : " + arr1 );
		System.out.println( sum( arr1 ) );
		
		System.out.println( Arrays.toString(arr1) ); // !! 1, 2, 3
		System.out.println( Arrays.toString(arr2) ); // 1, 77, 3
		
		


	}

	public static int sum(int[] input) {
		System.out.println( "Address input : " + input );
		int res = 0;
		int[] arr = new int[input.length];
		System.out.println( "Address copy : " + arr );
		
		// System.out.println( Arrays.toString(arr) );
		
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = input[i];
		}
		System.out.println( Arrays.toString(arr) );
		
		arr[0] = 22;
		/*
		for(int i = 0; i < arr.length; ++i) {
			res += arr[i];
		}
		*/
		for(int a : arr) {
			res += a;
		}
		
		return res;
	}
	
}
