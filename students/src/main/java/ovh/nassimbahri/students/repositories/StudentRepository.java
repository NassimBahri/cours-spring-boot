package ovh.nassimbahri.students.repositories;

import org.springframework.stereotype.Repository;
import ovh.nassimbahri.students.model.Student;

import java.util.ArrayList;

@Repository
public class StudentRepository {

    private ArrayList<Student> students;

    public StudentRepository(){
        this.students = new ArrayList<>();
        this.students.add(new Student(1, "Etudiant 1", "GL 4"));
        this.students.add(new Student(2, "Etudiant 2", "BI 4"));
    }

    public void insertStudent(Student student){
        this.students.add(student);
    }

    public ArrayList<Student> getAll(){
        return this.students;
    }


}
