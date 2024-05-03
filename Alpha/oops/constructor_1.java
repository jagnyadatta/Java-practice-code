//constructor will execute when its parameters are matched.

public class constructor_1 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("jagnyadatta");
        Student s2 = new Student(300);
        Student s3 = new Student("jagnyadatta",32);
        System.out.println(s1.name);
        System.out.println(s2.rollno);
        System.out.println(s3.rollno);
        System.out.println(s3.name);
    }
}
class Student{
    String name;
    int rollno;
    Student(){
        System.out.println("Constructor is called");
    }
    Student(String name){
        this.name= name;
    }
    Student(int rollno){
        this.rollno = rollno;
    }
    Student(String name, int rollno){
        this.name=name;
        this.rollno = rollno;
    }
}