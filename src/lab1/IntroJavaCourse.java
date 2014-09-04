package lab1;

/**
 * 
 *
 * @author      Justin Potts
 * @version     1.00
 */
public class IntroJavaCourse extends AbstractCourse{

 
 
    public IntroJavaCourse(String courseName, String courseNumber) {
        super (courseName, courseNumber, 0.0, "No prerequsistes");
    }

        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
        
        public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
        }
        
        public void setPrerequisites(String prerequisites){
        this.prerequisites = prerequisites;
                
          }


}
