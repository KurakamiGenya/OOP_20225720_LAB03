package hust.soict.dsai.lab01;
import javax.swing.*;
import java.util.InputMismatchException;

public class EquationSolver {

    // Giai pt bac 1st 1 an: a*x + b = 0
    public static void solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinite solutions");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solutions");
            }
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "The solution of the equation is: x = " + x);
        }
    }

    // Giai h2pt bac 1st 2 an:
    public static void solveLinearSystem(double a1, double b1, double c1, double a2, double b2, double c2) {
        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            if (a1 * c2 == a2 * c1 && b1 * c2 == b2 * c1) {
                JOptionPane.showMessageDialog(null, "The system has infinite solutions");
            } else {
                JOptionPane.showMessageDialog(null, "The system has no solutions");
            }
        } else {
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            JOptionPane.showMessageDialog(null, "The solution of the system is: x = " + x + ", y = " + y);
        }
    }

    // Giai pt bac 2nd 1 an: a*x^2 + b*x + c = 0
    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            solveLinearEquation(b, c); // Chuyen ve pt bac 1st cho nhanh
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "The equation has no solutions");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "The equation has a double solution: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null,
                        "The solution has two distinct solutions: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }

    public static void main(String[] args) {
        String[] options = { "First-degree equation", "System of first-degree equations", "Second-degree equation" };
        int choice = JOptionPane.showOptionDialog(null, "Which type of equation do you want to solve?",
                "Choose the type of equation", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        switch (choice) {
            case 0: // Pt bac 1st
                double a1 = getDoubleInput("Enter a:");
                double b1 = getDoubleInput("Enter b:");
                solveLinearEquation(a1, b1);
                break;

            case 1: // Hpt bac 1st
                double a2_1 = getDoubleInput("Enter a1:");
                double b2_1 = getDoubleInput("Enter b1:");
                double c1 = getDoubleInput("Enter c1:");
                double a2_2 = getDoubleInput("Enter a2:");
                double b2_2 = getDoubleInput("Enter b2:");
                double c2 = getDoubleInput("Enter c2:");
                solveLinearSystem(a2_1, b2_1, c1, a2_2, b2_2, c2);
                break;

            case 2: // Pt bac 2nd
                double a3 = getDoubleInput("Enter a:");
                double b3 = getDoubleInput("Enter b:");
                double c3 = getDoubleInput("Enter c:");
                solveQuadraticEquation(a3, b3, c3);
                break;

            default:
                JOptionPane.showMessageDialog(null, "You haven't picked the type of equation yet");
                break;
        }
    }

    private static double getDoubleInput(String message) {
        double value = 0;
        boolean valid = false;
        while (!valid) {
            String input = JOptionPane.showInputDialog(message);
            if (input == null) {
                System.exit(0); // An Cancel thi thoat
            }
            try {
                value = Double.parseDouble(input);
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid value, please re-enter");
            }
        }
        return value;
    }
}
