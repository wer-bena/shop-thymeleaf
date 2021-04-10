package pl.edu.wszib.shopthymeleaf.service;

import pl.edu.wszib.shopthymeleaf.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
