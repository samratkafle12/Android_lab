package com.example.mydbms2;

public class Student {

    public int ID = -1;
    public String Name;
    public String Number;
    public String Clas;

    public Student(String Class, String Number, String Name) {
        this.Clas = Class;
        this.Number = Number;
        this.Name = Name;
    }

    public Student() {
        super();
    }

    public String getClas() {
        return Clas;
    }

    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        String result = "";
        result += this.ID + " ";
        result += this.Clas + " ";
        result += this.Number + " ";
        result += this.Name + " ";
        return result;
    }

}
