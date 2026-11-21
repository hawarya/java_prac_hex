package com;

import java.util.Comparator;

public class courseutil implements Comparator<course> {
    String direction;
    String sortby;




    public courseutil(String sortby, String direction) {
        this.sortby = sortby;
        this.direction = direction;
    }

    @Override
    public int compare(course c1, course c2) {

        if(sortby.equals("price")){
            if(direction.equals("ASC")){
                if(c1.price>c2.price){
                    return 1;
                }
                if(c1.price< c2.price){
                    return -1;
                }
            }else{
                if(c1.price<c2.price){
                    return 1;
                }
                if(c1.price>c2.price){
                    return -1;
                }
            }

        }else{
            if (direction.equals("ASC")) {
                if (c1.name.compareTo(c2.name) > 0) {
                    return 1;
                }
                if (c1.name.compareTo(c2.name) < 0) {
                    return -1;
                }
            } else {
                if (c1.name.compareTo(c2.name) < 0) {
                    return 1;
                }
                if (c1.name.compareTo(c2.name) > 0) {
                    return -1;
                }


            }
        }


        return 0;
    }
}