package pl.edu.wszib.shopthymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.shopthymeleaf.domain.Product;

public interface ProductDao extends JpaRepository<Product, Long> {
}
