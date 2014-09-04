
package lab1;

/**
 *
 * @author justinpotts
    
    * I think that the architecture is good because the abstract super class
    * inherits methods from all of the child classes correctly. 
    * 
    * 
    * Instances of a parent type should be replaceable by instances 
    * of sub-types without changing the correctness of the application,
    * A sub-type can't change the behavior of a parent type.
 * 
 */
public class StartUp {
    
    protected static IntroToProgrammingCourse IntroToProgrammingCourse;
    protected static IntroJavaCourse IntroJavaCourse;
    protected static AdvancedJavaCourse AdvancedJavaCourse;
    
        public static void main(String[] args) {
            
            AdvancedJavaCourse course = new AdvancedJavaCourse("Advanced Java", "Intro To Java", 1.0, "Intro To Programming" );
            System.out.println(course.getCourseName());
        
            
            IntroToProgrammingCourse = new IntroToProgrammingCourse("courseName", "courseNumber");
            System.out.println(course.getCredits());
            
            
            IntroJavaCourse = new IntroJavaCourse("courseName", "courseNumber");
            System.out.println(course.getPrerequisites);
            
        }
        
}
