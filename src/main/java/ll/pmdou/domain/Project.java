package ll.pmdou.domain;

import java.util.Date;
import java.util.List;

public class Project {
    private Integer pId;

    private String pName;

    private Date pUptime;

    //多对多的 持有对象的表现方式
    private List<Employee> employees;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Date getpUptime() {
        return pUptime;
    }

    public void setpUptime(Date pUptime) {
        this.pUptime = pUptime;
    }
}