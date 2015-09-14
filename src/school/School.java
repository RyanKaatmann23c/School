/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author 373000818
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person James = Person.addPerson("James", Person.Gender.Male,125);
        
        Person Stephani = Person.addPerson("Stephani", Person.Gender.Female,120);
        
        Person Aleks = Person.addPerson("Aleks", Person.Gender.Male,130);
        
        Person H = Person.addPerson("H", Person.Gender.Female,115);
        
        Person Jimmy = Person.addPerson("Jimmy", Person.Gender.Male,123);
        
        int val = James.getWeight();
        
        Person.printNames(Person.Gender.Female);
        
        Person.printNames();
        
        System.out.println(H);
        
        Course geom = 
                Course.addCourse("Geometry", Course.Type.Math, 1);
                Course Film = 
                Course.addCourse("Film", Course.Type.Elective, 2);
                Course.printNames();
                System.out.println(Film);
                
        
        
    }
}
