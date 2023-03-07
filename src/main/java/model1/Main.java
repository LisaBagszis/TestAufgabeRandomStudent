package model1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("55", "Anna");
        Student student2 = new Student("56", "Peter");
        Student student3 = new Student("99", "Dieter");

        //Student[] allStudents = new Student[3];

        /*allStudents[0] = student1;
        allStudents[1] = student2;
        allStudents[2] = student3;*/

        ArrayList<Student> allStudents = new ArrayList<>(Arrays.asList(student1, student2, student3));
        StudentDB studentDB = new StudentDB(allStudents);

        System.out.println(studentDB);
        System.out.println(studentDB.getAllStudents());
        System.out.println(studentDB.randomStudent());

        System.out.println("rausgesucht: ");
        try {
            System.out.println(studentDB.findById("569"));
        } catch (NoSuchElementException e) {
            System.out.println("nicht gefunden");
        }
    }
}


