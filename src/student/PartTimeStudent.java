/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author hasanbasil
 */
public class PartTimeStudent extends Student {
    
    private int courses;

    public PartTimeStudent(int courses, String studenntID, String studentName) {
        super(studenntID, studentName);
        this.courses = courses;
    }
    

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }
            
    
}
