package com.tsKgObject1;

import java.util.Scanner;

public class Main {
    int sId = 125;
    String sName = "Thed";
    String sSurname = "Therik";
    int educYear = 3;
    double meanMarkMath = 4.5;
    double meanMarkEng = 3.5;
    double meanMarkEconomy = 4.7;

    public static void main(String[] args) {
        Main std = new Main();
        System.out.println("Enter your ID: ");
        Scanner sIdN = new Scanner(System.in);
        int sId = sIdN.nextInt();
        String StudentData = "Student Data: \n" + "Student`s Id #: " + std.sId + "\nStudent`s Name: "
                + std.sName + "\nStudent`s Surname: " + std.sSurname + "\nStudent`s education Year: " + std.educYear +
                "\nStudent`s mean mark on Math : " + std.meanMarkMath + "\nStudent`s mean mark on English: " + std.meanMarkEng +
                "\nEnter Student`s mean mark on Economy: " + std.meanMarkEconomy + "\nAverage mark of the Student : "
                + ((std.meanMarkMath + std.meanMarkEng + std.meanMarkEconomy) / 3);
        System.out.println(StudentData);
    }
}


/*
package com.helloWorld;

import java.util.Scanner;

public class HashMap {


    //    Scanner sIdN = new Scanner(System.in);
    //    int sId = sIdN.nextInt();
    //    Scanner sNameN = new Scanner(System.in);
    //    String sName = sNameN.nextLine();
    //    Scanner sSurnameN = new Scanner(System.in);
    //    String sSurname = sSurnameN.nextLine();
    //    Scanner educYearN = new Scanner(System.in);
    //    int educYear = educYearN.nextInt();
    //    Scanner meanMarkMathN = new Scanner(System.in);
    //    double meanMarkMath = meanMarkMathN.nextDouble();
    //    Scanner meanMarkEngN;
    //    double meanMarkEng = meanMarkEngN.nextDouble();
    //    Scanner meanMarkEconomyN = new Scanner(System.in);
    //    double meanMarkEconomy = meanMarkEconomyN.nextDouble();

    public static void main(String[] args) {
//        StudentTest std = new StudentTest();
        System.out.println("100");

    }
}

//        int i = 0;
//        String request1 = "Generate Id #: ";
//        String request2 = "Enter Student`s Name: ";
//        String request3 = "Enter Student`s Surname: ";
//        String request4 = "Enter Student`s education Year: ";
//        String request5 = "Enter Student`s mean mark on Math : ";
//        String request6 = "Enter Student`s mean mark on English: ";
//        String request7 = "Enter Student`s mean mark on Economy: ";
//        String StudentData = "Student Data: \n" + "Student`s Id #: "+std.sId+ "\nStudent`s Name: "
//                +std.sName+"\nStudent`s Surname: "+std.sSurname+"\nStudent`s education Year: "+std.educYear+
//                "\nStudent`s mean mark on Math : "+std.meanMarkMath+"\nStudent`s mean mark on English: "+std.meanMarkEng+
//                "\nEnter Student`s mean mark on Economy: "+std.meanMarkEconomy+"\nAverage mark of the Student : "
//                +((std.meanMarkMath+std.meanMarkEng+std.meanMarkEconomy)/3);
//        System.out.println(request1);
//        System.out.println(request2);
//        System.out.println(request3);
//        System.out.println(request4);
//        System.out.println(request5);
//        System.out.println(request6);
//        System.out.println(request7);
//        //System.out.println(std.);
//}

class StudentTest {
    void main(String[] args) {

        StudentTest std = new StudentTest();
        Scanner sIdN = new Scanner(System.in);
        int sId = sIdN.nextInt();
        //int sId = 125;
        System.out.println("I didn't finish it");
    }
}
*/
