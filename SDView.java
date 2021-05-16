package com.company;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

public class SDView {
    private SDController control;
    private GridPane Startview;
    Button exitButton=new Button("Exit");
    Button FindStudentButton=new Button("Show student information");
    Button ButtonOne=new Button("Print course information");
    Button ButtonTwo=new Button("Print student results");

    Label CourseSelection=new Label("Select course:");
    Label StudentSelection=new Label("Select student ID:");
    Label StudentResult = new Label("Select the students results:");
    Label CourseInfo = new Label("Select course to get information:");

    TextArea SDText = new TextArea();

    ComboBox<String> ClassSelectionComB = new ComboBox<>();
    ComboBox<String> AllCourseComB = new ComboBox<>();
    ComboBox<String> StudentResultsComB = new ComboBox<>();
    ComboBox<String> StudentSelectionComB = new ComboBox<>();
    ComboBox<Integer> gradeListCombo = new ComboBox<>();

    public SDView(SDController control){
        this.control=control;
        createAndConfigure();
    }

    private void createAndConfigure(){
        Startview=new GridPane();
        Startview.setMinSize(300,400);
        Startview.setPadding(new Insets(10,10,10,10));
        Startview.setVgap(5);
        Startview.setHgap(1);

        Startview.add(exitButton, 20,15);
        Startview.add(FindStudentButton,15,6);

        ObservableList<String> courseIndex = control.getCourse();
        AllCourseComB.setItems(courseIndex);
        ObservableList<Integer> gradeInfo = control.getGrade();
        gradeListCombo.setItems(gradeInfo);
        ObservableList<String> studentsList = control.getStudent();
        StudentSelectionComB.setItems(studentsList);
        ObservableList<String> studentResults = control.getStudent();
        StudentResultsComB.setItems(studentResults);

    }
    public Parent asParent(){
        return Startview;
    }
}
