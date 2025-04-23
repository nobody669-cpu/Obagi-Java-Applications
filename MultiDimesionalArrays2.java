public class  MultiDimesionalArrays2 {
    public static void main(String[] args) {

        int[][] ages = {
            {31, 12, 20, 16},
            {45, 12, 34, 35},
            {18, 17, 54, 28}
        };

        int evenSum = 0;
        int oddCount = 0;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                int number = ages[row][col];

                if (number % 2 == 0) {
                    evenSum += number;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.printf("The sum of all even numbers is: %d%n", evenSum);
        System.out.printf("The count of all odd numbers is: %d%n", oddCount);
    }
}
