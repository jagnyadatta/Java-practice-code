
/**
 * Write a java program to print your biodata?
 */
import java.util.*;

public class Qn1 {
    public static void main(String args[]) {
        String fullName;
        int age;
        String address;
        long phoneNumber;
        String qualification;
        String collegeName;
        String profession;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Full Name :");
        fullName = sc.nextLine();
        System.out.println("Enter Your Age :");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Address :");
        address = sc.nextLine();
        System.out.println("Enter Your Phone Number :");
        phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Your Qualification :");
        qualification = sc.nextLine();
        System.out.println("Enter Your College Name :");
        collegeName = sc.nextLine();
        System.out.println("Enter Your Profession :");
        profession = sc.nextLine();
        System.out.println();

        //Printing Biodata
        System.out.println("\t\tBIO-DATA");
        System.out.println("====================================");
        System.out.println("Full Name       : " + fullName);
        System.out.println("Age             : " + age);
        System.out.println("Address         : " + address);
        System.out.println("Phone Number    : " + phoneNumber);
        System.out.println("Qualification   : " + qualification);
        System.out.println("College Name    : " + collegeName);
        System.out.println("Profession      : " + profession);

        sc.close();
    }
}