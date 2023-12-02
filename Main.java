import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomLenOfArray();
        printArray(array);
        drawHistogram(array);
    }


    //Generates Random length of array with random numbers
    public static int[] generateRandomLenOfArray(){
        Random random = new Random();
        int generateNumbersOfElement = random.nextInt(101)+1;
        int[] myArray = new int[generateNumbersOfElement]; //Random length of Array between 1 to 100
        int index = 0;
        for(int i : myArray){
            myArray[index] = random.nextInt(101); //Generate Random number and assign to index
            index++;
        }
        return myArray;
    }


    //Prints Array
    public static void printArray(int[] myArray){
        System.out.println(Arrays.toString(myArray));
    }


    //Draws Histogram
    public static void drawHistogram(int[] myArray){
        int row = 1;
        while (row <= 100){
            StringBuilder stars = new StringBuilder();
            for (int j : myArray) {
                if (j >= row && j <= row + 9) {
                    stars.append("✼ ");
                }
            }
            System.out.printf("%5d - %5d %10s %s%n",row, row+9, "|",stars);
            row+=10;
        }
        System.out.println("Length of Array: " + myArray.length);
    }
}