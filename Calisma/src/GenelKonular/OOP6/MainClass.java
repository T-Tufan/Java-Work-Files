package GenelKonular.OOP6;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args){
        //1.video Erişim Belirleyiciler
        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.print());
        //2.video Static Konusu
        ArrayList<Integer> points = new ArrayList<Integer>();
        Student s1 = new Student("Tugay",150101056,100);
        Student s2 = new Student("Ramazan",150101031,71);
        Student s3 = new Student("Ahmet",160101021,70);
        points.add(s1.point);
        points.add(s2.point);
        points.add(s3.point);
        System.out.println("Sınıf ortalaması : "+ Student.classAverage(points));
        s1.exit();
        System.out.println("Sınıfta kalan öğrenci sayısı : "+ Student.howMuchStudent());
        //3.video Encapsulation
        Book_Encapsulation book1 = new Book_Encapsulation("Harry Potter","Rowling","Fantastik Hikaye",-400);
        book1.pageSize();//constructor sınıfı içine girdi.Kısıtlı erişim.
        /*
        book1.numberofpage = -20;
        book1.pageSize();//constructor sınıfı içine girmedi.Serbest erişim.
        */
        book1.setNumberofpage(-20);
        System.out.println(book1.print());
        //4.video Kalıtım
        A a = new A();
        B b = new B();
        a.run(b);


    }
}
