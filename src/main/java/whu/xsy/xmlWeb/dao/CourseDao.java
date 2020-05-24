package whu.xsy.xmlWeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import whu.xsy.xmlWeb.pojo.Course;


public interface CourseDao extends JpaRepository<Course,Integer> {
}
