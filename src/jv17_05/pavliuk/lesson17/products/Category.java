package jv17_05.pavliuk.lesson17.products;

import java.util.Set;

public class Category {
    private String name;
    private Set<Product> productSet;

    public Category(String name, Set<Product> productSet) {
        this.name = name;
        this.productSet = productSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    public boolean addProduct(Product product) {
        return productSet.add(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return productSet != null ? productSet.equals(category.productSet) : category.productSet == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (productSet != null ? productSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", productSet=" + productSet +
                '}';
    }
}
