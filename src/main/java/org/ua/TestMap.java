package org.ua;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anzo0316 on 11/10/2016.
 */
public class TestMap {

    public static final int SIZE = 100;
    private Node[] elements;


    public TestMap() {

        elements = new Node[SIZE];
    }


    public void put(Student key, Grade value) {

        int index = hash(key);

        Node node = new Node(key, value);

        if (elements[index] == null) {
            elements[index] = node;
            return;
        }

        Node current = elements[index];
        while (current.next != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }

            current = current.next;


        }

        current.next = node;

    }


    public Grade get(Student key) {
        int index = hash(key);

        Node current = elements[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }

            current = current.next;
        }
        return null;
    }

    @Override
    public String toString() {
        return "TestMap{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    private int hash(Student key) {
        return Math.abs(key.hashCode()) % SIZE;
    }


    private class Node {


        private Student key;
        private Grade value;
        private Node next;

        public Node(Student key, Grade value) {
            this.key = key;
            this.value = value;
        }

    }
}
