package com.tsKgObjectDeclaration3;

import java.util.Random;
import java.util.Scanner;

//МАйн обязательно пишу
public class Main {
    // в майне обязательно паблик статик
    public static void main(String[] args) {
        //В паблике статике уже пишу что нужно
        //Создаю модлеь объекта
        class Student {
            int i = 0;
            int sId;
            String sName;
            String sSurname;
            int educYear;
            float meanMarkEng;
            float meanMarkMath;
            float meanMarkEconomy;
            float averageMark;
        }
        // создаю первый объек и прописываю его данные
        Student student1 = new Student();
        String request1 = "Generate Id #: ";
        String request2 = "Enter Student`s Name: ";
        String request3 = "Enter Student`s Surname: ";
        String request4 = "Enter Student`s education Year: ";
        String request5 = "Enter Student`s mean mark on Math : ";
        String request6 = "Enter Student`s mean mark on English: ";
        String request7 = "Enter Student`s mean mark on Economy: ";


        System.out.print(request1);
        Random sIdN = new Random();
        student1.sId = sIdN.nextInt((1000 + 1) + 1) + 1;
        System.out.println(student1.sId);
        System.out.print(request2);
        Scanner sNameN = new Scanner(System.in);
        student1.sName = sNameN.nextLine();
        System.out.print(request3);
        Scanner sSurnameN = new Scanner(System.in);
        student1.sSurname = sSurnameN.nextLine();
        System.out.print(request4);
        Scanner educYearN = new Scanner(System.in);
        student1.educYear = educYearN.nextInt();
        System.out.print(request5);
        Scanner meanMarkMathN = new Scanner(System.in);
        student1.meanMarkMath = meanMarkMathN.nextFloat();
        System.out.print(request6);
        Scanner meanMarkEngN = new Scanner(System.in);
        student1.meanMarkEng = meanMarkEngN.nextFloat();
        System.out.print(request7);
        Scanner meanMarkEconomyN = new Scanner(System.in);
        student1.meanMarkEconomy = meanMarkEconomyN.nextFloat();
        student1.averageMark = ((student1.meanMarkMath + student1.meanMarkEng + student1.meanMarkEconomy) / 3);


// создаю второй объек и прописываю его данные
        Student student2 = new Student();
        System.out.print(request1);
        Random sIdN2 = new Random();
        student2.sId = sIdN2.nextInt((1000 + 1) + 1) + 1;
        System.out.println(student2.sId);
        System.out.print(request2);
        Scanner sNameN2 = new Scanner(System.in);
        student2.sName = sNameN2.nextLine();
        System.out.print(request3);
        Scanner sSurnameN2 = new Scanner(System.in);
        student2.sSurname = sSurnameN2.nextLine();
        System.out.print(request4);
        Scanner educYearN2 = new Scanner(System.in);
        student2.educYear = educYearN2.nextInt();
        System.out.print(request5);
        Scanner meanMarkMathN2 = new Scanner(System.in);
        student2.meanMarkMath = meanMarkMathN2.nextFloat();
        System.out.print(request6);
        Scanner meanMarkEngN2 = new Scanner(System.in);
        student2.meanMarkEng = meanMarkEngN2.nextFloat();
        System.out.print(request7);
        Scanner meanMarkEconomyN2 = new Scanner(System.in);
        student2.meanMarkEconomy = meanMarkEconomyN2.nextFloat();
        student2.averageMark = ((student2.meanMarkMath + student2.meanMarkEng + student2.meanMarkEconomy) / 3);


        String firstStudentData = "1st Student Data: \n" + "Student`s Id #: " + student1.sId + "\nStudent`s Name: "
                + student1.sName + "\nStudent`s Surname: " + student1.sSurname + "\nStudent`s education Year: " + student1.educYear +
                "\nStudent`s mean mark on Math : " + student1.meanMarkMath + "\nStudent`s mean mark on English: " + student1.meanMarkEng +
                "\nEnter Student`s mean mark on Economy: " + student1.meanMarkEconomy + "\nAverage mark of the Student : "
                + student1.averageMark + "\n";
        String secondStudentData = "2nd Student Data: \n" + "Student`s Id #: " + student2.sId + "\nStudent`s Name: "
                + student2.sName + "\nStudent`s Surname: " + student2.sSurname + "\nStudent`s education Year: " + student2.educYear +
                "\nStudent`s mean mark on Math : " + student2.meanMarkMath + "\nStudent`s mean mark on English: " + student2.meanMarkEng +
                "\nEnter Student`s mean mark on Economy: " + student2.meanMarkEconomy + "\nAverage mark of the Student : "
                + student2.averageMark + "\n";
        System.out.println("\n" + firstStudentData + "\n" + secondStudentData);

    }
}