package university;

public class Student {
    int rollNumber;
    String studentName;
    int studentStandard;
    String studentCity;
    Teacher classTeacher;

    Student(int num, String name, int standard, String city, Teacher teacher){
        rollNumber = num;
        studentName = name;
        studentStandard = standard;
        studentCity = city;
        classTeacher = teacher;
    }

    /*Student(int num, String name){
        rollNumber = num;
        studentName = name;
    }*/

    void introduction(){
        System.out.println("My roll num is "+rollNumber+" and my name is "+studentName+ ". I am from "+studentCity+". My class teacher is "+classTeacher.teacherName);
    }
}
