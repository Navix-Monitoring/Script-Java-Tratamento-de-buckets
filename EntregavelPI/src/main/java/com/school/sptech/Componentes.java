package com.school.sptech;

public class Componentes {
    private Double cpu;
    private Double ram;
    private Double disco;

    public Componentes(Double cpu, Double ram, Double disco){
        this.cpu = cpu;
        this.ram = ram;
        this.disco = disco;
    }

    public Double getCpu(){
        return cpu;
    }
    public Double getRam(){
        return ram;
    }
    public Double getDisco(){
        return disco;
    }

    public void setCpu(Double cpu){
        this.cpu = cpu;
    }
    public void setRam(Double ram){
        this.ram = ram;
    }
    public void setDisco(Double disco){
        this.disco = disco;
    }
}