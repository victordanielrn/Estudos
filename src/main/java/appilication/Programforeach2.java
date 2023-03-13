package appilication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programforeach2 {
    public static void main (String[]args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("bob");
        list.add("Anna");
        list.add(2,"marco");

        System.out.println(list.size());


        for (String x : list ){
            System.out.println(x);
        }
        System.out.println("----------------------------------------");
        //list.removeIf(x-> x.charAt(0)=='M');
        //list.remove("Anna");
        //list.remove(1);
        //System.out.println("index of bob:" + list.indexOf("bob")); encontrar especificadamente.
        //deixa somente quem tem aquela letra especifica: List<String> result = list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : list ){
            System.out.println(x);

        }
        System.out.println("-----------------------------------------");
        System.out.println("index of bob:" + list.indexOf("bob"));
        System.out.println("------------------------------------");
        //List<String> result = list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());
        //for (String x : result ){
            //System.out.println(x);
        //}
    }
}
