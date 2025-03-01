package Basicprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class cListOfEmployee {
    public static void main(String[] args) {


        List<Integer> listEmp=Arrays.asList(10,20,30,30,40,50,20,60);


        //List<Integer> listEmp1 = listEmp.stream().distinct().collect(Collectors.toList());
        //System.out.println("display distint"+listEmp1);
        Set<Integer> list=new HashSet<>();
        list.add(50);
        list.add(50);
        list.add(80);
        list.add(80);
        list.add(60);
        list.add(40);

        Set<Integer> list1=new HashSet<>(listEmp);
        System.out.println(list1);

        Set<Integer> listEmp2=listEmp.stream().collect(Collectors.toSet());
        System.out.println("list" +listEmp2);

    }
}