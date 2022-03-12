package com.itHomeWork12LaptopClass;

public class Processor {
    String processorModel;
    int cores;
    double Hz;

    public Processor() {
    }

    public Processor(String processorModel,
                     int cores,
                     double Hz) {
        this.processorModel = processorModel;
        this.cores = cores;
        this.Hz = Hz;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setHz(double hz) {
        Hz = hz;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public int getCores() {
        return cores;
    }

    public double getHz() {
        return Hz;
    }

    public void print() {
        System.out.println(this.processorModel + " " + this.cores + " " + this.Hz);
    }
}