import java.util.ArrayList;
import java.util.Collection;

public class SubCatalog implements Catalog{
    private String name;
    private Collection<Catalog> subCategories;
    public SubCatalog(String name) {
        this.name = name;
        this.subCategories = new ArrayList<>();
    }
    public void addCatalog(Catalog catalog) {
        subCategories.add(catalog);
    }
    public void removeCatalog(Catalog catalog) {
        subCategories.remove(catalog);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.println("Category "+name);
        for (Catalog catalog : subCategories) {
            catalog.print();
        }
    }
}
