package pl.jagiello.school_app.dao;

import org.springframework.data.repository.CrudRepository;
import pl.jagiello.school_app.dao.entity.Student;

public interface SchoolAppRepoStudents extends CrudRepository<Student, Long> {
    
}
