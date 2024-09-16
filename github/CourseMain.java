public class CourseMain {
    public static void main(String[] args) {
        Instructor professor1 = new Instructor("Jim", "Jordan", 301);
        Instructor professor2 = new Instructor("Lia", "Lemons", 335);
        Textbook book1 = new Textbook("Clean Code", "Robert Martin", "Prentice Hall");
        Textbook book2 = new Textbook("Design Patterns", "Helms Johnson", "Addison Wesley");

        Course course1 = new Course("Software Engineering", professor1, book1);
        Course course2 = new Course("Information Retrieval", professor2, book2);

        course1.getCourseInfo();
        course2.getCourseInfo();

        System.exit(0);
    }
}
