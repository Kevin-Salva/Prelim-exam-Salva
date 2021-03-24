package Repo;

public class Student {
    private int StudID;
    int credits;
    int points;
    double gpa;

    public void setID (int ID){
        ID = StudID;
    }
    public int getID(){
        return StudID;
    }
    public void setCredits(int credit){
        credits=credit;
    }
    public int getCredits(){
        return credits;
    }
    public void setPoints(int point){
        points=point;
    }
    public double getPoints(){
        return points;
    }
    public double calGPA(double gradepoint){
        gradepoint = points/credits;
        return gradepoint;
    }
    public void printMessage(){
        System.out.println("Credits: "+credits);
        System.out.println("Points: "+points);
        System.out.println("The GPA is: "+gpa);
    }

}
