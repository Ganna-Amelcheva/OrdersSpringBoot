package web.ordersspringboot.repository;

import web.ordersspringboot.model.Dish;

import java.util.List;

public interface MenuDaoInterface {
    public List<Dish> getAllDishes();
    public List<Dish> getMenuSection(String menuSection);
    public void deleteDish(Long id);
    public Dish createDish(Dish dish);
    public Dish updateDish(Dish dish, Long id);
    public Dish patchDish(String name, Long id);
    public Dish getDishById(Long id);
}
