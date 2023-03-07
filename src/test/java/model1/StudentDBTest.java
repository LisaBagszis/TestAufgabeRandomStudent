package model1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

@Test
void parameterIdShouldReturnStudent() {

    //Given
    Student student1 = new Student("1", "Anna");
    Student student2 = new Student ("2", "Paul");
    Student[] students = {student1, student2};
    StudentDB studentdb = new StudentDB(students);

    //When
    Student actual = studentdb.findById("2");

    //Then
    assertEquals(student2, actual);
    }

@Test
void shouldReturnStudentOne() {

    //Given
    Student student1 = new Student("1", "Anna");
    Student student2 = new Student ("2", "Paul");
    Student[] students = {student1, student2};
    StudentDB studentdb = new StudentDB(students);

    //When
    Student actual = studentdb.findById("1");

    //Then
    assertEquals(student1, actual);
}



}