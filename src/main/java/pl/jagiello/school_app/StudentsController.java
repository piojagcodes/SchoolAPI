
package pl.jagiello.school_app;

import pl.jagiello.school_app.dao.entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/students")
public class StudentsController {
    
    private List<Student> students;
    
    
    
    public StudentsController() {
            
    students = new ArrayList();
    
    students = new ArrayList();
    students.add(new Student(1L,"Kermit", "The Frog", 20, "kermit@gmail.com", "Chemistry"));
    students.add(new Student(2L,"Mister", "Oizo", 21, "oizo@gmail.com", "Physics"));  
    
    }
    
    
     @GetMapping("/all")
    public List<Student> getAll() {
        return students;
    }
    
    
        @GetMapping("/all/get_Students_Surname")
    public Student get_Student_Surname(@RequestParam String Student_Surname) {
        Optional<Student> first = students.stream().
                filter(element -> element.getSurname().equals(Student_Surname)).findFirst();
        return first.get();
    
    }
    
        @GetMapping("/all/get_Student_Name")
    public Student get_Teacher_Name(@RequestParam String Student_Name) {
        Optional<Student> first = students.stream().
                filter(element -> element.getName().equals(Student_Name)).findFirst();
        return first.get();
    
    }
        @PostMapping
    public boolean addStudent(@RequestBody Student student) {
        return students.add(student);
    }
    
     @PutMapping
      public boolean updateStudent(@RequestBody Student student) {
          return students.add(student);
      
      }
   
       @DeleteMapping
      public boolean deleteStudent(@RequestParam String Student_Surname) {
          return students.removeIf(element -> element.getSurname().equals(Student_Surname));
      
      }
    
    
    
    
}