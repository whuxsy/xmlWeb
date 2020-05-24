package whu.xsy.xmlWeb.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@JacksonXmlRootElement(localName = "course")
public class Course {
    private int cid;
    private String cname;
    private Double credit;

    @Id
    @Column(name = "cid")
    @JacksonXmlProperty(isAttribute = true,localName = "cid")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "cname")
    @JacksonXmlProperty(localName = "cname")
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Basic
    @Column(name = "credit")
    @JacksonXmlProperty(localName = "credit")
    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return cid == course.cid &&
                Objects.equals(cname, course.cname) &&
                Objects.equals(credit, course.credit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, cname, credit);
    }
}
