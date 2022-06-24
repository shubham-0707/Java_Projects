package com.example.OOPs;

public class Patient {
    public String Code;
    public String Name;
    public int age;
    public String doctorName;
    public double billAmount;

    public void __init__(String Code , String Name , int age , String doctorName , double billAmount){
        this.Code = Code;
        this.Name = Name;
        this.age = age;
        this.doctorName = doctorName;
        this.billAmount=billAmount;
    }
}
