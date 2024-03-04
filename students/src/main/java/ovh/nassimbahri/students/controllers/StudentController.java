package ovh.nassimbahri.students.controllers;

import org.springframework.web.bind.annotation.*;
import ovh.nassimbahri.students.model.Student;
import ovh.nassimbahri.students.services.IStudentService;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/Students")
public class StudentController {

    private final IStudentService service;

    public StudentController(IStudentService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ArrayList<Student> showListStudents(){
        return this.service.getAllStudent();
    }

    @PostMapping("/insert")
    public void addStudent(@RequestBody Student student){
        this.service.addStudent(student);
    }


    @GetMapping("/get/{id}")
    public Student recupererStudentByMatricule(@PathVariable("id") int id){
        return this.service.getById(id);
    }

    @GetMapping("/student")
    public Student recupererStudentByMatricule2(@RequestParam("id") int id){
        return this.service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String removeStudent(@PathVariable("id") int id){
        if(service.deleteStudent(id)){
            return "Bravo! Cet étudiant a bien été supprimé.";
        }
        else{
            return "Erreur! L'étudiant demandé n'existe pas.";
        }
    }

    @PutMapping("/edit")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }


}
