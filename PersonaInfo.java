/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personainfo;

import java.util.Scanner;
/**
 *
 * @author Nicholas Adiohos
 */
public class PersonaInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Get user input for each question while printing it
Scanner myName = new Scanner(System.in);
Scanner myAge = new Scanner(System.in);
Scanner myGender = new Scanner(System.in);
Scanner myDepartment = new Scanner(System.in);
Scanner myPi = new Scanner(System.in);

System.out.print("Please enter your name:");

String name = myName.nextLine();
//Got name

      System.out.print("Please enter your age:");
double age = myAge.nextDouble();
//We got the age

System.out.print("Please enter your gender:");
String gender = myGender.nextLine();
//Got gender

System.out.print("Please enter your department:");
String department = myDepartment.nextLine();
//Got department

System.out.print("Please enter the value of Pi (3.1415926):");
double Pi = myPi.nextDouble();
//Got Pi

//Now we need to use printF to make everything get put in a list
System.out.printf("Name \t\t:%s\n",name);
System.out.printf("Age \t\t:%f\n", age);
System.out.printf("Gender \t\t:%s\n", gender);
System.out.printf("Department \t:%s\n", department);
System.out.printf("PI \t\t:%.2f\n", Pi);
        // TODO code application logic here
    }
    
}
