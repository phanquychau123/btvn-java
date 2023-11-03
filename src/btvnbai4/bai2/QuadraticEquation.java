package btvnbai4.bai2;

   import java.util.Scanner;

    public class QuadraticEquation {
        private double a, b, c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public QuadraticEquation() {

        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public double getRoot1() {
            double discriminant = getDiscriminant();
            if (discriminant < 0) {
                return 0; // Delta < 0, no real roots
            } else {
                return (-b + Math.sqrt(discriminant)) / (2 * a);
            }
        }

        public double getRoot2() {
            double discriminant = getDiscriminant();
            if (discriminant < 0) {
                return 0; // Delta < 0, no real roots
            } else {
                return (-b - Math.sqrt(discriminant)) / (2 * a);
            }
        }
    }

