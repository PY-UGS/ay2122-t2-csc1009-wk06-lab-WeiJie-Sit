package T6;
import java.util.*;

public class LinkedListTest {
    static Random rd = new Random();
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println("--------------------Q1----------------------");
        addAndSort(list,10);
        System.out.println(list);
        System.out.println("--------------------Q2----------------------");
        list = swapValues(list,1,6);
        System.out.println(list);
        System.out.println("--------------------Q3----------------------");
        int ran = rd.nextInt(9999)+1000;
        LinkedList list1 = randomVariable(500);
        System.out.printf(findValue(list1,ran)+"");

    }
    public static void addAndSort(LinkedList<Integer> list,int value){
        System.out.println("Before add: " + list);
        list.add(value);
        list.sort(Comparator.naturalOrder());
        System.out.println("After add: " + list);
    }
    public static LinkedList swapValues(LinkedList<Integer> list,int indexOne, int indexTwo){
        System.out.println("Before swap: " + list);
        System.out.println(list);
        int a = list.get(indexOne);
        int b = list.get(indexTwo);
        list.set(indexOne, b);
        list.set(indexTwo, a);
        System.out.println("After swap: " + list);
        return list;
    }
    public static int findValue(LinkedList<Integer> list, int searchValue){
        int a =  -1;
        for(int i=0; i<list.size();i++){
            if(list.get(i)==searchValue){
                a = i;
            }
        }
        return a;
    }



    public static LinkedList randomVariable(int num){
        LinkedList list = new LinkedList();
        for (int i = 0; i < num; i++) {
            list.add(rd.nextInt(9999)+1000);
        }
        return list;
    }
}
