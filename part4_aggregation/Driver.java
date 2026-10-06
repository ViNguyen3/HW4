package part4_aggregation;

public class Driver {
    public static void main(String[] args) {

        // First course with one instructor and one textbook
        Course c1 = new Course();

        Instructor c1Instructor = new Instructor();
        c1Instructor.setFirstName("Nima");
        c1Instructor.setLastName("Davarpanah");
        c1Instructor.setOfficeNumber("3-2636");

        Textbook c1Textbook = new Textbook();
        c1Textbook.setAuthor("Robert Cecil Martin");
        c1Textbook.setPublisher("Pearson");
        c1Textbook.setTitle("CleanCode:A Handbook of Agile Software Craftsmanship");

        c1.setName("CS5800 - Advanced Software Engineering");
        c1.setInstructor(c1Instructor);
        c1.setTextbook(c1Textbook);

        System.out.println("Course with one instructor and one textbook:");
        c1.printCourse();

        System.out.println();

        // Second course with two instructors and two textbooks
        Course c2 = new Course();

        Instructor[] c2Instructors = new Instructor[2];
        Textbook[] c2Textbooks = new Textbook[2];

        c2Instructors[0] = c1Instructor;

        c2Instructors[1] = new Instructor();
        c2Instructors[1].setFirstName("Hao");
        c2Instructors[1].setLastName("Ji");
        c2Instructors[1].setOfficeNumber("8-42");

        c2Textbooks[0] = c1Textbook;

        c2Textbooks[1] = new Textbook();
        c2Textbooks[1].setAuthor("David Sedaris");
        c2Textbooks[1].setPublisher("Back Bay Books");
        c2Textbooks[1].setTitle("Me Talk Pretty One Day");

        c2.setName("CS6000-Duality");
        c2.setInstructor(c2Instructors[0]);
        c2.setInstructor(c2Instructors[1]);
        c2.setTextbook(c2Textbooks[0]);
        c2.setTextbook(c2Textbooks[1]);

        System.out.println("Course with two instructors and two textbooks:");
        c2.printCourse();
    }
}