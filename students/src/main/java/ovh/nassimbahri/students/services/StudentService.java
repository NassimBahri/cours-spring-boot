package ovh.nassimbahri.students.services;

import org.springframework.stereotype.Service;
import ovh.nassimbahri.students.model.Student;
import ovh.nassimbahri.students.repositories.StudentRepository;

import java.awt.desktop.OpenURIEvent;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

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

    @Override
    public boolean deleteStudent(int id) {
        return repository.deleteStudent(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public Student getById(int id) {
        return repository.getById(id);
    }


}
