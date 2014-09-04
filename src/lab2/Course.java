
package lab2;
/**
*
* @author Justin
* This is the interface that defines course
* 
* 
*/
public interface Course {
public abstract void displayCourseDetails();
public abstract String getCourseName();
public abstract String getCourseNumber();
public abstract double getCredits();
public abstract void setCourseName(String courseName);
public abstract void setCourseNumber(String courseNumber);
public abstract void setCredits(double credits);
}