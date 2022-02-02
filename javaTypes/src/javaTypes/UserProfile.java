package javaTypes;
import java.util.Calendar;
import java.util.Scanner;

public class UserProfile {
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your name ");
        String name = s.nextLine();

        System.out.println("Please enter your age ");
        int age = s.nextInt();
        
        s.nextLine();
        
        System.out.println("Please enter your gender ");
        String gender = s.nextLine();
        
        System.out.println("Please enter your job preference ");
        String jobPreference = s.nextLine();
        
        System.out.println("Please enter your nationality ");
        String nationality = s.nextLine();
        
        System.out.println("Please enter your blood type ");
        String bloodType = s.nextLine();
        s.close();        
        Calendar date = Calendar.getInstance();
        
        System.out.println("My name is "+ name);
        System.out.println("My age is "+age+" and you born in "+(date.get(date.YEAR)-age));
        System.out.println("My gender is "+gender);
        System.out.println("My job preference is "+jobPreference);
        System.out.println("My nationality is "+nationality);
        System.out.println("My blood type is "+bloodType);
        s.close();
    }
}
