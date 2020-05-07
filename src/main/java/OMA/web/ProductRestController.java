package OMA.web;

import OMA.model.Product;
import OMA.repository.JpaProductRepository;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProductRestController {

    private JpaProductRepository repository;

    public ProductRestController(JpaProductRepository repository){
        this.repository = repository;
    }

//    public void add(Product product) {
//        repository.add(product);
//    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public static List<Product> getThisOrder(List<Product> products) {
        return products.stream()
                .filter(product -> product.getId() > 0)
                .collect(Collectors.toList());
    }
}
