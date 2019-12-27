package com.company;

public class Main {

    public static void main(String[] args) {

        //Student Object
        Student fin = new Student();
	    fin.name = "นายเอื้ออังกูร สร้อยอุดม";
	    fin.id = "623410059-1";
	    fin.major = "วิทยาการคอมพิวเตอร์และสารสนเทศ";

		//Data collection
	    Student[] oopStudent = {fin};
	    System.out.println("1. " + oopStudent[0].name);
		System.out.println("2. " + oopStudent[0].id);
		System.out.println("3. " + oopStudent[0].major);

    }
}
