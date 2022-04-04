package CollectionsFramework;

import ObjectOriented.Object;

import java.util.ArrayList;
import java.util.List;

public class ComparableInter implements Comparable<ComparableInter>{
    String name;
    int rollno;

    String color;
    ComparableInter(String name,int rollno,String color){
        this.rollno=rollno;
        this.name=name;
        this.color=color;
    }


    @Override
    public int compareTo(ComparableInter o) {
        if(rollno==o.rollno)
            return 0;
        else if(rollno>o.rollno)
            return 1;
        else
            return -1;
    }

    public static void main(String args[]){
        List<ComparableInter> al=new ArrayList<>();
        al.add(new ComparableInter("Vijay",101,"red"));
        al.add(new ComparableInter("Ajay",106,"blue"));
        al.add(new ComparableInter("Jai",105,"green"));

        for(ComparableInter st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.color);
        }
    }
}
