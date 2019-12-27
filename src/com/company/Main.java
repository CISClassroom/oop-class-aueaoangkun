package com.company;

public class Main {

    public static void main(String[] args) {
        Student FinLand = new Student();
        FinLand.name = "นายเอื้ออังกูร สร้อยอุดม";
        FinLand.id =  "623410059-1";
        FinLand.major = "วิทยาการคอมพิวเตอร์";

        System.out.println("ชื่อ " + FinLand.name +"\nรหัสนักศึกษา " + FinLand.id + "\nสาขา " + FinLand.major );
    }
}
