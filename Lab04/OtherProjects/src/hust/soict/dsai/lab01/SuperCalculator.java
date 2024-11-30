package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class SuperCalculator {

    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ",
                JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1), num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2, diff = num1 - num2, prod = num1 * num2;
        if (num2 != 0) {
            double quot = num1 / num2;
            JOptionPane.showMessageDialog(null, "The sum is " + sum + "\nThe difference is " + diff
                    + "\nThe product is " + prod + "\nThe quotient is " + quot, "Results",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "The sum is " + sum + "\nThe difference is " + diff
                    + "\nThe product is " + prod + "\nThere's no quotient as the second number is 0", "Results",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }

}
