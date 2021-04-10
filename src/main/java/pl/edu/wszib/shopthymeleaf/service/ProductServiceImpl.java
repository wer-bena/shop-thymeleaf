package pl.edu.wszib.shopthymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.shopthymeleaf.dao.ProductDao;
import pl.edu.wszib.shopthymeleaf.domain.Product;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public List<Product> findWithFilter(String from, String to, String onStock) {
        double fromValue = 0;
        double toValue;
        int quantityMin = 0;

        if (!from.isEmpty()){
            fromValue = Double.parseDouble(from);
        }
        if(to.isEmpty()){
            toValue = Double.MAX_VALUE;
        } else {
            toValue = Double.parseDouble(to);
        }
        if (onStock.equalsIgnoreCase("on")){
            quantityMin = 1;
        }

        return productDao.findAllByPriceBetweenAndQuantityGreaterThanEqual(fromValue, toValue, quantityMin);
    }
}
