package pittgpacalc;

import java.util.ArrayList;

/**
 *
 * @author Indiaminah
 */
public class SemesterData {
    
    private ArrayList classes = new ArrayList<>();
    private int creditsAttempted;
    private int creditsGained;
    private double semesterGPA;
    private int numClasses;
    // find a way to print all class information for this semester
    
    public SemesterData(){
        
        creditsAttempted = 0;
        creditsGained = 0;
        semesterGPA = 0.0;
        numClasses = 0;
    }
    
    public void add(CourseInformation course){
        //adds class to arraylist
        classes.add(course);
        numClasses++;
        
        //checks for failure
        if(!course.getGrade().equals("F")){
            creditsGained += course.getCreditNum();
        }
        
        semesterGPA = (semesterGPA*creditsAttempted + course.classGPA()*course.getCreditNum()) / (creditsAttempted + course.getCreditNum());
        
        creditsAttempted += course.getCreditNum();
    }
    
    public int creditsCompleted(){
        return creditsGained;
    }
    
    public int creditsAttempted(){
        return creditsAttempted;
    }
    
    public int classesTaken(){
        return numClasses;
    }
    
    public double termGPA(){
        return semesterGPA;
    }
    
}
