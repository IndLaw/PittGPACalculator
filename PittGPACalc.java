/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pittgpacalc;

/**
 *
 * @author Indiaminah
 */
public class PittGPACalc {

    // maybe consider major gpa and gpa overall?
    // most common type of grade? Statistics
    // A way to adjust grade weights
    // add or remove term
    // add or remove grade
    
    public static void main(String[] args) {
        
        CourseInformation course1 = new CourseInformation();
        CourseInformation course2 = new CourseInformation();
        CourseInformation course3 = new CourseInformation();
        CourseInformation course4 = new CourseInformation();
        CourseInformation course5 = new CourseInformation();
        
        SemesterData fall1 = new SemesterData();
        
        course1.courseName("Philosophy of Religion");
        course1.gradeEarned("B-");
        course1.numOfCredits(3);
        course2.courseName("Data Structures");
        course2.gradeEarned("F");
        course2.numOfCredits(3);
        course3.courseName("Discrete Structures");
        course3.gradeEarned("B");
        course3.numOfCredits(3);
        course4.courseName("Calculus 1");
        course4.gradeEarned("F");
        course4.numOfCredits(4);
        course5.courseName("Spanish 1");
        course5.gradeEarned("B");
        course5.numOfCredits(5);
        
        fall1.add(course1);
        System.out.println(fall1.classesTaken());
        System.out.println(fall1.creditsAttempted());
        System.out.println(fall1.creditsCompleted());
        System.out.println(fall1.termGPA());
        System.out.println("===========================================");
        fall1.add(course2);
        System.out.println(fall1.classesTaken());
        System.out.println(fall1.creditsAttempted());
        System.out.println(fall1.creditsCompleted());
        System.out.println(fall1.termGPA());
        System.out.println("===========================================");
        fall1.add(course3);
        System.out.println(fall1.classesTaken());
        System.out.println(fall1.creditsAttempted());
        System.out.println(fall1.creditsCompleted());
        System.out.println(fall1.termGPA());
        System.out.println("===========================================");
        fall1.add(course4);
        System.out.println(fall1.classesTaken());
        System.out.println(fall1.creditsAttempted());
        System.out.println(fall1.creditsCompleted());
        System.out.println(fall1.termGPA());
        System.out.println("===========================================");
        fall1.add(course5);
        System.out.println(fall1.classesTaken());
        System.out.println(fall1.creditsAttempted());
        System.out.println(fall1.creditsCompleted());
        System.out.println(fall1.termGPA());
        System.out.println("===========================================");
        
        
        
        
    }
    
}
