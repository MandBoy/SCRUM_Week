package Plane;

import java.util.ArrayList;

public class Plane{
    private ArrayList<Plane> planes;
    private int date;
    private String ArrDep;
    private String Routenr;
    private int STASTD;
    private String AC;
    private String OrgDes;

    public Plane(){}

    public int getDate() { return date; }
    public void setDate(int date) { this.date = date; }
    public String getArrDep() { return ArrDep; }
    public void setArrDep(String arrDep) { ArrDep = arrDep; }
    public String getRoutenr() { return Routenr; }
    public void setRoutenr(String routenr) { Routenr = routenr; }
    public int getSTASTD() { return STASTD; }
    public void setSTASTD(int STASTD) { this.STASTD = STASTD; }
    public String getAC() { return AC; }
    public void setAC(String AC) { this.AC = AC; }
    public String getOrgDes() { return OrgDes; }
    public void setOrgDes(String orgDes) { OrgDes = orgDes; }
}
