package university;

public class Teacher {
    private int empId;
    String teacherName;
    int teacherAge;
    String teacherCity;

    Teacher(int id, String name, int age, String city){
        empId = id;
        teacherName = name;
        teacherAge = age;
        teacherCity = city;
    }

    void intro(){
        System.out.println("My name is "+teacherName+".");
    }
}
