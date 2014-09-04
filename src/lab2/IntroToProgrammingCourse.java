/**
*
* @author Justin Potts
* 
* 
* 
*/

package lab2;


public class IntroToProgrammingCourse implements Course {
private String courseName;
private String courseNumber;
private double classCredits;

public String getCourseName(){
return courseName;
}
public void setCourseName(String courseName){
if(courseName == null || courseName.length() == 0) {
System.out.println("Error: courseName cannot be null of empty string");
}
this.courseName = courseName;
}
public String getCapitalizedCourseName() {
return this.getCourseName().toUpperCase();
}

public String getCourseNumber(){
return courseNumber;
}

public void setCourseNumber(String courseNumber){
if(courseNumber == null || courseNumber.length() == 0) {
System.out.println("Error: Course number cannot be null of empty string");
}
this.courseNumber = courseNumber;
}
public double getClassCredits(){
return classCredits;
}

public void setClassCredits(double classCredits){
if(classCredits < 0.5 || classCredits > 4.0) {
System.out.println("Error: Credits must be in the range 0.5 to 4.0");
}
this.classCredits = classCredits;
}

public void printClassName(){
System.out.println("Course Name: " + getCapitalizedCourseName());
};
public void printClassNumber(){
System.out.println("Course Number: " + courseNumber);
};

public void printClassCredits(){
System.out.println("Class Credits: " + classCredits);
};

public void generateClassInfo(){
printClassName();
printClassNumber();
printClassCredits();
}

public void printClassInfo(){
generateClassInfo();
}

    public void CourseDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getCredits() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCredits(double credits) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}