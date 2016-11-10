package org.ua;

/**
 * Created by anzo0316 on 11/10/2016.
 */
public class Grade {

    int number;
    String letter;
    String word;


    public Grade(int number, String letter, String word) {
        this.number = number;
        this.letter = letter;
        this.word = word;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grade grade = (Grade) o;

        if (number != grade.number) return false;
        if (letter != null ? !letter.equals(grade.letter) : grade.letter != null) return false;
        return word != null ? word.equals(grade.word) : grade.word == null;

    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (letter != null ? letter.hashCode() : 0);
        result = 31 * result + (word != null ? word.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "number=" + number +
                ", letter='" + letter + '\'' +
                ", word='" + word + '\'' +
                '}';
    }
}
