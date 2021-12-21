package org.springframework.samples.petclinic.product;

import lombok.Getter;
import lombok.Setter;
import org.springframework.samples.petclinic.model.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter
@Setter
@Entity
public class ProductType extends BaseEntity {

    @NotEmpty
    @Size(min=3, max = 50)
    @Column(unique = true)
    String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productType")
    private Set<Product> products;
}
