package p1;
// Generated Sep 3, 2012 12:58:03 AM by Hibernate Tools 3.2.1.GA



/**
 * Employee generated by hbm2java
 */
public class Employee  implements java.io.Serializable {


     private Integer eid;
     private String firstno;
     private String lastno;
     private String email;

    public Employee() {
    }

    public Employee(String firstno, String lastno, String email) {
       this.firstno = firstno;
       this.lastno = lastno;
       this.email = email;
    }
   
    public Integer getEid() {
        return this.eid;
    }
    
    public void setEid(Integer eid) {
        this.eid = eid;
    }
    public String getFirstno() {
        return this.firstno;
    }
    
    public void setFirstno(String firstno) {
        this.firstno = firstno;
    }
    public String getLastno() {
        return this.lastno;
    }
    
    public void setLastno(String lastno) {
        this.lastno = lastno;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


