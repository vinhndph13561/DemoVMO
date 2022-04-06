package CollectionsFramework;



import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
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
        List<ComparableInter> al=new ArrayList<ComparableInter>();
        al.add(new ComparableInter("Vinh",101,"red"));
        al.add(new ComparableInter("Linh",106,"blue"));
        al.add(new ComparableInter("Minh",105,"green"));

        Collections.sort(al);
        for(ComparableInter st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.color);
        }
    }
}
