package OMA.repository;

import OMA.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
public class ProductRepository {

    private EntityManager em;

    @Transactional
    public boolean add(Product product){
        return false;
    }

    @Transactional
    public boolean delete(int id){
        return false;
    }

}
