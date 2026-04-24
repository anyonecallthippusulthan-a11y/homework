package javaapplication53;

import java.util.Scanner;

public class Institution {
     static String Institutionname="ABC Institution";
     class Student
     {
        
         String name;
         int rollno;
         int []mark;
         double average;
         char grade;
         void addStudent()
         {
             Scanner sc=new Scanner(System.in);
             System.out.print ("enter your name  :");
             name=sc.nextLine();
             System.out.print("enter your roll number");
             rollno=sc.nextInt();
             System.out.println("enter number of subject");
             int ac=sc.nextInt();
                 mark = new int[ac];
         }
               void addMarks() {
                   Scanner sc=new Scanner(System.in);
               
            if (mark == null) {
                System.out.println("Please add student first!");
                return;
            }

            for (int i = 0; i < mark.length; i++) {
                System.out.print("Enter mark for subject " + (i + 1) + ": ");
                mark[i] = sc.nextInt();
           
         }}
         void cal()
         {
                  int sum = 0;
            for (int i =0; i<mark.length;i++) {
                sum += mark[i];
            }

             
             average=sum/mark.length;
             System.out.println("averge"+average);
            
            if (average >= 90) {
                grade = 'A';
            } else if (average >= 75) {
                grade = 'B';
            } else if (average >= 50) {
                grade = 'C';
            } else {
                grade = 'F';
            }
            System.out.println("Grade Calculated Successfully!");
        }

        // Method to display details
        void display() {
            if (mark == null) {
                System.out.println("No student data available!");
                return;
            }

            System.out.println("\n--- Student Details ---");
            System.out.println("Institution: " + Institutionname);
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollno);

            System.out.print("Marks: ");
            for (int m : mark) {
                System.out.print(m + " ");
            }

            System.out.println("\nAverage: " + average);
            System.out.println("Grade: " + grade);
        }
    
     }
     }
