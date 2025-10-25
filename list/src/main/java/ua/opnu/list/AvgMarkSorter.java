package ua.opnu.list;

import java.util.Comparator;

public class AvgMarkSorter implements Comparator<Student> {
    private boolean ascending;

    public AvgMarkSorter(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        return ascending
                ? Double.compare(s1.getAvgMark(), s2.getAvgMark())
                : Double.compare(s2.getAvgMark(), s1.getAvgMark());
    }
}