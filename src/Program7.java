public class Program7 {


        public static void main(String[] args){
            Program7 abc = new Program7();
            System.out.println(abc.returnNumbers());

        }
        public  int returnNumbers()
        {
            int c = 0;
            float a = 7.8f;
            float b = 4.4f;
            c = (int)a + (int)b;
            //c=a+b;
            return c;
        }



}
