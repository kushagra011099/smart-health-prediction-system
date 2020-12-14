/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthsystem.pojo;


public class Disease {

    public Disease() {
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getSym1() {
        return sym1;
    }

    public void setSym1(String sym1) {
        this.sym1 = sym1;
    }

    public String getSym2() {
        return sym2;
    }

    public void setSym2(String sym2) {
        this.sym2 = sym2;
    }

    public String getSym3() {
        return sym3;
    }

    public void setSym3(String sym3) {
        this.sym3 = sym3;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public Disease(String dname, String sym1, String sym2, String sym3, String doctorname) {
        this.dname = dname;
        this.sym1 = sym1;
        this.sym2 = sym2;
        this.sym3 = sym3;
        this.doctorname = doctorname;
    }
    private String dname;
    private String sym1;
    private String sym2;
    private String sym3;
    private String doctorname;
}
