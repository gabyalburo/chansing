package gradeexperiment;

public class grades {
    
    public String sName;
    public int sId;
    public double sP, sM, sPf, sF;
    
    public void inputGrades(String name, int id, double p, double m, double pf, double f){
        
        this.sName = name;
        this.sId = id;
        this.sP = p;
        this.sM = m;
        this.sPf = pf;
        this.sF = f;
        
    }
    
    public void viewGrades(){
        
        double average = (this.sP + this.sM + this.sPf + this.sF) / 4;
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                        "ID", "Name", "Prelim", "Midterm", "PreFi", "Finals", "Average", "Remarks");       
        System.out.printf("%-10d %-10s %-10.1f %-10.1f %-10.1f %-10.1f %-10.1f %-10s\n",
                        this.sId, this.sName, this.sP, this.sM, this.sPf, this.sF, average, remarks);
    }

}

