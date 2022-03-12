package com.itHomeWork12LaptopClass;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Enter HardDrive properties type, speed, volume, producer: ");
        com.itHomeWork12LaptopClass.HardDrive hardDrive = new com.itHomeWork12LaptopClass.HardDrive("HDD", 123, 124, "Samsung");
        com.itHomeWork12LaptopClass.Memory memory = new com.itHomeWork12LaptopClass.Memory("Asus JP123/3.15", 10124);
        OperationSystem operationSystem = new OperationSystem("Windows", "7 Ultimate", 2012);
        Processor processor = new Processor("QuadCore Pentium 4", 4, 3.15);
        Laptop laptop = new Laptop(hardDrive, memory, operationSystem, processor);

        int[] laptops = new int[100];
        laptops = laptop.storage(laptops, 10);
        System.out.println(Arrays.toString(laptops));

        System.out.println("\n\n\n");

        hardDrive.print();
        memory.print();
        operationSystem.print();
        processor.print();
    }


}