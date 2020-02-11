package content;

public class ConChild extends ConParent {

    public ConChild() {
        this("Wilma");

        System.out.println("return wilma");

    }

    public ConChild(String name) {
        super(name);
    }

}
