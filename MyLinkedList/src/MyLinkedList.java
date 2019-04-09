import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkedList<E> implements ILinkedList<E>{

    private Node<E> head;
    private Node<E> tail;
    private Node<E> newNode;
    private Node<E> current;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void add(Object element) {

        newNode = new Node(element);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode;
        }
        size++;
    }


    @Override
    public void add(int index, Object element) {

        newNode = new Node(element);

        checkIndexValid(index);

        if (index == 0) {
            newNode.setNextNode(head);
            head = newNode;
        } else if(index == size-1){
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode;
        } else {
            current = searchNodeByIndex(index-1);
            newNode.setNextNode(current.getNextNode());
            newNode.setPreviousNode(current);
            current.setNextNode(newNode);
        }
        size++;
    }

    @Override
    public void clear() {

        for (Node<E> current = head; current != null; ) {
            Node<E> next = head.getNextNode();
            current.setElement(null);
            current.setNextNode(null);
            current.setPreviousNode(null);
            current = next;
        }
        head = tail = null;
        size = 0;

    }

    public E get(int index){

        checkIndexValid(index);

        Iterator<E> iterator = this.iterator();
        int count = 0;

        while (iterator.hasNext()){
            E current = iterator.next();
            if(count == 0 && index == 0){
                return current;
            }else if(count == index) {
                return current;
            }else {
                count++;
            }
        }

        return null;
    }

    @Override
    public int indexOf(E element) {

        Iterator<E> iterator = this.iterator();
        int count = 0;

        while (iterator.hasNext()){
            if(iterator.next().equals(element)){
                return count;
            }else {
                count++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {

        checkIndexValid(index);

        Node<E> current = searchNodeByIndex(index);
        current.getPreviousNode().setNextNode(current.getNextNode());
        current.getNextNode().setPreviousNode(current.getPreviousNode());

        return current.getElement();
    }

    @Override
    public E set(int index, E element) {

        checkIndexValid(index);
        current = searchNodeByIndex(index);
        current.setElement(element);

        return null;
    }

    @Override
    public E[] toArray() {
        E[] arrayNodes;
        arrayNodes = (E[]) new Object[size];
        int i = 0;
        for (Node<E> node = head; node != null; node = node.getNextNode())
            arrayNodes[i++] = node.getElement();
        return arrayNodes;
    }

    public String toString(){

        String list = " ";
        E current;

        Iterator<E> iterator = this.iterator();
        int count = 0;

        while (iterator.hasNext()){
            current = iterator.next();
            list = list + "Index: = " + count +
                     " " + current.getClass() +
                    " Value: = " + current.toString() + ", ";
            count++;

        }

        return list;
    }

    public int size(){
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    class MyLinkedListIterator implements Iterator<E>{

        Node<E> current = null;

        @Override
        public boolean hasNext() {
            if(current == null && head != null){
                return true;
            }else if(current != null){
                return current.getNextNode() != null;
            }
            return false;
        }

        @Override
        public E next() {

            if(current == null && head != null){
                current = head;
                return head.getElement();
            }else if(current != null){
                current = current.getNextNode();
                return current.getElement();
            }

            throw new NoSuchElementException();
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super E> action) {

        }
    }

    public Node<E> searchNodeByIndex(int index) {
        Node<E> currentNode = null;
        if(index <= (size / 2)) {
            currentNode = head;
            for(int i = 0; i < index; ++i) {
                currentNode = currentNode.getNextNode();
            }
        } else {
            currentNode = tail;
            for(int i = size - 1; i > index; --i) {
                currentNode = currentNode.getPreviousNode();
            }
        }
        return currentNode;
    }

    public void checkIndexValid(int index){
        if(index < 0){
            throw new IllegalArgumentException();
        } else if(index >= this.size()){
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }



}
