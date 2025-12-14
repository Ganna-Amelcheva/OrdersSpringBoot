package web.ordersspringboot.repository;

import web.ordersspringboot.model.Dish;

import java.util.List;

public interface MenuDaoInterface {
    public List<Dish> getAllDishes();
    public List<Dish> getMenuSection(String menuSection);
}
