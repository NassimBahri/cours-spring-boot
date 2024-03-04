package ovh.nassimbahri.students.services;

import ovh.nassimbahri.students.model.Student;

import java.util.ArrayList;
import java.util.Optional;

public interface IStudentService {

    void addStudent(Student student);
    ArrayList<Student> getAllStudent();
    boolean deleteStudent(int id);
    Student updateStudent(Student student);
    Student getById(int id);

}
