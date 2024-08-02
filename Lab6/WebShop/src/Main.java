public class Main {
    public static void main(String[] args) {
        SubCatalog catalog = new SubCatalog("Catalog");
        SubCatalog subCatalog1 = new SubCatalog("SubCatalog1");
        SubCatalog subCatalog2 = new SubCatalog("SubCatalog2");

        Product product1 = new Product("Shoes");
        Product product2 = new Product("Trousers");
        Product product3 = new Product("Shirt");
        Product product4 = new Product("Hat");
        Product product5 = new Product("Socks");


        catalog.addCatalog(product1);
        catalog.addCatalog(product2);

        subCatalog1.addCatalog(product3);
        subCatalog1.addCatalog(product4);

        subCatalog2.addCatalog(product5);

        catalog.print();
    }
}