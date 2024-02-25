package ovh.nassimbahri.students.services;

import org.springframework.stereotype.Service;
import ovh.nassimbahri.students.model.Student;
import ovh.nassimbahri.students.repositories.StudentRepository;

import java.util.ArrayList;

@Service
public class StudentService {

    private StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    public void addStudent(Student student){
        this.repository.insertStudent(student);
    }

    public ArrayList<Student> getAllStudent(){
        return this.repository.getAll();
    }


}
