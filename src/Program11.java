import java.util.HashMap;
import java.util.Map;
public class Program11 {
        public static void main(String[] args) {
            Map<Integer, String> employeeMap = new HashMap<>();


            employeeMap.put(123, "Jadeja");
            employeeMap.put(124, "Karthi");
            employeeMap.put(125, "Sai");

            int empNo = 124;
            if (employeeMap.containsKey(empNo)) {
                String empName = employeeMap.get(empNo);
                System.out.println("EmpName for EmpNo " + empNo + " is: " + empName);
            } else {
                System.out.println("Employee not found for EmpNo " + empNo);
            }
        }
    }
