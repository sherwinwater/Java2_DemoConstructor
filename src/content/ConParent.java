package content;


public class ConParent {

    private String name;
    
    public ConParent(){
        this("Dino");
        System.out.println(" Return Dino");
    }
    public ConParent(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}
