public class Program24 {
    /*Write a program to create 3 overloaded constructors and
    print all the 3 overloaded constructors.*/

    private int value;

    public static void main(String[] args) {
        // Creating objects using different constructors
        Program24 obj1 = new Program24();
        Program24 obj2 = new Program24(5);
        Program24 obj3 = new Program24(3,7);
    }

    public Program24() {
        System.out.println("First constructor with no parameters called.");
        this.value = 0;
    }
    public Program24(int value) {
        System.out.println("Second constructor with one parameter called = " + value);
        this.value = value;
    }
    public Program24(int value1, int value2) {
        System.out.println("Third constructor with two parameters called = : " + value1 + ", " + value2);
        this.value = value1 + value2;
    }


    }

