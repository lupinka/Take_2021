/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logic;

import java.io.Serializable;
import static java.lang.Math.sin;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.time.LocalDateTime; 
import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/**
 *
 * @author anna
 */
@Named(value = "logicalBean")
@RequestScoped
public class LogicalBean {
    private int number1, number2, sum;
    private List<Student> students;
    private LineChartModel lineModel;

    /**
     * Creates a new instance of LogicalBean
     */
    public LogicalBean() {
        addStudents();
        createCharts();
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
    
    private void createCharts()
    {
        lineModel = new LineChartModel();
        LineChartSeries s = new LineChartSeries();
        s.setLabel("Sinus");

        for (int i=0; i<=360; i=i+10)
        {
            s.set(i, sin(Math.toRadians(i)));
        }
        lineModel.addSeries(s);
        lineModel.setLegendPosition("e");
        lineModel.setZoom(true);
        Axis y = lineModel.getAxis(AxisType.Y);
        y.setMin(-1);
        y.setMax(1);
        y.setLabel("Y");

        Axis x = lineModel.getAxis(AxisType.X);
        x.setMin(0);
        x.setMax(360);
        x.setTickInterval("1");
        x.setLabel("X");
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
    
    public LineChartModel getLineModel() {
      return lineModel;
    }
}
