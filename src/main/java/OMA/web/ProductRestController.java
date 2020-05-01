package OMA.web;

import OMA.model.Product;
import OMA.repository.ProductRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductRestController {

    private final ProductRepository repository;

    public ProductRestController(ProductRepository repository){
        this.repository = repository;
    }

    public void add(Product product) {
        repository.add(product);
    }
}
