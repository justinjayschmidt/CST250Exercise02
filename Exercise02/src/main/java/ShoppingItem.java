public class ShoppingItem {
    private String name;
    private ShoppingStatus status; //need to define a java enum for this, click on default packages and click other and choose java - java enum

    public ShoppingItem(String name, ShoppingStatus status) {
        this.name = name;
        this.status = status;
    }
    
    public ShoppingItem(String name){
        this.name = name;
        this.status = ShoppingStatus.PURCHASED;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingStatus getStatus() {
        return status;
    }

    public void setStatus(ShoppingStatus status) {
        this.status = status;
    }
    
    public void display(){
        System.out.println(this.name + "\t\t" + this.status);
    }
    
   
}
