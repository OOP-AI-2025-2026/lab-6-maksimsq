package ua.opnu.list;

import java.util.Comparator;

public class SurnameSorter implements Comparator<Student> {
    private boolean ascending;

    public SurnameSorter(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        return ascending
                ? s1.getLastName().compareTo(s2.getLastName())
                : s2.getLastName().compareTo(s1.getLastName());
    }
}