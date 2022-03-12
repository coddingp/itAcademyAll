package com.itLambda;

import java.util.Objects;

public class Student implements com.itLambda.Testable {
    private String name;
    private double ExamMark;

    public Student(String name, double examRes) {
        this.name = name;
        this.ExamMark = examRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExamMark() {
        return ExamMark;
    }

    public void setExamRes(double examRes) {
        this.ExamMark = examRes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ExamMark == student.ExamMark && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ExamMark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", examRes=" + ExamMark +
                '}';
    }

    @Override
    public String testResult(double a) {
        if (a > 3) {
            return name + " passed the exam. The student has got " + a + " mark.";
        } else return name + " didn't pass the exam. The student has got " + a + " mark.";
    }
}
