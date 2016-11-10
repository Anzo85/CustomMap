package org.ua;

/**
 * Created by anzo0316 on 11/10/2016.
 */
public class Main {


    public static void main(String[] args) {


        TestMap map = new TestMap();

        Student student1 = new Student("Kolya", "Herasimov", 21);
        Student student2 = new Student("Kolya2", "Herasimov2", 31);
        Grade g1 = new Grade(4, "b", "good");
        Grade g2 = new Grade(5, "a", "excellent");

        map.put(student1, g1);
        map.put(student2, g2);


        System.out.println(map.get(student1));

    }
}
