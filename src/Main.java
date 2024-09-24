import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 123);
        Employee employee2 = new Employee("Will", "Smith", 456);
        Employee employee3 = new Employee("Steve", "Erwin", 789);
        Employee employee4 = new Employee("James", "Smith", 122);
        Employee employee5 = new Employee("Bob", "Ross", 998);


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

        EmployeeDoublyLinkedList list1 = new EmployeeDoublyLinkedList();
        list1.addToFront(employee1);
        list1.addToFront(employee2);
        list1.addToFront(employee3);

        list1.printList();
        System.out.println(list1.getSize());

        list1.addToEnd(employee4);
        list1.printList();
        System.out.println(list1.getSize());

        list1.removeFromFront();
        list1.printList();
        System.out.println(list1.getSize());

        list1.removeFromEnd();
        list1.printList();
        System.out.println(list1.getSize());

        LinkedList<Employee> list2 = new LinkedList<>();

        list2.addFirst(employee1);
        list2.addFirst(employee2);
        list2.addFirst(employee3);
        list2.addFirst(employee4);

        printList(list2);

        // Adds to end of list
        list2.add(employee5);
        printList(list2);

        // Removes first
        list2.remove();
        printList(list2);

        list2.removeLast();
        printList(list2);

        EmployeeDoublyLinkedList list3 = new EmployeeDoublyLinkedList();

        list3.addToFront(employee1);
        list3.addToFront(employee2);
        list3.addToFront(employee3);
        list3.addToFront(employee4);


        list3.addBefore(employee5, employee2);
        list3.printList();
    }
    public static void printList(LinkedList<Employee> list) {
        Iterator<Employee> iterate = list.iterator();
        System.out.print("HEAD -> ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + " <=> ");
        }
        System.out.println("null");
    }


}
