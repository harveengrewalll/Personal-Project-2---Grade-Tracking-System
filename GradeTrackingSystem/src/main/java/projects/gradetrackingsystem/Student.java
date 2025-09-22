package projects.gradetrackingsystem;

import javafx.beans.property.*;

public class Student {
    private final StringProperty name;
    private final StringProperty course;
    private final DoubleProperty grade;
    private final IntegerProperty credits;

    public Student(String name, String course, double grade, int credits) {
        this.name = new SimpleStringProperty(name);
        this.course = new SimpleStringProperty(course);
        this.grade = new SimpleDoubleProperty(grade);
        this.credits = new SimpleIntegerProperty(credits);
    }

    // Getters
    public String getName() { return name.get(); }
    public String getCourse() { return course.get(); }
    public double getGrade() { return grade.get(); }
    public int getCredits() { return credits.get(); }

    // Property getters (for TableView binding)
    public StringProperty nameProperty() { return name; }
    public StringProperty courseProperty() { return course; }
    public DoubleProperty gradeProperty() { return grade; }
    public IntegerProperty creditsProperty() { return credits; }

    // Setters
    public void setName(String value) { name.set(value); }
    public void setCourse(String value) { course.set(value); }
    public void setGrade(double value) { grade.set(value); }
    public void setCredits(int value) { credits.set(value); }
}
