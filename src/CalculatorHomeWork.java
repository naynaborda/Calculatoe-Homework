import java.util.Scanner;

public class CalculatorHomeWork {
    //27/06/2020

    //Return type with parameter
    public Double plusMethod(double a, double b, double c, double d) {

        return (a + b + c + d);
    }

    //Return type with  parameter
    public float minusMethod(float x, float y, float z) {
        float a = 90.50f;
        float b = 10.20f;
        float c = 20.30f;
        float d = a - b - c;
        return (x - y - z);
    }

    //no return type with parameter
    public void multiplyMethod(long a, long b, long c, long d) {

        System.out.println("Multiplication\t=" + "\t" + (a * b * c * d));
    }

    //no Return Type with no parameter
    public static void dividedMethod() {
        int a = 70;
        int b = 6;
        int c = a / b;
        System.out.println("Division\t\t=" + "\t" + c);
        //no return type with parameter
        //System.out.println("Division\t\t="+"\t"+(e/f));

    }

    //return type with parameter
    public String myName(String FirstName, String LastName) {
        return (FirstName + LastName);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorHomeWork calculation = new CalculatorHomeWork();
        System.out.println("Addition\t\t=" + "\t" + calculation.plusMethod(30.50d, 60.90d, 20.50d, 40.30d));
        System.out.println("Subtraction\t\t=\t" + calculation.minusMethod(90.50f, 10.20f, 20.30f));
        calculation.multiplyMethod(10l, 20l, 30l, 40l);
        dividedMethod();
        System.out.println(calculation.myName("My Name is " + "Nayna ", "Borda"));


    }
}
