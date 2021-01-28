package Lab1.Q1;

public class MyMath {
    public static int findSmallest(int a, int b, int c) {
        int smallest = a;

        if (b < smallest)
            smallest = b;
        else if (c < smallest)
            smallest = c;

        return smallest;
    }

    public static int findPower(int a, int b) {
        int power = 1;

        while (b != 0) {
            power *= a;
            b--;
        }

        return power;
    }

    public static int sumFromOne(int x) {
        int sum = 0;

        for (int i = 1; i < x + 1; i++) {
            sum += i;
        }

        return sum;
    }

    public static int calFromOne(int x) {
        int sum = 1;

        for (int i = 2; i < x + 1; i++) {
            sum *= i;
        }

        return sum;
    }

    public static String primeNumber(int num) {
        for(int i = 2; i <= num / 2; i++)
            if(num % i == 0)
                return "Not Prime Number";

        return "Prime Number";
    }
}

