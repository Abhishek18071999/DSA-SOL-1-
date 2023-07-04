import java.util.*;
public class lAverageList {
    public static void main(String[] args) {
        ArrayList<Integer> ar= new ArrayList<>();
        ar.add(10);
        ar.add(15);
        ar.add(20);
        ar.add(25);
        ar.add(30);
        int sum = 0;
        int i = 0;
        do{
            
            sum =sum + ar.get(i);
            i++;
       }
       while(i<ar.size());
       int average = sum/ar.size();
       System.out.println(average);
    }
}
