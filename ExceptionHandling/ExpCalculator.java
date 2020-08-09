import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ExpCalculator {
    public static void main(String[] args) throws IOException {

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter 1st number, 2nd number and operator : ");
        try {

            String[] str = userInput.readLine().split(" ");

            int n1 = Integer.parseInt(str[0]);
            int n2 = Integer.parseInt(str[1]);
            String operator = str[2];

            final List<String> operators = Arrays.asList("+", "-", "/", "*");
            if (!operators.contains(operator)) {
                throw new IOException("Invalid Operator.");
            }
            switch (operator) {
                case "+":
                    System.out.println((n1 + n2) + "\n");
                    break;
                case "-":
                    if (n1 < n2) {
                        throw new NegativeResultException();
                    }
                    System.out.println((n1 - n2) + "\n");
                    break;
                case "*":
                    System.out.println((n1 * n2) + "\n");
                    break;
                case "/":
                    System.out.println((n1 / n2) + "\n");
                    break;

            }
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception occured! " + e + "\n");
        } catch (IOException e) {
            System.out.println("Invalid Operator Exception occured! " + e.getMessage() + "\n");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Exception occured! " + e + "\n");
        } catch (NegativeResultException e) {
            System.out.println("NegativeResultException occured! " + e + "\n");
        }
    }
}

class NegativeResultException extends Exception {
    public NegativeResultException() {

    }
}