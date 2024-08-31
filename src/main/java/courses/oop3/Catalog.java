package courses.oop3;

import java.util.ArrayList;
import java.util.HashMap;

public class Catalog {
    HashMap<String, Double> students;

    public Catalog (HashMap<String, Double>students){
        this.students = new HashMap<>();
    }

    public void printStudents() {
        for (String  student : students.keySet()){
            System.out.println("- Student: " + student);
            System.out.println("-- Grade " + students.get(student));
        }
    }

    public void addStudent (String name, Double grade){
        if(students.containsKey(name)){
            System.out.println("Student already exists!");
        }
        else {
            if (grade >=0 || grade <=10)
                students.put(name, grade);
            else
                System.out.println("Grade must be between 0 and 10.");
        }
    }

    public boolean searchStudent(String name){
        if (students.containsKey(name)){
            System.out.println("- Student: " + name);
            System.out.println("-- Grade " + students.get(name));
            return true;
        }
        else{
            System.out.println("Student is not registered".formatted(name));
            return false;
        }
    }

    public  void deleteStudent(String name) {
        if (searchStudent(name)){
            students.remove(name);
            System.out.println("Student deleted");
        }
    }

    public void orderStudentsName(){
        ArrayList<String> studentList = new ArrayList<>();
        studentList.addAll(students.keySet());
        //studentList.sort();
    }

}
