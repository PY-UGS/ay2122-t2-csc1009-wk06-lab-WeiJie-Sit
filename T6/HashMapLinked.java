package T6;

import java.util.*;



public class HashMapLinked {
    static Random rd = new Random();
    public static void main(String[] args) {
        HashMap <Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        LinkedList <Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        for (int i=0;i<list.size();i++){
            hashmap.put(i,list.get(i));
        }
        System.out.println("--------------------Q4----------------------");
        addAndSort(hashmap, 6);
        System.out.println("--------------------Q5----------------------");

        swapValues(hashmap,1,6);

        System.out.println("--------------------Q6----------------------");
        int ran  = rd.nextInt(9999)+1000;
        hashmap = randomVariable(500);
        System.out.println(findValueHash(hashmap,ran));
    }
    public static HashMap addAndSort(HashMap<Integer, Integer> hashMap, int value)
    {
        hashMap.put(hashMap.size(), value);
        System.out.println("Before sort: " + hashMap);
        LinkedList<Integer> tempList = new LinkedList<Integer>();

        for (int i = 0; i < hashMap.size(); i++) {
            tempList.add((int) hashMap.get(i));
        }

        tempList.sort(Comparator.naturalOrder());

        for (int i = 0; i < hashMap.size(); i++) {
            hashMap.put(i, tempList.get(i));
        }

        System.out.println("After sorting: " + hashMap + "\n");
        return hashMap;
    }

    public static HashMap swapValues(HashMap<Integer,Integer> hashMap,int indexOne,int indexTwo){
        System.out.println("Before swap: " + hashMap);
        int num1 = hashMap.get(indexOne);
        int num2 = hashMap.get(indexTwo);
        hashMap.put(indexOne,num2);
        hashMap.put(indexTwo,num1);
        System.out.println("After swap: " + hashMap);
        return hashMap;
    }

    public static int findValueHash(HashMap hashmap, int value) {
        for (int i = 0; i < hashmap.size(); i++) {
            if ((int) hashmap.get(i) == value) {
                return i;
            }
        }
        return -1;
    }


    public static HashMap randomVariable(int num){
        HashMap <Integer,Integer> hashmap = new HashMap();
        for (int i = 0; i < num; i++) {
            hashmap.put(i,rd.nextInt(9999)+1000);
        }
        return hashmap;
    }


}
