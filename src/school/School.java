package school;
public class School {
    public static void main(String[] args) {
        Person James = 
        Person.addPerson("James",Person.Gender.Male,120);
        Student Steph = 
        Student.addStudent("Steph",Person.Gender.Female,105,9);
        Steph.setName("Stephani");
        Student Aleks = 
        Student.addStudent("Aleks",Person.Gender.Male,210,12);
        
        Aleks.getWeight();
        int val = Aleks.getWeight();
        
        Person.printNames();
        Person.printNames(Person.Gender.Female);
        
     
        
        Course geom = 
        Course.addCourse("Geometry", Course.Type.Math, 1);
        Course photo = 
        Course.addCourse("Photography", Course.Type.Elective, 3);
        Course.printNames();
    
        
    //    geom.addPerson(joe);
 
 
        
        System.out.println(James);        
        
        Student bobby = 
        Student.addStudent("Bobby",Person.Gender.Male,168,11);
        geom.addStudent(bobby);
        
        System.out.println(bobby.getName());
        Person.printNames();
        Student.printNames();
      
    }
}
