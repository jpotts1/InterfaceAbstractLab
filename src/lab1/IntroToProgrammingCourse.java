package lab1;

import javax.swing.JOptionPane;

/**
 * 
 *
 * @author      Justin Potts
 * @version     1.00
 */
public class IntroToProgrammingCourse extends AbstractCourse {


    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super (courseName, courseNumber, 0.0, "No prerequsistes");
    }

 
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }


    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

   

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

        public void setPrerequisites(String prerequisites){
            JOptionPane.showMessageDialog(null,
                    "Error: No prerequisites for this class");
            System.exit(0);
        }

    
}
