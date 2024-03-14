public class Problem4 {

    public static void main(String args[])
    {
        Problem4 cal = new Problem4();
        cal.calculator("add",6,2);

    }

    public void calculator(String operation, int num1, int num2) {
        if (operation.equals("add")) {
            int result = num1 + num2;
            System.out.println("Result of addition: " + result);
        } else if (operation.equals("sub")) {
            int result = num1 - num2;
            System.out.println("Result of Subtraction: " + result);
        }
     else if (operation.equals("sub")) {
            int result = num1 - num2;
            System.out.println("Result of Subtraction: " + result);
        }
     else if (operation.equals("multiplication")) {
            int result = num1 * num2;
            System.out.println("Result of multiplication: " + result);
        }
     else if (operation.equals("division")) {
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        }
    }
}
