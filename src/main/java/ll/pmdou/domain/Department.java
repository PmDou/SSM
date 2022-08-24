package ll.pmdou.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Department implements Serializable {
    private Integer dId;

    private String dName;

    private Date dUptime;

    //1对多的 持有对象的表现方式
    private List<Employee> employees;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", dUptime=" + dUptime +
                ", employees=" + employees +
                '}';
    }

    public Department(String dName) {
        this.dName = dName;
    }

    public Department() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Date getdUptime() {
        return dUptime;
    }

    public void setdUptime(Date dUptime) {
        this.dUptime = dUptime;
    }
}