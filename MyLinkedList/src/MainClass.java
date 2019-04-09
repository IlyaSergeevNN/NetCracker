import java.util.LinkedList;

public class MainClass {

    public static void main(String[] args) {

        long startTime;
        long estimatedTime;

        MyLinkedList<Object> list = new MyLinkedList<>();
        list.add(16);
        list.add(9);
        list.add(16);
        list.add(new Object());

        list.add(0, "Begin");
        list.add(4, "End");
        list.add(2, "Insert");
        list.add(5, "Insert2");
        list.add(5, new Circle());

        for (Object a : list ) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Get Element by index: " + list.get(6));
        System.out.println();

        System.out.println("Index of element: " + list.indexOf(16));

        System.out.println();
        System.out.println("LIST AFTER REOMOVING ELEMENT");
        list.remove(2);

        for (Object a : list ) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("SET VALUE");
        list.set(3, "10000");
        for (Object a : list ) {
            System.out.println(a);
        }

        System.out.println(list.toString());

        System.out.println();
        System.out.println("To Array");
        Object[] array = list.toArray();
        System.out.println(array[5]);

        System.out.println();
        list.clear();
        System.out.println("Clear list: ");
        for (Object a : list ) {
            System.out.println(a);
        }

        System.out.println();
        System.out.println("My List VS Linked List");

        MyLinkedList<Circle> myLinkedList = new MyLinkedList<>();
        LinkedList<Circle> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            myLinkedList.add(new Circle());
            linkedList.add(new Circle());
        }

        Circle circle = new Circle(100, "Green");

        System.out.println("ADD ELEMENT");

        startTime = System.nanoTime();
        myLinkedList.add(circle);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("My List:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedList.add(circle);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Java List: " + estimatedTime);

        System.out.println();
        System.out.println("INSERT ELEMENT");

        startTime = System.nanoTime();
        myLinkedList.add(50000, circle);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("My List:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedList.add(50000, circle);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Java List: " + estimatedTime);

        System.out.println();
        System.out.println("FIND ELEMENT");

        startTime = System.nanoTime();
        myLinkedList.indexOf(circle);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("My List:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedList.indexOf(circle);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Java List: " + estimatedTime);

        System.out.println();
        System.out.println("REMOVE ELEMENT");

        startTime = System.nanoTime();
        myLinkedList.remove(50000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("My List:   " + estimatedTime);

        startTime = System.nanoTime();
        linkedList.remove(50000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Java List: " + estimatedTime);

    }
}
