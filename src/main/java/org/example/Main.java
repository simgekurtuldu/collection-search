package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Integer itemFind = 3;
        Integer result = CollectionSearch.searchItem(numbers, itemFind);

        if(result != null){
            System.out.println(" Bulundu: " + result);
        }else{
            System.out.println(-1);
        }

        System.out.println("-------------------");

        Area<Integer> areaObject1 = new Area<>(25);
        areaObject1.printArea();

        Area<Double> areaObject2 = new Area<>(10.5);
        areaObject2.printArea();
    }
}
