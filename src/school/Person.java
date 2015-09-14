/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;

public class Person     
{
    
    enum Gender
    {
        Male,Female
    }
  public static int numPeople = 10;
  public static int currentPeopleIndex = 0;
  //public static Person people[] =
         // new Person[numPeople];
  
  private static ArrayList<Person> people = new ArrayList<Person>();
  private int Weight;        
  private String name;
  private Gender gender;
  public static Person addperson(String _name, Gender _gender, int _weight)
  {
      Person temp = new Person (_name,_gender,_weight);
      people.add(temp);
      return(temp);
  }
  Person()
  {
      name = "none";
      gender = Gender.Female;
  }
  Person (String _name, Gender _gender, int weight)
  {
      
      name = _name;
      gender = _gender;
      
  }
  public void setName (String _name)
  {
      name = _name;
  }
  
   public void setWeight (int _weight)
  {
      Weight = _weight;
  }
   
     public int getWeight ()
  {
      return(Weight);
  }
  
   public String getName ()
  {
      return(name);
  }
  
   public void setGender (Gender _gender)
  {
      gender = _gender;
  }
   
    public Gender getGender ()
  {
      return(gender);
  }
  
  public static void printNames()
  {
      System.out.println("=====printNames=====");
      for (Person temp : people)
      {
          if (temp != null)
          {
              System.out.println(temp.getName());
          }
      }
  }
  
   public static void printNamesOfGender(Gender _gender)
  {
      System.out.println("=====printNamesOfGender======" + _gender);
      for (Person temp : people)
      {
          if (temp.gender == _gender)
          {
              System.out.println(temp.getName());
          }
      }
  }
   
//   public String toString()
//   {
//       return(name +"" + gender "" + weight);
//   }
}
