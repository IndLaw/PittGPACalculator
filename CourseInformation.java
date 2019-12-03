package pittgpacalc;

/**
 *
 * @author Indiaminah
 */
public class CourseInformation implements CourseInterface{
    
    private String courseName;
    private int creditNum;
    private boolean courseRT;
    private String letterGrade;
    private double gpa;
    
    
    public CourseInformation(){
        
        courseName = "";
        creditNum = 0;
        courseRT = false;
        letterGrade = "";
        gpa = 0.00;
        
    }

    @Override
    public void courseName(String name) {
      courseName = name;
    }
    
    public String getName(){
        
        return courseName;
    }

    @Override
    public void numOfCredits(int credits) {
        creditNum = credits;
    }
    
    public int getCreditNum(){
        return creditNum;
    }

     @Override
    public void gradeEarned(String grade) {
        //assumes grade is in proper format
        //I guess it should be formatted for option boxes
        String temp = grade.substring(0, 1).toUpperCase() + grade.substring(1);
        letterGrade = temp;
    }
    
    public String getGrade(){
        return letterGrade;
    }

    
    @Override
    public void retake(boolean isRetake) {
         courseRT = isRetake;
    }
    
    public boolean isRetake(){
        return courseRT;
    }

    // Based on University of Pittsburgh grade scale
    // May change to allow gpa adjustment 
    public double classGPA(){
                
        switch(this.letterGrade){
            
            case "A+":  gpa = 4.0;
                        break;
            case "A":   gpa = 4.0;
                        break;
            case "A-":  gpa = 3.75;
                        break;
            case "B+":  gpa = 3.25;
                        break;
            case "B":   gpa = 3.0;
                        break;
            case "B-":  gpa = 2.75;
                        break;
            case "C+":  gpa = 2.25;
                        break;
            case "C":   gpa = 2.0;
                        break;
            case "C-":  gpa = 1.75;
                        break;
            case "D+":  gpa = 1.25;
                        break;
            case "D":   gpa = 1.0;
                        break;
            case "D-":  gpa = 0.75;
                        break;
            case "F":   gpa = 0.0;
                        break;
            //possibly add s/nc option
            
        }
        return gpa;
    }
    
 

   
    
}
