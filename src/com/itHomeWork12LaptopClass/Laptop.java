package com.itHomeWork12LaptopClass;

public class Laptop {
    com.itHomeWork12LaptopClass.HardDrive hardDrive;
    com.itHomeWork12LaptopClass.Memory memory;
    OperationSystem operationSystem;
    Processor processor;

    public Laptop() {

    }

    public Laptop(com.itHomeWork12LaptopClass.HardDrive hardDrive,
                  com.itHomeWork12LaptopClass.Memory memory,
                  OperationSystem operationSystem,
                  Processor processor) {
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.operationSystem = operationSystem;
        this.processor = processor;
    }

    public void setHardDrive(com.itHomeWork12LaptopClass.HardDrive hardDrive) {
        hardDrive = this.hardDrive;
    }

    public void setMemory(com.itHomeWork12LaptopClass.Memory memory) {
        this.memory = memory;
    }

    public void setSystem(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public com.itHomeWork12LaptopClass.HardDrive getHardDrive() {
        return hardDrive;
    }

    public com.itHomeWork12LaptopClass.Memory getMemory() {
        return memory;
    }

    public OperationSystem getOperationSystem() {
        return operationSystem;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void print() {
//        System.out.println(" " + hardDrive.type + " " + hardDrive.producer + " " + hardDrive.speed + " " + hardDrive.volume +
//                "\n" + memory.model + " " + memory.size +
//                "\n" + operationSystem.brand + " " + operationSystem.version + " " + operationSystem.yearOfRelease +
//                "\n" + processor.processorModel + " " + " Number of Cores" + processor.cores + " " + processor.Hz);
        hardDrive.print();
        memory.print();
        operationSystem.print();
        processor.print();
    }

    public int[] storage(int[] laptopStorage, int random) {
        for (int i = 0; i < 100; i++) {
            for (int z = 0; z < 100; z++) {
                laptopStorage[i] = i + z + random;
            }
        }
        return laptopStorage;
    }
}