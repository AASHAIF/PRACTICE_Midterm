// File: quraticsolver.java
// Purpose: Solve ax^2 + bx + c = 0 with integer a,b,c (edit the three lines below)

public class quraticsolver {

    // >>> EDIT THESE THREE LINES FOR THE EXAM STEP (f) <<<
    static int a = 10;   // change me
    static int b = -2;  // change me
    static int c = 1;   // change me
    // <<< EDIT ONLY THE INTS ABOVE >>>

    public static void main(String[] args) {
        System.out.println("Quadratic: " + a + "x^2 + " + b + "x + " + c + " = 0");

        if (a == 0) {
            // Handle linear bx + c = 0
            if (b == 0) {
                System.out.println((c == 0) ? "Infinite solutions" : "No solution");
            } else {
                double x = - (double)c / b;
                System.out.println("Linear solution: x = " + x);
            }
            return;
        }

        double A = a, B = b, C = c;
        double discriminant = B*B - 4*A*C;
        System.out.println("Discriminant = " + discriminant);

        if (discriminant > 0) {
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-B + sqrtD) / (2*A);
            double x2 = (-B - sqrtD) / (2*A);
            System.out.println("Two real roots:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            double x = (-B) / (2*A);
            System.out.println("One real root (double root):");
            System.out.println("x = " + x);
        } else {
            double real = (-B) / (2*A);
            double imag = Math.sqrt(-discriminant) / (2*A);
            System.out.println("No real roots. Complex roots:");
            System.out.println("x1 = " + real + " + " + imag + "i");
            System.out.println("x2 = " + real + " - " + imag + "i");
        }
    }
}