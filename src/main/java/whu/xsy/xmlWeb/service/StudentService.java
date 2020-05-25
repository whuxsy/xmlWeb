package whu.xsy.xmlWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import whu.xsy.xmlWeb.dao.StudentDao;
import whu.xsy.xmlWeb.pojo.Student;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;


    public List<Student> getAllStudents(){
        return studentDao.findAll();
    }

    public void postStudent(Student student){
        studentDao.save(student);
    }

    public void updateStudent(Student student){
        studentDao.save(student);
    }

    public void deleteStudent(int id){
        studentDao.deleteById(id);
    }
}
