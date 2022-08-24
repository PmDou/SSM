package ll.pmdou.domain;

import java.util.Date;

public class Info {
    private Integer iId;

    private String iPhone;

    private Integer iEid;

    private Date iUptime;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public String getiPhone() {
        return iPhone;
    }

    public void setiPhone(String iPhone) {
        this.iPhone = iPhone;
    }

    public Integer getiEid() {
        return iEid;
    }

    public void setiEid(Integer iEid) {
        this.iEid = iEid;
    }

    public Date getiUptime() {
        return iUptime;
    }

    public void setiUptime(Date iUptime) {
        this.iUptime = iUptime;
    }
}