/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;

public class Course 
{
    enum Type 
    {
        Math,Science,English,History,Language,Elective,PE
    } 
 private static ArrayList<Course> Courses = new ArrayList<Course>();
    private String name;
    private Type Type;
    private int Period;
    
    
    
public static Course addCourse(String _name,
    Type _type, int _period)
    {
        Course temp = new Course(_name,_type,_period);
        Courses.add(temp);
        return(temp);
    }
    Course()
    {
        name = "None";
        Type = Type.Math;
        Period = 1;
    }
    Course(String _name,Type _type,int _period)
    {
        name = _name;
        Type = _type;
        Period = _period;
    }   
    public void setPeriod(int _period)
    {
        Period = _period;
    }
    public int getPeriod()
    {
        return(Period);
    }       
    public void setName(String _name)
    {
        name = _name;
    }
    public String getName()
    {
        return(name);
    }    
    public void setType(Type _type)
    {
        Type = _type;
    }
    public Type getType()
    {
        return(Type);
    }  
    public static void printNames()
    {
        System.out.println("===printNames===");
        for (int index=0;index<Courses.size();index++)
        {
                System.out.println(Courses.get(index).getName());
        }        
    }
    public static void printNames(Type _type)
    {
        System.out.println(
        "===printNamesOfType=== " + _type);
        for (Course temp : Courses)
        {
            if (temp.Type == _type)
                System.out.println(temp.getName());
        }
             
    }    
    public String toString()
    {
        return(name + " " + Type + " " + Period);
    }
 
}
