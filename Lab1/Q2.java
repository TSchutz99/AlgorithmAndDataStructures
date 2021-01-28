package Lab1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int num;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        while(num > 0){
            numbers[num-1] += 1;

            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        System.out.print("\n\n");
        for(int i = 0; i < 100; i++){
            if(numbers[i] != 0)
                System.out.println("There was " + numbers[i] +
                        ", " + (i+1) + " entered");
        }
    }
}
