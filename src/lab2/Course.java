
package lab2;
/**
*
* @author Justin Potts
* This is the interface that defines course
* 
* 
*/
public interface Course {
    
public abstract void CourseDetails();

public abstract String getCourseName();

public abstract String getCourseNumber();

public abstract double getCredits();

public abstract void setCourseName(String courseName);

public abstract void setCourseNumber(String courseNumber);

public abstract void setCredits(double credits);
}