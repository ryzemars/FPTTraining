package exercise4_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TownManagement {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of member:");
            //scanner.nextLine();
            int num = scanner.nextInt();

            System.out.println("Enter address:");
            //scanner.nextLine();
            String address = scanner.next();

            // Enter person information
            List<Person> persons = new ArrayList<>();
            Person person;
            for (int j = 0; j < num; j++) {
                System.out.println("Enter name: ");
                String name = scanner.next();

                System.out.println("Enter age: ");
                int age = scanner.nextInt();

                System.out.println("Enter id: ");
                int id = scanner.nextInt();
                person = new Person(name, age, id);
                persons.add(person);
            }
            // After done input
            town.addFamily(new Family(num, address, persons));
        }
        System.out.println(town);

    }
}
