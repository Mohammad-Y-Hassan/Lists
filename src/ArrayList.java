import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Employee> employeeList = new java.util.ArrayList<>();
        employeeList.add(new Employee("Joseph", "Jostar", 123));
        employeeList.add(new Employee("Fred", "Erwin", 456));
        employeeList.add(new Employee("Emily", "Wilson", 789));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.isEmpty());
        System.out.println();
        employeeList.set(0, new Employee("Johnathan", "Jostar", 123));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println();
        System.out.println(employeeList.size());


        employeeList.add(3, new Employee("John", "Doe", 111));
        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println();
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
        System.out.println(employeeList.contains(new Employee("John", "Doe", 111)));
        System.out.println(employeeList.indexOf(new Employee("Emily", "Wilson", 789)));

        employeeList.remove(1);
        System.out.println();
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
