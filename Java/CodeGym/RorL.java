package com.codegym.task.task07.task0716;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;

/*                                                   
R or L                                                 
                                                  
*/

public class RorL {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }

    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        List<String> listClone = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {

            if ((list.get(i).matches("(.*)(l).*") && (list.get(i).matches("(.*)(r).*")))) {
                listClone.add(list.get(i));
            } else if ((list.get(i).matches("(.*)(l).*"))) {
                listClone.add(list.get(i));
            } else if ((list.get(i).matches("(.*)(r).*"))) {
                list.remove(i);
            }
        }

        list.addAll(listClone);
        Collections.sort(list);

        return list;
    }
}