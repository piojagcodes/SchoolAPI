
package pl.jagiello.school_app;

import pl.jagiello.school_app.dao.entity.Teacher;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teachers")
public class TeachersController {
 
    private List<Teacher> teachers;
    
    
    public TeachersController() {
   
        
    

        
    
    
    teachers = new ArrayList();
    teachers.add(new Teacher(1L,"John","Kowalski", 23, "kowalski@gmail.com", "Chemistry"));
    teachers.add(new Teacher(2L,"Brad","Smith", 23, "smith@gmail.com", "Physics"));
    
    
    
    }
    
    
    
    @GetMapping("/all")
    public List<Teacher> getAll() {
        return teachers;
    }
    
    
    
    @GetMapping("/all/get_Teacher_Surname")
    public Teacher get_Teacher_Surname(@RequestParam String Teacher_Surname) {
        Optional<Teacher> first = teachers.stream().
                filter(element -> element.getSurname().equals(Teacher_Surname)).findFirst();
        return first.get();
    
    }
    
        @GetMapping("/all/get_Teacher_Name")
    public Teacher get_Teacher_Name(@RequestParam String Teacher_Name) {
        Optional<Teacher> first = teachers.stream().
                filter(element -> element.getName().equals(Teacher_Name)).findFirst();
        return first.get();
    
    }
    
    @PostMapping
      public boolean addTeacher(@RequestBody Teacher teacher) {
        return teachers.add(teacher);
    }
      
     @PutMapping
      public boolean updateTeacher(@RequestBody Teacher teacher) {
          return teachers.add(teacher);
      
      }
    @DeleteMapping
      public boolean deleteTeacher(@RequestParam String Teacher_Surname) {
          return teachers.removeIf(element -> element.getSurname().equals(Teacher_Surname));
      
      }
   
      }


    
    

    
    
    
    
    
   
    
 
    
    

