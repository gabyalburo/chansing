package gradeexperiment;
//main
import java.util.Scanner;

public class GradeExperiment {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        grades call = new grades();
        
        grades[] gr = new grades[100];
        
        System.out.println("Enter no. of Students: ");
        int studentNum = sc.nextInt();
        
        for(int i = 0; i < studentNum; i++){
            
            gr[i] = new grades();
            
            System.out.println("Enter Details of Student "+(i+1));
            System.out.print(" ID: ");
            int id = sc.nextInt();
            System.out.print(" Name: ");
            String name = sc.next();
            System.out.print(" Prelim: ");
            double prelim = sc.nextDouble();
            System.out.print(" Midterm: ");
            double midterm = sc.nextDouble();
            System.out.print(" PreFinal: ");
            double prefi = sc.nextDouble();
            System.out.print(" Final: ");
            double finals = sc.nextDouble();
            
            gr[i].inputGrades(name, id, prelim, midterm, prefi, finals);
            
        }
       
        double ave = 0, cave = 0;
        
        for (int i = 0; i < studentNum; i++){
            
            gr[i].viewGrades();
            ave = ave + ((gr[i].sP + gr[i].sM + gr[i].sPf +gr[i].sF) / 4);
            cave = cave + ave;
            
        }
        
        System.out.println("Class Average: "+cave);
            
    }
    
}
