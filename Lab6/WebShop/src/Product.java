public class Product implements Catalog{
    private String name;
    public Product(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.println(name);
    }
    }

