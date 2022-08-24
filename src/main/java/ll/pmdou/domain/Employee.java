package ll.pmdou.domain;

import java.util.Date;
import java.util.List;

public class Employee {
    private Integer eId;

    private String eName;

    private String ePass;

    private Integer eDid;

    private Date eUptime;

    //1对1 的 持有对象的表现方式
    private Info info;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    //多对多的 持有对象的表现方式
    private List<Project> projects;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getePass() {
        return ePass;
    }

    public void setePass(String ePass) {
        this.ePass = ePass;
    }

    public Integer geteDid() {
        return eDid;
    }

    public void seteDid(Integer eDid) {
        this.eDid = eDid;
    }

    public Date geteUptime() {
        return eUptime;
    }

    public void seteUptime(Date eUptime) {
        this.eUptime = eUptime;
    }
}