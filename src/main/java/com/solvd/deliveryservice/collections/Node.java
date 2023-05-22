package com.solvd.deliveryservice.collections;

public class Node<T> {
    private T data;
    private Node<T> nextNode;

    public Node(){};

    public Node(T data){
        this.data = data;
    }

    public Node(Node<T> nextNode,T data){
        this.nextNode = nextNode;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

}
