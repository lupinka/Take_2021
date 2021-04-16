/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logic;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.time.LocalDateTime; 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anna
 */
@Named(value = "logicalBean")
@RequestScoped
public class LogicalBean {
    private int number1, number2, sum;
    private List<Student> students;
    private List<ColumnModel> columns;

    /**
     * Creates a new instance of LogicalBean
     */
    public LogicalBean() {
        addStudents();
        createDynamicColumns();
    }
    
    private void addStudents()
    {
        students = new ArrayList();
        Student student = new Student("Jan", "Kowalski", (float) 4.5);
        Student student2 = new Student("Monika", "Nowal", (float) 3.4);
        Student student3 = new Student("Anna", "Maria", (float) 5.0);
        Student student4 = new Student("Mikołaj", "Swiety", (float) 3.5);
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }
    
     private void createDynamicColumns() {
        setColumns(new ArrayList<>());
        getColumns().add(new ColumnModel("Name", "name"));
        getColumns().add(new ColumnModel("Surname", "surname"));
        getColumns().add(new ColumnModel("Average", "average"));
    }
    
    public void sum()
    {
        sum = getNumber1()+getNumber2();
    }

    /**
     * @return the number1
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * @param number1 the number1 to set
     */
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    /**
     * @return the number2
     */
    public int getNumber2() {
        return number2;
    }
    
    public String getDate() {
        LocalDateTime myObj = LocalDateTime.now();
        return myObj.toString();
    }

    /**
     * @param number2 the number2 to set
     */
    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    /**
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }
    
    static public class ColumnModel implements Serializable {

        private String header;
        private String property;

        public ColumnModel(String header, String property) {
            this.header = header;
            this.property = property;
        }

        public String getHeader() {
            return header;
        }

        public String getProperty() {
            return property;
        }
    }

    /**
     * @return the columns
     */
    public List<ColumnModel> getColumns() {
        return columns;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(List<ColumnModel> columns) {
        this.columns = columns;
    }
}
