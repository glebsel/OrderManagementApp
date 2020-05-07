package OMA.repository;

import OMA.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class JpaProductRepository {

    private EntityManager em;

    public List<Product> getAll() {
        return em.createNamedQuery(Product.ALL_SORTED, Product.class)
                .getResultList();
    }

}
