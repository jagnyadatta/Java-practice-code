public class static_1 {
    public static void main(String args[]){
        Student s = new Student();
        s.schoolName = "IGIT";    //changed to "newIGIT" in line=8
        Student s1 = new Student();
        
        Student s2 = new Student();
        s2.schoolName = "newIGIT";
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
        System.out.println(s.schoolName); 
    }
}

class Student{
    //static method 
    static int returnPercentage(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }

    String name;
    int roll;
    static String schoolName;
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}