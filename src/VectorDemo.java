import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("James", "Smith", 121));
        employeeList.add(new Employee("John", "Doe", 11));
        employeeList.add(new Employee("Mike", "David", 1));

        employeeList.forEach(employee -> System.out.println(employee));
    }
}
