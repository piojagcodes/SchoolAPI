package pl.jagiello.school_app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.jagiello.school_app.dao.entity.Teacher;


@Repository
public interface SchoolAppRepoTeachers extends CrudRepository<Teacher, Long> {
    
}
