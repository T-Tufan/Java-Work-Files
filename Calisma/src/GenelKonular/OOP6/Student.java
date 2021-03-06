package GenelKonular.OOP6;

import java.util.ArrayList;

public class Student {
    public String name;
    public int number;
    public int point;
    private static int counter;

    Student(String name,int number,int point){
        this.name = name;
        this.number = number;
        this.point = point;
        Student.counter++;
    }
    public String print(){
        return  "Öğrenci ismi : "+name
                +"\nÖğrenci numaras : "+number
                +"\nÖğrenci puanı : "+point
                +"\nÖğrenci sırası : "+counter;
    }
    public void exit(){
        Student.counter--;
    }
    public static int howMuchStudent(){
        return Student.counter;
    }
    public static double classAverage(ArrayList<Integer> points){
        double sumPoint =0 ;
        for (int i=0 ; i<points.size();i++){
            sumPoint = points.get(i)+sumPoint;
        }
        return sumPoint/points.size();
    }
}
