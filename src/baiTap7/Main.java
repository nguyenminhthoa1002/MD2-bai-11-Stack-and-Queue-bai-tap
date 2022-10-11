package baiTap7;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Queue<Student> students = new ArrayDeque<>();
        System.out.println("Enter the number of Student you want to input: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.printf("Enter Information for Student %d\n", i + 1);
            Student student = new Student();
            student.inputStudent(scanner);
            students.offer(student);
        }

        List<Student> maleStudent = new ArrayList<>();
        List<Student> femaleStudent = new ArrayList<>();
        for (Student listStudent : students) {
            if (listStudent.getGender().equals("Male")) {
                maleStudent.add(listStudent);
            } else {
                femaleStudent.add(listStudent);
            }
        }

        System.out.println("Male Student: ");
        System.out.printf("%-25s%-15s%-50s\n","Student Name","Gender","BirthDate");
        Collections.sort(maleStudent);
        for (Student maleStudentList : maleStudent) {
            maleStudentList.displayStudent();
        }

        System.out.println("\nFemale Student: ");
        System.out.printf("%-25s%-15s%-50s\n","Student Name","Gender","BirthDate");
        Collections.sort(femaleStudent);
        for (Student femaleStudentList : femaleStudent) {
            femaleStudentList.displayStudent();
        }
    }
}
