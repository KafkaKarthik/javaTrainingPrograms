public class Problem3 {
    public void errorAge(int age) throws Exception {

        if(age<25 || age>55 ) {
            throw new Exception("Entered Age is not in the Rang of 25 to 55 = "+age);
        }

    }

    public static void main(String[] args) throws Exception {
        Problem3 age = new Problem3();
        age.errorAge(10);
    }
}
