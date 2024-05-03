//constructor are used to creation of a object and initialized it.
public class constructor {
    public static void main(String[] args) {
        Student s = new Student("jagnyadatta",32);
        System.out.println(s.name);
        System.out.println(s.rollno);
    }
}
class Student{
    String name;
    int rollno;
    Student(String name, int rollno){
        this.name=name;
        this.rollno = rollno;
    }
}