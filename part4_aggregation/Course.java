package part4_aggregation;

import java.util.ArrayList;

public class Course {
    String name;
    ArrayList<Instructor> instructors;
    ArrayList<Textbook> textbooks;

    public Course() {
        instructors = new ArrayList<>();
        textbooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    }

    public void setTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", instructors=" + instructors +
                ", textbooks=" + textbooks +
                '}';
    }

    public void printCourse() {
        System.out.println(this.toString());
    }
}