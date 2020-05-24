package whu.xsy.xmlWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import whu.xsy.xmlWeb.pojo.Course;
import whu.xsy.xmlWeb.pojo.Student;
import whu.xsy.xmlWeb.service.CourseService;
import whu.xsy.xmlWeb.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/index")
public class indexController {

    @Autowired
    StudentService studentService;

    @Autowired
    CourseService courseService;

    //获取所有学生
    @GetMapping(value = "/student",produces = "application/xml")
    @ResponseBody
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    //获取所有课程
    @GetMapping(value = "/course",produces = "application/xml")
    @ResponseBody
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }

    //上传一个学生
    @PostMapping(value = "/student",consumes = "application/xml")
    public void postStudent(@RequestBody Student student){
        studentService.postStudent(student);
    }


    //上传一个课程
    @PostMapping(value = "/course",consumes = "application/xml")
    public void postCourse(@RequestBody Course course){
        courseService.postCourse(course);
    }
}
