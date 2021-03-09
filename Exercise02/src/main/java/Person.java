public class Person {
    
    private String name;
    private ShoppingList shoppingList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingList getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }
    
    //ShoppingList refers to the other class, it is making it an object type that can be used in other classes
    //this makes ShoppingList an attribute of the Person class
    
    public Person(String name, ShoppingList shoppingList) {
        this.name = name;
        this.shoppingList = shoppingList;
    }
    
    public Person(String name){
        this.name = name;
        //when an instance of the Person class is called then a new instance of the ShoppingList is created as well
        this.shoppingList = new ShoppingList();//new operator means I want a new object from the class, it means give me an object of this class
    }
    
    public void display(){
        System.out.println(this.name + ":");
        this.shoppingList.display();
}
}
