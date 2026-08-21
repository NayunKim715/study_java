package ex04_work;

public class Can {
    private String name;
    private int price;

    public Can( String name, int price ){
       this.name = name;
       this.price = price;
    }

    //Source Action-Generate Getters&Setters
    public String getName() {
        return name;
    }
    /*8월 21일 세터 지움
    public void setName(String name) {
        this.name = name;
    }
    */
    public int getPrice() {
        return price;
    }
    /*8월 21일 세터 지움
    public void setPrice(int price) {
        this.price = price;
    }
    */
    
}
