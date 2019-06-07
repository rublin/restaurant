package org.restaurant.crudrestapi.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "item_in_bill",
            joinColumns = @JoinColumn(name = "bill_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    List<ItemInBill> items;
    private LocalDateTime orderedTime;

    public Integer totalPrice() {
        int sum = items.stream()
                .mapToInt(i -> i.getItem().getPrice() * i.getQuantity())
                .sum();

        return sum;
    }
}
