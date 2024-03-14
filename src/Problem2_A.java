public class Problem2_A {





    public static void main(String args[]) {
        Problem2_B objB = new Problem2_B();
        System.out.println(objB.amount);
        Problem2_B objB1 = new Problem2_B(50);
        System.out.println("Print the variable a from Class A with the value declared from Class B = "+objB1.amount);

        Problem2_B objB2 = new Problem2_B(1000,20);
        System.out.println("Where use constructor to reset the value of the variable from Class_A to Class B = " +objB2.b +" and value of C = "+ objB2.c);

    }


}
