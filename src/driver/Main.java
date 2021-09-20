public class Main {
    public static void main(String[] args){
        ItemFactory factory = new ItemFactory();
        ItemCreation item1 = factory.createItem("Paper");
        ItemCreation item2 = factory.createItem("Pencils");

        System.out.print(item1.getName() + " ");
        System.out.println(item1.getPrice());
        System.out.print(item2.getName() + " ");
        System.out.println(item2.getPrice());

    }
}
