package org.example;

import java.util.List;

public class Area <T> {
    private T area;

    public Area(T area){
        this.area = area;
    }
    public void printArea(){
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {


    }
}
