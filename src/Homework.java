import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Евгений on 26.04.2018.
 */

public class Homework {
    public static void main(String[] args) throws IOException {

        task01();
        //task02();
        //task03();
    }

    private static void task01() throws IOException {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int moveElements = scanner.nextInt();
        int[] values = new int[length];

        for (int i = 0; i < length; i++) {
            values[i] = scanner.nextInt();
        }

        int[] rotatedArray = new int[length];

        for (int i = 0; i < moveElements; i++) {
            rotatedArray[length - moveElements + i] = values[i];
        }

        for (int i = moveElements; i < length; i++) {
            rotatedArray[i - moveElements] = values[i];
        }

        for (int a : rotatedArray) {
            System.out.print(a + " ");
        }

        scanner.close();
    }
    //=========================

    private static void task02() throws IOException {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] values = new int[length];

        for (int i = 0; i < length; i++) {
            values[i] = scanner.nextInt();
        }

        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
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

        for (int i = 0; i < length; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.print("[" + values[0]);

        for (int i = 1; i < length - 1; i++) {
            if (values[i - 1] + 1 != values[i]) {
                System.out.print("][" + values[i]);
            } else if (values[i] + 1 != values[i + 1]) {
                System.out.print(" " + values[i]);
            }
        }

        if (values[length - 2] + 1 != values[length - 1]) {
            System.out.print("][" + values[length - 1] + "]");
        } else {
            System.out.println(" " + values[length - 1] + "]");
        }

        scanner.close();
    }
}