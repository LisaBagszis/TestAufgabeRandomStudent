package model1;

import model1.StudentDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentDB {

    ArrayList<Student> students;

    public StudentDB(ArrayList<Student> students) {
        this.students = students;

    }

    public ArrayList<Student> getAllStudents() {
        return students;
    } //Rückgabe wird angegegebn

    public Student randomStudent() {
        // 2           = 0.9      *        3
        int random = (int) (Math.random() * students.size());
        return students.get(random);
    }


    public Student findById(String searchId) {

        for (Student item : students) {

            if (item.getId().equals(searchId)) {
                return item;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}

