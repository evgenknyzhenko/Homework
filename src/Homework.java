import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());
        int moveElements = Integer.parseInt(reader.readLine());
        int[] values = new int[length];

        for (int i = 0; i < length; i++){
            values[i] = Integer.parseInt(reader.readLine());
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
        reader.close();
    }
    //=========================


    private static void task02() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());
        int[] values = new int[length];

        for (int i = 0; i < length; i++){
            values[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < values.length; i++){
            if (values[i] < 0){
                values[i] = (values[i - 1] + values[i + 1]) / 2;
            }
            System.out.print(values[i] + " ");
        }
        reader.close();
    }
    //===========================

    private static void task03() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());
        int[] values = new int[length];

        for (int i = 0; i < length; i++){
            values[i] = Integer.parseInt(reader.readLine());
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
        reader.close();
    }
}











