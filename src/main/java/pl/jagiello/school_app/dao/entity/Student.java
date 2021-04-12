package pl.jagiello.school_app.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Student {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String email_address;
    private String subject;
    
    
    public Student() {
    
    }
    
    public Student(Long id, String name, String surname, int age,String email_address, String subject) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email_address = email_address;
        this.subject = subject;
    
    }

 
            
    
}
