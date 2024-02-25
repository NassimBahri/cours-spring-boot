package ovh.nassimbahri.students.controllers;

import org.springframework.web.bind.annotation.*;
import ovh.nassimbahri.students.model.Student;
import ovh.nassimbahri.students.services.StudentService;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/Students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
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


}
