//Copy constructor will copy values of another constructor
//it two types 1.Shallow copy constructor
//             2.Deep copy constructor

public class copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="jagnyadatta";
        s1.rollno = 200;
        s1.password="igit";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        
        Student s2 = new Student(s1);
        s2.password = "newIgit";
        
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}
class Student{
    String name;
    int rollno;
    String password;
    int marks[];
    
    //Shallow Copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        this.marks=s1.marks;
    }

    //Deep Copy Constructor
    /*
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    */
    
    Student(){
        marks=new int[3];
        System.out.println("Constructor is called");
    }
    Student(String name){
        marks=new int[3];
        this.name= name;
    }
    Student(int rollno){
        marks=new int[3];
        this.rollno = rollno;
    }
    Student(String name, int rollno){
        marks=new int[3];
        this.name=name;
        this.rollno = rollno;
    }
}