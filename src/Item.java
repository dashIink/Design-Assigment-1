public class Item implements ItemCreation{
    String name;
    int price;
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
