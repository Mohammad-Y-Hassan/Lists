import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 123);
        Employee employee2 = new Employee("Will", "Smith", 456);
        Employee employee3 = new Employee("Steve", "Erwin", 789);
        Employee employee4 = new Employee("James", "Smith", 012);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

    }
}
