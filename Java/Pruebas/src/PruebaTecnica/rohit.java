package PruebaTecnica;

import java.util.ArrayList;

public class rohit {

       public static void main(String[] args) {
           ArrayList<Integer> a=new ArrayList<Integer>();
           ArrayList<Integer> b=new ArrayList<Integer>();
           b.add(1);
           b.add(2);
           b.add(3);
           b.add(4);
           b.add(5);
           permu(a,b);
       }

       public static void permu(ArrayList<Integer> prefix,ArrayList<Integer> value)
       {
           if(value.size()==0)
           {
               System.out.println(prefix);
           }
           else
           {
               for(int i=0;i<value.size();i++)
               {
                   ArrayList<Integer> a=new ArrayList<Integer>();
                   a.addAll(prefix);
                   a.add(value.get(i));

                   ArrayList<Integer> b=new ArrayList<Integer>();

                   b.addAll(value.subList(0, i));
                   b.addAll(value.subList(i+1, value.size()));

                   permu(a,b);
               }
           }
       }

}