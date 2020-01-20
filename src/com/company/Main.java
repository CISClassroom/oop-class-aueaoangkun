package com.company;

public class Main {

    public static void main(String[] args) {

        //สร้าง object ขึ้นมา 1 ตัว
        Student Cs1 = new Student();
        ;
        Cs1.name = "นายเอื้ออังกูร    สร้อยอุดม";
        Cs1.id = "623410059-1";
        Cs1.major = "สาขาวิทยาการคอมพิวเตอร์";

        System.out.println(Cs1.name);
        System.out.println(Cs1.id);
        System.out.println(Cs1.major);

        //สร้าง object ขึ้นมา 2 ตัว
        Student CS2 = new Student();
        Student CS3 = new Student();
        //แสดงข้อมูล
        CS2.name = "นางสาววรรณภา    ทองประสม";
        CS2.id = "623410055-7";
        CS2.major = "สาขาวิทยาการคอมพิวเตอร์";

        CS3.name = "นางสาวสมประสิท     ทองดี";
        CS3.id = "623410077-7";
        CS3.major = "สาขาวิทยาการคอมพิวเตอร์";

        System.out.println(CS2.name);
        System.out.println(CS2.id);
        System.out.println(CS2.major);

        System.out.println(CS3.name);
        System.out.println(CS3.id);
        System.out.println(CS3.major);
    }

}
