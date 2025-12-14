package web.ordersspringboot.model;

import jakarta.persistence.*;


@Entity
@Table(name="dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="price", nullable = false)
    private double price;
    @Column(name="ingridients", nullable = false)
    private String ingridients;
    @Column(name = "menu_section", nullable = false)
    private String menuSection;

    public Dish(String name, double price, String ingridients, String menuSection) {
        this.name = name;
        this.price = price;
        this.ingridients = ingridients;
        this.menuSection = menuSection;
    }

    public Dish(){

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }

    public String getMenuSection() {
        return menuSection;
    }

    public void setMenuSection(String menuSection) {
        this.menuSection = menuSection;
    }
}
