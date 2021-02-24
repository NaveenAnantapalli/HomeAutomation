package com.homeAutomation.backEnd.productMappings;

import com.homeAutomation.backEnd.products.Product;
import com.homeAutomation.backEnd.rooms.Room;
import com.homeAutomation.backEnd.user.Users;

import javax.persistence.*;

@Entity
@Table
public class ProductMapping {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room rooms;

    @Id
    @SequenceGenerator(
            name = "productMapping_sequence",
            sequenceName = "productMapping_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "productMapping_sequence"
    )

    private Long productMappingId;
    private Long productState;

    public ProductMapping() {
    }

    public ProductMapping(Long productState) {
        this.productState = productState;
    }

    public Long getProductMappingId() {
        return productMappingId;
    }

    public void setProductMappingId(Long productMappingId) {
        this.productMappingId = productMappingId;
    }

    public Long getProductState() {
        return productState;
    }

    public void setProductState(Long productState) {
        this.productState = productState;
    }

    @Override
    public String toString() {
        return "ProductMapping{" +
                "productState=" + productState +
                '}';
    }
}
