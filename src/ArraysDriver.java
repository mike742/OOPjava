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
		
		
		int[] ga1 = getArray();
		int[] ga2 = getArray();
		
		ga2[1] = 222;

		System.out.println( Arrays.toString(ga1) ); 
		System.out.println( Arrays.toString(ga2) );
	}

	public static int[] getArray() {
		int[] output = new int[] {1,2,3,4,5,6,7};
		
		System.out.println( "Address of output : " + output );
		
		return output;
	}
	
	public static int sum(int[] input) {
		System.out.println( "Address input : " + input );
		int res = 0;
		int[] arr = input.clone();
		
		System.out.println( "Address copy : " + arr );
		
		// System.out.println( Arrays.toString(arr) );
		/*
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = input[i];
		}
		*/
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
