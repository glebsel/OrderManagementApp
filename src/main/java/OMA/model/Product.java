package OMA.model;

import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@NamedQueries({
        @NamedQuery(name = Product.ALL_SORTED, query = "SELECT m FROM Product m")
})
@Entity
@Table(name = "product")
@Access(AccessType.FIELD)
public class Product {
    public static final String ALL_SORTED = "Product.getAll";


    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", allocationSize = 1, initialValue = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    private Integer id;

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, max = 100)
    private String name;

    @Column(name = "price", nullable = false)
    @NotNull
    private Long price;

    public Integer getId(){return this.id;}

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                '}';
    }
}
