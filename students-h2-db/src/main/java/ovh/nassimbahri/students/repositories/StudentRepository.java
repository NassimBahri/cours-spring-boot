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

    public Student getById(int id){
        /*for(int i = 0; i < students.size(); i++){
            if(students.get(i).getMatricule() == id){
                return students.get(i);
            }
        }*/
        for (Student student: students){
            if(student.getMatricule() == id){
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent(int id){
        Student student = this.getById(id);
        if(student == null){
            return false;
        }
        students.remove(student);
        return true;
    }

    public Student updateStudent(Student newStudent){
        Student student = this.getById((int) newStudent.getMatricule());
        if(student != null){
            student.setNom(newStudent.getNom());
            student.setNiveau(newStudent.getNiveau());
        }
        return student;
    }


}
