package whu.xsy.xmlWeb.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import whu.xsy.xmlWeb.pojo.Student;

public interface StudentDao  extends JpaRepository<Student,Integer> {
}
