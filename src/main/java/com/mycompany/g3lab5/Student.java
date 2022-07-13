/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3lab5;

/**
 *
 * @author chanakarnkingkaew
 */
public class Student extends Person {
    
    // Instance variables = ตัวแปรของ object
    
    private String program;
    private int year;
    private double fee;
    
    // Constructor
    
    public Student (String name, String address, String program, int year, double fee) {
    
        super(name, address); // Constructor call to super class (chaining)
        this.program = program;
        this.year = year;
        this.fee = fee;
        //super(name, address); // Constructor call to super class (chaining) ทำตรงนี้ไม่ได้
    }
    
    // Accessor Methods
    
    public String getProgram () {
    
        return program;
    }
    
    public int getYear () {
    
        return year;
    }
    
    public double getFee() {
    
        return fee;
    }
    
    // Mutator Method
    
    public void setProgram (String program) {
    
        this.program = program;
    }
    
    public void setYear(int year) {
    
        this.year = year;
    }
    
    public void setFee (double fee) {
    
        this.fee = fee;
    }
    
    @Override
    public String toString () {
    
        return String.format("Student[%s, program=%s, year=%d, fee=%f]", super.toString(),program,year,fee );
    }
    
}
