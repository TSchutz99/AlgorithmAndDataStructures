package Lab1.Q1;

public class TestMyMath {
    public static void main(String[] args){
        int min1 = MyMath.findSmallest(12,  44, 66);
        System.out.println("Expected: " + 12 + " Actual: " + min1);// expected = 12

        int min2 = MyMath.findSmallest(12,  -10, 66);
        System.out.println("Expected: " + -10 + " Actual: " + min2);//expected = -10

        int min3 = MyMath.findSmallest(-12,  -44, -4);
        System.out.println("Expected: " + -44 + " Actual: " + min3);//expected = -44
    }
}
