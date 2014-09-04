/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author justinpotts
 */
public interface Course {
    
    public abstract String courseName();
    
    public abstract Double courseNumber();

    public abstract Double credits ();

    public abstract String prerequisites();

    public String getCourseNumber();
    
    public double getCredits();
    
    public String getCourseName();
    
    }
    



