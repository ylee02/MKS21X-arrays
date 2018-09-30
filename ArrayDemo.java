public class ArrayDemo {
	public static void printArray (int[]ary) {
		System.out.print("[");
		for (int i = 0; i < ary.length - 1; i++) {
			System.out.print(ary[i] + ", ");
		}
		System.out.println(ary[ary.length - 1] + "]");
	}
	
	public static void printArray(int[][]ary){
		System.out.println("[");
		for (int i = 0; i < ary.length; i++) {
			
			printArray(ary[i]);
		}
		System.out.println("]");
	}
	
	public static int countZeros2D(int[][] nums){
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int x = 0; x < nums[i].length; x++) {
				if (nums[i][x] == 0) {
					counter += 1;
				}
			}
		}
		return counter;
	}
	
	public static void fill2D(int[][] vals) {
		for (int i = 0; i < vals.length; i++) {
			for (int x = 0; x < vals.length; x++) {
				if (x == i) {
					vals[i][x] = 3;
				}
				else {
					vals[i][x] = 1;
				}
			}
		}
		printArray(vals);
	}
	
	public static int[][] fill2DCopy(int[][] vals) {
		int[][] vals2 = new int[vals.length][];
		for (int y = 0; y < vals.length; y++) {
			vals2[y] = new int[vals[y].length];
		}
		for (int i = 0; i < vals.length; i++) {
			for (int x = 0; x < vals.length; x++) {
				if (vals[i][x] < 0) {
					vals2[i][x] = 3;
				}
				else {
					vals2[i][x] = 1;
				}
			}
		}
		return vals2;
	}
	
	
	public static void main(String[] arg) {
		int[] ary = new int[6];
		ary = new int[]{ 1,2,3,4,5,6 };
		printArray(ary);
		
		int[][] ary2 = new int[4][4];
		ary2 = new int[][]{
			{ 0, 2, -3, 4 },
			{ 0, 6, 7, -8 },
			{ 0, -10, 11, 12 },
			{ 0, 14, 15, -16 },
		};
		
		printArray(ary2);
		
		System.out.println(countZeros2D(ary2));
		
		fill2D(ary2);
		
		printArray(fill2DCopy(ary2));
	}
}