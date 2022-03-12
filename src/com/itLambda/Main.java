package com.itLambda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        String string1 = "Эти классы похожи, практически двойники, они имеют одинаковые конструкторы, одни и те же методы, которые одинаково используются. Единственное их различие состоит в том, что класс StringBuffer синхронизированный и потокобезопасный. То есть класс StringBuffer удобнее использовать в многопоточных приложениях, где объект данного класса может меняться в различных потоках. Если же речь о многопоточных приложениях не идет, то лучше использовать класс StringBuilder, который не потокобезопасный, но при этом работает быстрее, чем StringBuffer в однопоточных приложениях.";

        ArrayList stringArrayList = new ArrayList<String>();

        stringArrayList.add("Эти");
        stringArrayList.add("классы");
        stringArrayList.add("похожи");
        stringArrayList.add("практически");
        stringArrayList.add("двойники");
        stringArrayList.add("они");


//        StringBuffer editedstring = new StringBuffer("");


        com.itLambda.StringToString stringArrayList2 = (s) -> {
            String res = "";
            for (String chars : s
            ) {
                res += s;
            }
            return res;
        };

        System.out.println(stringArrayList2.concotinateStrings(stringArrayList));


//        editedstring.append(String.valueOf(string));

//        System.out.println(editedstring);
//
//        String[] words = string.split("\\s*");
//
//        System.out.println(Arrays.toString(words));
//        for (int i = 0; i < editedstring.length(); i++) {
//            if ((editedstring.charAt(i))  == ' ' || (editedstring.charAt(i))  == ',' || (editedstring.charAt(i))  == '.'){
//                editedstring.deleteCharAt(i);
//            }
//        }for (int i = 0; i < editedstring.length(); i++) {
//            if ((editedstring.charAt(i))  == ' '){
//                editedstring.deleteCharAt(i);
//            }
//        }
//        System.out.println(editedstring);

    }
}

//        new Thread(() -> System.out.println("Я лямбда")).start();
//
////        Testable lambda = (int a)-> String.valueOf(a+5);
//        Lambdable lambda = (int x, int y) -> x + y;
//
////        System.out.println(lambda);
//        System.out.println(lambda.sumUp(10, 20));
//
//        Student student2 = new Student("Haskell", 4.6);
//
//        Testable testable2 = (double a) -> "" + student2.testResult(a);
//
//        System.out.println(testable2.testResult(4.6));
//
//        Student student3 = new Student("Alonzo Church", 2.3);
//
//        Testable testableExamination = (double a) -> "" + student3.testResult(a);
//
//        System.out.println(testableExamination.testResult(student3.getExamMark()));
//
//        Student student4 = new Student("Laster",5.0);
//        Testable testableLastStudent = (double a) -> "" + student4.testResult(a);
//
//        System.out.println(testableLastStudent.testResult(student4.getExamMark()));
//
//        Printable printer = (String s) -> s + "2";
//        System.out.println("How many apples do you have?");
//        System.out.println(printer.print("I have "));
//
//        TwoDoublable mathAdd = (double a, double b) -> a + b;
//        TwoDoublable mathPow = (double a, double b) -> Math.pow(a, b);
//        TwoDoublable mathMult = (double a, double b) -> a * b;
//
//        System.out.println(mathAdd.math(10,20));
//        System.out.println("Pow of " + 2 + " and " + 3 + " = " + mathPow.math(2,3));
//        System.out.println(mathMult.math(student2.getExamMark(), student4.getExamMark()));
//
//
//        interfaceAB<Integer> abOne = (x, y)-> x + y;
//        interfaceAB<String> abOne1 = (x, y)-> x + y;
//
//        System.out.println("Generical interfaceAB calculates next " + abOne.calculate(10,20));
//        System.out.println(abOne1.calculate("10","20"));


//    }
//}
//        Student student = new Student("Ivan", true);
//        System.out.println('\n');
//        student.testResult();
//        Student student2 = new Student("Petr", true);
//
//        Student student3 = new Student("Sergei", false);
//        System.out.println('\n');
//        student2.testResult();
//        System.out.println('\n');
//        student3.testResult();
//    }
//}
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Анонимный вызов");
//            }
//        }).start();
//
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("saerfgeqrafgqea");
//            }
//
//        }).start();
//
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I am closer to understand that");
//            }
//        }).start();
//
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I'm even more closer");
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I am still not at the proper place");
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I just remembered the sequence of the unanimous code");
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run(){
//                System.out.println("This was the last one");
//            }
//        } ).start();
//    }
//}

