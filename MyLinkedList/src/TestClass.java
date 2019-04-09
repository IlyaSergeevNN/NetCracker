import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        long startTime;
        long estimatedTime;

        System.out.println("ArrayList VS LinkedList");

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        int k = 1000000;
        String mapValue = "MapValue";

        for (int i = 0; i < k; i++) {
            arrayList.add(i);
            linkedList1.add(i);
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
            hashMap.put(i, mapValue + i);
            linkedHashMap.put(i, mapValue + i);
            treeMap.put(i, mapValue + i);
        }

        System.out.println();
        System.out.println("ADD ELEMENT");

        startTime = System.nanoTime();
        arrayList.add(k);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedList1.add(k);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Linked List: " + estimatedTime);

        System.out.println();
        System.out.println("INSERT ELEMENT");

        startTime = System.nanoTime();
        arrayList.add(k/2, 50000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedList1.add(k/2, 50000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Linked List: " + estimatedTime);

        System.out.println();
        System.out.println("REMOVE ELEMENT");

        startTime = System.nanoTime();
        arrayList.remove(k/2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("ArrayList:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedList1.remove(k/2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Linked List: " + estimatedTime);

        System.out.println();
        System.out.println("HashSet VS LinkedHashSet VS TreeSet ");

        System.out.println();
        System.out.println("ADD ELEMENT");

        startTime = System.nanoTime();
        hashSet.add(k+1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedHashSet.add(k+1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet: " + estimatedTime);

        startTime = System.nanoTime();
        treeSet.add(k+1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet: " + estimatedTime);

        System.out.println();
        System.out.println("REMOVE ELEMENT");

        startTime = System.nanoTime();
        hashSet.remove(k/2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedHashSet.remove(k/2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet: " + estimatedTime);

        startTime = System.nanoTime();
        treeSet.remove(k/2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet: " + estimatedTime);

        System.out.println();
        System.out.println("HashMap VS LinkedHashMap VS TreeMap");

        System.out.println();
        System.out.println("ADD ELEMENT");

        startTime = System.nanoTime();
        hashMap.put(k+1, "Hello");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedHashMap.put(k+1, "Hello");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        treeMap.put(k+1, "Hello");;
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap: " + estimatedTime);

        System.out.println();
        System.out.println("REMOVE ELEMENT");

        startTime = System.nanoTime();
        hashMap.remove(k/2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedHashMap.remove(k/2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        treeMap.remove(k/2);;
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap: " + estimatedTime);

        System.out.println();
        System.out.println("GET ELEMENT");

        startTime = System.nanoTime();
        hashMap.get(k/2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedHashMap.get(k/2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap: " + estimatedTime);

        startTime = System.nanoTime();
        treeMap.get(k/2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap: " + estimatedTime);







    }


}
