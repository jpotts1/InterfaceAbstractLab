
package lab2;
/**
*
* @author Justin
*/
public interface Course {
    
public abstract String getCourseName();
public abstract void setCourseName(String CourseName);
public abstract String getCourseNumber();
public abstract void setCourseNumber(String CourseNumber);
public abstract double getClassCredits();
public abstract void setClassCredits(double ClassCredits);
public abstract void generateClassInfo();
public abstract void printClassInfo();
public abstract void printClassName();
public abstract void printClassNumber();
public abstract void printClassCredits();
}
