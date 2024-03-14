import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
public class Problem6 {

        public static void main(String[] args) {

            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 200; i <= 500; i++) {
                arrayList.add(i);
            }
            System.out.println("ArrayList: " + arrayList);
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 200; i <= 500; i++) {
                hashSet.add(i);
            }
            System.out.println("HashSet: " + hashSet);
            // TreeSet
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 200; i <= 500; i++) {
                treeSet.add(i);
            }
            System.out.println("TreeSet: " + treeSet);
        }


}
