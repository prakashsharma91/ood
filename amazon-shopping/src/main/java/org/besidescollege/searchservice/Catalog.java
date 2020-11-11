package org.besidescollege.searchservice;

import java.util.HashMap;
import java.util.List;

import org.besidescollege.domain.product.Product;

public class Catalog implements SearchService {

    HashMap<String, List<Product>> productNames;
    HashMap<String, List<Product>> productCategories;

    @Override
    public List<Product> searchProductsByName(String name) {
        return productNames.get(name);
    }

    @Override
    public List<Product> searchProductsByCategory(String category) {
        return productCategories.get(category);
    }

}