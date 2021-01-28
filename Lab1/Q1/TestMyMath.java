package Lab1.Q1;

public class TestMyMath {
    public static void main(String[] args){
        int min1 = MyMath.findSmallest(12,  44, 66);
        System.out.println("Expected: " + 12 + " Actual: " + min1);// expected = 12
        int min2 = MyMath.findSmallest(12,  -10, 66);
        System.out.println("Expected: " + -10 + " Actual: " + min2);//expected = -10
        int min3 = MyMath.findSmallest(-12,  -44, -4);
        System.out.println("Expected: " + -44 + " Actual: " + min3);//expected = -44

        int power1 = MyMath.findPower(2, 4);
        System.out.println("\nExpected: 16  Actual: " + power1);
        int power2 = MyMath.findPower(7, 9);
        System.out.println("Expected: 40353607  Actual: " + power2);
        int power3 = MyMath.findPower(3, 4);
        System.out.println("Expected: 81  Actual: " + power3);

        int sum1 = MyMath.sumFromOne(5);
        System.out.println("\nExpected: 15  Actual: " + sum1);
        int sum2 = MyMath.sumFromOne(10);
        System.out.println("Expected: 55  Actual: " + sum2);
        int sum3 = MyMath.sumFromOne(15);
        System.out.println("Expected: 120  Actual: " + sum3);

        int cal1 = MyMath.calFromOne(5);
        System.out.println("\nExpected: 120  Actual: " + cal1);
        int cal2 = MyMath.calFromOne(10);
        System.out.println("Expected: 3628800  Actual: " + cal2);
        int cal3 = MyMath.calFromOne(3);
        System.out.println("Expected: 6  Actual: " + cal3);

        String pn1 = MyMath.primeNumber(29);
        System.out.println("\nExpected: Prime Number  Actual: " + pn1);
        String pn2 = MyMath.primeNumber(23);
        System.out.println("Expected: Prime Number  Actual: " + pn2);
        String pn3 = MyMath.primeNumber(62);
        System.out.println("Expected: Not Prime Number  Actual: " + pn3);
    }
}
