public class MultiDimesionalArrays {
    public static void main(String[] args) {
        
        int[][] numbers = {
            {31, 12, 20, 16},
            {45, 12, 34, 35},
            {18, 17, 54, 28}
        };
        
        int firstSum = 0;
		int secondSum = 0;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                firstSum += numbers[row][col];
            }
        }

        System.out.printf("The sum of all the numbers is %d%n", firstSum);
		System.out.printf("================================================================================");
		for (int[] row : numbers){
			for (int[] num : row){
				secondSum += numbers[row][col];
			}
		}
		
		System.out.printf("The sum of all the numbers is %d%n", secondSum);
    }
}
