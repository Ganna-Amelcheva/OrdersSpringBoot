package web.ordersspringboot.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number", nullable = false, unique = true)
    private Integer number;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name="timeOrder")
    private LocalDateTime timeOrder;
    @OneToMany(mappedBy = "name")
    private List<Dish> dishes = new ArrayList<>();
    @OneToOne(mappedBy = "client_id")
    private Client client;


    public Order(Integer number, double price, List<Dish> dishes, Client client) {
        this.number = number;
        this.price = price;
        this.dishes = dishes;
        this.client = client;
        this.timeOrder = LocalDateTime.now();
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}

