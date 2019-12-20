package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student mark = new Student();
        Student tontan = new Student();
        Student dream = new Student();

        mark.name = "X mark";
        mark.id =  "0001";
        mark.major = "CIS";
        tontan.name = "Ton Tan";
        tontan.id =  "0002";
        tontan.major = "CIS";
        dream.name = "Dream all night";
        dream.id = "002";
        dream.major = "CS";

        System.out.println("1. " + mark.name + " " + mark.major);
        System.out.println("2. " + tontan.name + " " + tontan.major);

        Student[] oopclass = {mark, tontan,dream};

        System.out.println("1. " + oopclass[0].name);
        System.out.println("2. " + oopclass[1].name);
    }
    public  void find_CIS_Student(Student[] student){
        for(int i = 0 ; i < student.length; i++){
            if (student[i].major == "CIS"){
                System.out.println((i+1 + ". " + student[i].name));
            }
        }

    }

}
