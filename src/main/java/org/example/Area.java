package org.example;
public class Area <T> {
    final T area;

    public Area(T area){
        this.area = area;
    }
    public void printArea(){
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {


    }
}
