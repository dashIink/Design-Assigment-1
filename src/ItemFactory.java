public class ItemFactory implements AbstractItemFactory{
    Database data;
    public ItemFactory (){
        data = new Database();
    }

    public ItemCreation createItem(String name){
        ItemCreation temp = new Item();
        temp.setName(name);
        temp.setPrice(data.getPrice(name));
        return temp;
    }
}
