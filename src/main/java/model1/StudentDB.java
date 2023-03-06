package model1;

import model1.StudentDB;

import java.util.Arrays;

public class StudentDB {

    private Student [] students;

   public StudentDB(Student[] students) {
    this.students = students;

        }
   public Student[] getAllStudents() {
            return students;
        }

   public Student randomStudent() {
       // 2           = 0.9      *        3
        int random = (int) (Math.random() * students.length);
       return students[random];
        }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}

