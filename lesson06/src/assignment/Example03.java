package assignment;

public class Example03 {


    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            e.printStackTrace();

        }

        finally {
            System.out.println("program came here");
        }

    }
}
