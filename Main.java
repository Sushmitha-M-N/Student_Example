package com.upgrad;

import java.util.Scanner;

class Student{
    String usn;
    String name;
    int marks[] =new int[3];
    int sum=0;
    double avg;

//    public Student(String u, String n, int m[]){
//        usn=u;
//        name=n;
//        marks=m;
//    }

    public Student(){
        usn="";
        name="";
    }

        void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and usn :");
        name = sc.next();
        usn = sc.next();

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks in subject:" + i+1);
            marks[i] = sc.nextInt();
        }
    }
    void calSum(){
        for(int i=0;i<3;i++)
        {
           sum =sum+marks[i];
        }
    }
    void calAvg()
    {
        avg=sum/3;
    }
    void display()
    {
        System.out.println("------------Details-----------");
        System.out.println("name:\t\t"+name);
        System.out.println("USN:\t\t"+usn);
        System.out.print("marks:\t\t");
        for(int i=0;i<3;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Sum is "+sum);
        System.out.println("Avg is "+avg);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of objects :");
        int num = sc.nextInt();
        Student ob[] = new Student[num];
//        int arr[] = {5,6,7};
//        Student student = new Student("sush","Sush123",arr);
//        student.calSum();
//        student.calAvg();
//        student.display();
        // To accept and display all student details this is the code.
        for (int i = 0; i < num; i++) {
            ob[i] = new Student();
            ob[i].accept();
            ob[i].calSum();
            ob[i].calAvg();
            ob[i].display();
        }


        //To display info of topper
        int top=-1;
        int var=0;
        for(int i = 0; i < num; i++){
            ob[i] = new Student();
            ob[i].accept();
            ob[i].calSum();
            ob[i].calAvg();
        }
        for(int i = 0; i < num; i++){
            if(ob[i].sum>top){
                top=ob[i].sum;
                var = i;
            }
        }
        System.out.println("topper details are");
        ob[var].display();

        //To display based on name given

        for(int i = 0; i < num; i++){
            ob[i] = new Student();
            ob[i].accept();
            ob[i].calSum();
            ob[i].calAvg();
        }
        System.out.println("Enter the name of the student whose details to be displayed");
        String nam = sc.next();
        boolean flag = false;
        for(int i = 0; i < num; i++){
            if(ob[i].name.equals(nam)){
                ob[i].display();
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("Student details are not found");
        }
   }
}



