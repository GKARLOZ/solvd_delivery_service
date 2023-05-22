package com.solvd.deliveryservice.collections;

import com.solvd.deliveryservice.app.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PeopleLinkedList<T extends Person> {
        private final static Logger LOGGER = LogManager.getLogger(PeopleLinkedList.class);
        private Node<T> head;
        public PeopleLinkedList(){};
        public void addLast(T data){
                Node<T> newNode = new Node<T>(data);
                if(this.head == null){
                        head = newNode;
                }else {
                        Node<T> current = head;
                        while(current.getNextNode() != null){
                                current = current.getNextNode();
                        }
                        current.setNextNode(newNode);
                }
        }

        public void addFirst(T data){
                Node<T> newNode = new Node<T>(data);
                newNode.setNextNode(head);
                head = newNode;
        }

        public void insertAt(int index, T data){
                Node<T> insertNode = new Node<T>(data);
                Node<T> node = head;
                for(int i = 0; i< index -1; i++){
                        node = node.getNextNode();
                }
                insertNode.setNextNode(node.getNextNode());
                node.setNextNode(insertNode);
        }

        public void deleteAt(int index){
                Node<T> node = head;
                for(int i = 0; i< index -1; i++){
                        node = node.getNextNode();
                }
                node.setNextNode(node.getNextNode().getNextNode());
        }

        public void show(){
                if(head != null) {
                        Node<T> current = head;

                        while (current.getNextNode() != null) {
                                LOGGER.info(current.getData());
                                current = current.getNextNode();
                        }
                        LOGGER.info(current.getData());
                }
        }


}
