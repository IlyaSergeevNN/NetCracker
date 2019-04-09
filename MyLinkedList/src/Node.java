public class Node<E> {

    private E element;
    private Node<E> nextNode;
    private Node<E> previousNode;


    public Node(E element) {
        this.element = element;
        nextNode = null;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<E> previousNode) {
        this.previousNode = previousNode;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<E> getNode(){
        return this;
    }
}
