/*
 * The Liskov substitution principle would work with the intro to programming
class because it does not have any unique properties. Intro and advanced both have
prerequesits so it would not work.  
 */

package lab2;

/**
 *
 * @author justinpotts
 */
public class StartUp {
     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

      
Course course1 = new IntroJavaCourse();
Course course2 = new AdvancedJavaCourse();
Course course3 = new IntroToProgrammingCourse();


course1.displayCourseDetails();
course2.displayCourseDetails();
course3.displayCourseDetails();

    }
}
