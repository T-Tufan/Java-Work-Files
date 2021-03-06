package GenelKonular.OOP6;

public class Book_Encapsulation {
    public String name,author,publisher;
    private int numberofpage;

    public void pageSize(){
        System.out.println(numberofpage);
    }
    public Book_Encapsulation(String name, String author, String publisher, int numberofpage) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if (numberofpage<1){
            System.out.println("Sayfa sayısı negatif olamaz");
            this.numberofpage = 10;
        }
        else this.numberofpage = numberofpage;
    }

    public int getNumberofpage(){
        return this.numberofpage;
    }

    public void setNumberofpage(int numberofpage) {
        if (numberofpage<1){
            System.out.println("Yazdırılmak istenen değer : "+numberofpage);
            System.out.println("Sayfa sayısı negatif olamaz");
            this.numberofpage = 100;
            System.out.println("Yazdırılacak değer : "+this.numberofpage);
        }
    }

    public String print() {
        return "Book_Encapsulation{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numberofpage=" + numberofpage +
                '}';
    }
}
