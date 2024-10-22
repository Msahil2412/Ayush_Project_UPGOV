package ayush.project.sourcecode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CentersCollection {
    
    @Id
    private int cid;
    private String cname;
    private String cregion;
    private int capplicant;
    @Override
    public String toString() {
        return "CentersCollectio [cid=" + cid + ", cname=" + cname + ", cregion=" + cregion + ", caddress=" + capplicant
                + "]";
    }
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCregion() {
        return cregion;
    }
    public void setCregion(String cregion) {
        this.cregion = cregion;
    }
    public int getCapplicant() {
        return capplicant;
    }
    public void setCapplicant(int capplicant) {
        this.capplicant = capplicant;
    }

}
