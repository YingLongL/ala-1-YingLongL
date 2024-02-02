package CSE_017.ALA_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Student(3, "Alice", "123 Street", "123-456-7890", "alice@email.com", "Computer Science");
        people[1] = new Faculty(2, "Bob", "456 Lane", "098-765-4321", "bob@email.com", "Professor", 50000.00, "Senior");
        people[2] = new Employee(1, "Charlie", "789 Road", "555-555-5555", "charlie@email.com", "Administrator", 40000.00);

        System.out.println("Before Sorting:");
        printArray(people);

        sortArray(people, true);
        System.out.println("\nSorted by Name:");
        printArray(people);

        sortArray(people, false);
        System.out.println("\nSorted by ID:");
        printArray(people);
    }

    public static void printArray(Person[] array) {
        for (Person p : array) {
            System.out.println(p);
        }
    }

    public static void sortArray(Person[] array, boolean byName) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (byName) {
                    if (array[j].getName().compareTo(array[minIndex].getName()) < 0) {
                        minIndex = j;
                    }
                } else {
                    if (array[j].getID() < array[minIndex].getID()) {
                        minIndex = j;
                    }
                }
            }
            Person temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}

