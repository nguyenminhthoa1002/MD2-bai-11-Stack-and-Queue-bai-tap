package baiTap7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private String studentName;
    private String gender;
    private Date birthDay;

    public Student() {
    }

    public Student(String studentName, String gender, Date birthDay) {
        this.studentName = studentName;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void inputStudent(Scanner scanner) throws ParseException {
        System.out.println("Enter Student Name: ");
        this.studentName = scanner.nextLine();
        System.out.println("Choose Student Gender: ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("Your choice is: ");
        boolean checkGender = true;
        do {
            int choiceGender = Integer.parseInt(scanner.nextLine());
            switch (choiceGender) {
                case 1:
                    this.gender = "Male";
                    checkGender = false;
                    break;
                case 2:
                    this.gender = "Female";
                    checkGender = false;
                    break;
                default:
                    System.err.println("Please choose 1 or 2");
            }
        } while (checkGender);
        System.out.println("Enter Student BirthDate (dd/MM/yyyy): ");
        String birthDateStr = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = simpleDateFormat.parse(birthDateStr);
        this.birthDay = birthDate;
    }

    public void displayStudent() {
        System.out.printf("%-25s%-15s%-50s\n",this.studentName,this.gender,this.birthDay);
    }

    @Override
    public int compareTo(Student o) {
        return this.getBirthDay().compareTo(o.getBirthDay());
    }
}
