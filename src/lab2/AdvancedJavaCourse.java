
package lab2;

public class AdvancedJavaCourse implements Course {
private String courseName;
private String courseNumber;
private double classCredits;
private String prerequisites;
public String getPrerequisites(){
return prerequisites;
}
public void setPrerequisites(String prerequisites){
if(prerequisites == null || prerequisites.length() == 0) {
System.out.println("Error: Prerequisites cannot be null of empty string");
}
this.prerequisites = prerequisites;
}
public void printPrerequisites(){
System.out.println("Class Prerequisites: " + prerequisites);
}
@Override
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
@Override
public String getCourseNumber(){
return courseNumber;
}
@Override
public void setCourseNumber(String courseNumber){
if(courseNumber == null || courseNumber.length() == 0) {
System.out.println("Error: Course number cannot be null of empty string");
}
this.courseNumber = courseNumber;
}
@Override
public double getClassCredits(){
return classCredits;
}
@Override
public void setClassCredits(double classCredits){
if(classCredits < 0.5 || classCredits > 4.0) {
System.out.println("Error: Credits must be in the range 0.5 to 4.0");
}
this.classCredits = classCredits;
}
@Override
public void printClassName(){
System.out.println("Course Name: " + getCapitalizedCourseName());
};
@Override
public void printClassNumber(){
System.out.println("Course Number: " + courseNumber);
};
@Override
public void printClassCredits(){
System.out.println("Class Credits: " + classCredits);
};
@Override
public void generateClassInfo(){
printClassName();
printClassNumber();
printClassCredits();
printPrerequisites();
}
@Override
public void printClassInfo(){
generateClassInfo();
}
}