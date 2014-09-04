package lab1;

import javax.swing.JOptionPane;

/**
 *
 *
 * @author      Justin Potts
 * @version     1.00
 */
public class AdvancedJavaCourse extends AbstractCourse{
    boolean getPrerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequsistes){
            super (courseName, courseNumber, credits , prerequsistes);

    }
        
   

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


   

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
        public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
        }

    
}
