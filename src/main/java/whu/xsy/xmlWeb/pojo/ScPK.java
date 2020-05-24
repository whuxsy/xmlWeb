package whu.xsy.xmlWeb.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ScPK implements Serializable {
    private int sid;
    private int cid;

    @Column(name = "sid")
    @Id
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Column(name = "cid")
    @Id
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScPK scPK = (ScPK) o;
        return sid == scPK.sid &&
                cid == scPK.cid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, cid);
    }
}
