class Instructor {
    private final String firstName;
    private final String lastName;
    private final int office;
    public Instructor(String firstName, String lastName, int office) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.office = office;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getOffice() {
        return office;
    }
}

class Textbook {
    private final String title;
    private final String author;
    private final String publisher;
    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
}

public class Course {
    private final String courseName;
    private final Instructor instructor;
    private final Textbook textbook;
    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }
    public void getCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + ". Room #" + instructor.getOffice());
        System.out.println("Textbook: " + textbook.getTitle() + ". " + textbook.getAuthor() + ". Published by " + textbook.getPublisher() + "\n");
    }
}
