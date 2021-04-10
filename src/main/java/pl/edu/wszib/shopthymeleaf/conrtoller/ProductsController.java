package pl.edu.wszib.shopthymeleaf.conrtoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.wszib.shopthymeleaf.dao.ProductDao;
import pl.edu.wszib.shopthymeleaf.domain.Product;
import pl.edu.wszib.shopthymeleaf.service.ProductService;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    private ProductService productService;

    @GetMapping ({"", "products"})
    public String products(Model model){
        List<Product> all = productService.findAll();
        model.addAttribute("productList", all);
        return "products";
    }
}
