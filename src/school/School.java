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
        Person James = Person.addperson("James", Person.Gender.Male,125);
        
        Person Stephani = Person.addperson("Stephani", Person.Gender.Female,120);
        
        Person Aleks = Person.addperson("Aleks", Person.Gender.Male,130);
        
        Person H = Person.addperson("H", Person.Gender.Female,115);
        
        Person Jimmy = Person.addperson("Jimmy", Person.Gender.Male,123);
        
        int val = James.getWeight();
        
        Person.printNamesOfGender(Person.Gender.Male);
        
        Person.printNames();
        
        System.out.println(James);
    }
}
