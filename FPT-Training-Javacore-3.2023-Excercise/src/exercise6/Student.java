package exercise6;

import exercise4_4.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    List<Student> studentList = new ArrayList<>();

    public void addStudent() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Them n sinh vien - n nhap tu ban phim: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name: ");
            String name = scanner.next();

            System.out.println("Enter age: ");
            int age = scanner.nextInt();

            System.out.println("Enter address: ");
            String address = scanner.next();

            Student student = new Student(name, age, address);
            studentList.add(student);
        }
    }

    public void getStudentInfo() {
        System.out.println("Hien thi thong tin sinh vien: ");
        for (Student student : studentList) {
            System.out.println("Tensv : " + student.getName());
            System.out.println("tuoi : " + student.getAge());
            System.out.println("dia chi : " + student.getAddress());
        }
    }

    public void filterStudentAge() {
        System.out.println("Hien thi thong tin sinh vien co tuoi = 20");
        int count = 0;
        for (Student student : studentList) {
            if (student.age == 20) {
                System.out.println("Tensv : " + student.getName());
                System.out.println("tuoi : " + student.getAge());
                System.out.println("dia chi : " + student.getAddress());
            }
        }
        if (count == 0) {
            System.out.println("Khong tim thay sinh vien phu hop");
        }
    }

    public void filterStudentAgeAndAddress() {
        System.out.println("Hien thi thong tin sinh vien co tuoi 23 va que DN: ");
        int count = 0;
        for (Student student : studentList) {
            if (student.age >= 23 && student.address.equals("DN")) {
                System.out.println("Tensv : " + student.getName());
                System.out.println("tuoi : " + student.getAge());
                System.out.println("dia chi : " + student.getAddress());
                count ++;
            }
//            else {
//                System.out.println("Khong tim thay sinh vien phu hop");
//            } // tim cach chi in ra 1 lan neu khong co thong tin nao phu hop => done (dung count de check)
        }
        if (count == 0) {
            System.out.println("Khong tim thay sinh vien phu hop");
        }
    }
}
