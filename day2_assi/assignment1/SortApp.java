package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortApp {
    public static void main(String[] args) {
        course c1=new course(101,"Java",15000);
        course c2=new course(102,"Python", 12000);
        course c3 =new course(103,"React",15000);
        course c4=new course(104,"SQL", 8000);
        course c5=new course(105,"Angular", 12000);
         List<course> l=new ArrayList<>();
         l.add(c1);
         l.add(c2);
         l.add(c3);
         l.add(c4);
         l.add(c5);
//l.forEach(System.out::println);
        System.out.println("Sorted by price in Asc");
         sortasc(l,"price" ,"ASC");
        System.out.println();
        System.out.println("Sorted by price in Desc");
         sortdesc(l,"price","DESC");
        System.out.println("Sorted by name in Asc");
        sortasc(l,"name","ASC");
        System.out.println("Sorted by name in desc");
        sortasc(l,"name","DESC");

    }

    private static void sortdesc(List<course> l,String sortby,String direction) {
        Collections.sort(l,new courseutil(sortby,direction));
        for(course c: l){
            System.out.println(c);
        }
    }

    private static void sortasc(List<course> l,String sortby,String direction) {
        Collections.sort(l,new courseutil(sortby,direction));
        for(course c: l){
            System.out.println(c);
        }
    }

}
