import java.util.Random;

/**
 * Creates and outputs a three-dimensional array.
 * @data 07.04.2022
 * @author Alex Krentik
 */

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        Random numbers = new Random();
        int[][][] threeArray = new int[2][3][4 ];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    threeArray[i][j][k] = numbers.nextInt(100);
                }
            }
        }
    }
}

