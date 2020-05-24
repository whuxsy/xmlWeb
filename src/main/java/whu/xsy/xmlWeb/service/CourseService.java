package whu.xsy.xmlWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whu.xsy.xmlWeb.dao.CourseDao;
import whu.xsy.xmlWeb.pojo.Course;
import whu.xsy.xmlWeb.pojo.Student;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseDao courseDao;

    public List<Course> getAllCourse(){
        return courseDao.findAll();
    }

    public void postCourse(Course course){
        courseDao.save(course);
    }
}
