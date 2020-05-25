package whu.xsy.xmlWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import whu.xsy.xmlWeb.pojo.Student;
import whu.xsy.xmlWeb.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/index")
public class indexController {

    @Autowired
    StudentService studentService;

    //获取所有学生
    @GetMapping(value = "/student",produces = "application/xml")
    @ResponseBody
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
    }

    //上传一个学生
    @PostMapping(value = "/student",consumes = "application/xml")
    public void postStudent(@RequestBody Student student){
        studentService.postStudent(student);
    }

    //更新一个学生
    @PutMapping(value = "/student",consumes = "application/xml")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    //删除一个学生
    @DeleteMapping(value = "/student/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }


}
