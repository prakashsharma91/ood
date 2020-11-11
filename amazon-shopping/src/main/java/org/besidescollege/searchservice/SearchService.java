package org.besidescollege.searchservice;

import java.util.List;

import org.besidescollege.domain.product.Product;

public interface SearchService {

    public List<Product> searchProductsByName(String name);

    public List<Product> searchProductsByCategory(String category);
}
