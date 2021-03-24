package Repo;

public class ShowStudent {
    public static void main(String[] args)
    {

//Create student object
        Student student1 = new Student();
//Set student parameters
        student1.setCredits(4);
        student1.setID(1);
        student1.setPoints(4);
//Calculate GPA and assign to variable
        double gradepoint = student1.calGPA(student1.getPoints(), student1.getCredits());

//Print results
        System.out.println("Student ID: " + student1.getID());
        System.out.println("Number of credits: " + student1.getCredits());
        System.out.println("Number of points: " + student1.getPoints());
        System.out.println("GPA: " + gradepoint);

//New Code By Patrick
        System.out.println("Perde kami sa CBA valo");
    }//End main method

}//end class

