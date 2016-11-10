package org.ua;

import javafx.scene.Scene;

/**
 * Created by anzo0316 on 11/10/2016.
 */
public class Student {

    private String fname;
    private String lname;
    private int age;

    public Student(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (fname != null ? !fname.equals(student.fname) : student.fname != null) return false;
        return lname != null ? lname.equals(student.lname) : student.lname == null;

    }

    @Override
    public int hashCode() {
        int result = fname != null ? fname.hashCode() : 0;
        result = 31 * result + (lname != null ? lname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
