import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Евгений on 26.04.2018.
 */
public class Homework {
    public static void main(String[] args) throws IOException {

        //task01();
        //task02();
        task03();
    }



    private static void task01() throws IOException {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int moveElements = scanner.nextInt();
        int[] values = new int[length];

        for (int i = 0; i < length; i++){
            values[i] = scanner.nextInt();
        }

        int[] rotatedArray = new int[length];
        int countOfRotatedArray = 0;

        for (int i = 0; i < values.length; i++){
            if (i + moveElements < length){
                rotatedArray[i] = values[moveElements + i];
            }
            else{
                rotatedArray[i] = values[countOfRotatedArray++];
            }
            System.out.print(rotatedArray[i] + " ");
        }
        scanner.close();
    }
    //=========================


    private static void task02() throws IOException {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] values = new int[length];

        for (int i = 0; i < length; i++){
            values[i] = scanner.nextInt();
        }

        for (int i = 0; i < values.length; i++){
            if (values[i] < 0){
                values[i] = (values[i - 1] + values[i + 1]) / 2;
            }
            System.out.print(values[i] + " ");
        }
        scanner.close();
    }
    //===========================

    private static void task03() throws IOException {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] values = new int[length];

        for (int i = 0; i < length; i++){
            values[i] = scanner.nextInt();
        }

        StringBuilder output = new StringBuilder();
        int minRange = values[0];
        int maxRange;

        for (int i = 1; i < values.length; i++){
            if (values[i] - values[i - 1] == 1){
                if (i == values.length - 1){
                    maxRange = values[i];
                    output.append("[" + minRange + " " + maxRange + "]");
                }
            }
            else{
                if (i == values.length - 1){
                    maxRange = values[i - 1];
                    if (minRange == maxRange){
                        output.append("[" + minRange + "]");
                    }
                    else{
                        output.append("[" + minRange + " " + maxRange + "]");
                    }
                    minRange = values[i];
                    output.append("[" + minRange + "]");
                }
                else{
                    maxRange = values[i - 1];
                    if (minRange == maxRange){
                        output.append("[" + minRange + "]");
                    }
                    else{
                        output.append("[" + minRange + " " + maxRange + "]");
                    }
                    minRange = values[i];
                }
            }
        }
        System.out.println(output);
        scanner.close();
    }
}











