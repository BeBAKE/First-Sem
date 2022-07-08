package com.company.OOps;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real , double imaginary){
        this.real = real;
        this.imaginary=imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public void add(double real ,double imag ){
        this.real+=real;
        this.imaginary+=imag;
    }
    public void add(ComplexNumber C){
        this.real+=C.real;
        this.imaginary+=C.imaginary;
    }
    public void subtract(double real ,double imag ){
        this.real-=real;
        this.imaginary-=imag;
    }
    public void subtract(ComplexNumber C){
        this.real-=C.real;
        this.imaginary-=C.imaginary;
    }
}
