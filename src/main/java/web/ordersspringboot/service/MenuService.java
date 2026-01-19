package web.ordersspringboot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.ordersspringboot.model.Dish;
import web.ordersspringboot.repository.MenuDao;

import java.util.List;

@Service
public class MenuService {
    private MenuDao menuDao;

    public MenuService(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    public List<Dish> getAllDishes() {
        return menuDao.getAllDishes();
    }

    public List<Dish> getMenuSection(String menuSection) {
        return menuDao.getMenuSection(menuSection);
    }

    public void deleteDish(Long id) {
        menuDao.deleteDish(id);
    }

    @Transactional
    public Dish createDish(Dish dish) {
        return menuDao.createDish(dish);
    }

    @Transactional
    public Dish updateDish(Dish dish, Long id) {
        return menuDao.updateDish(dish, id);
    }

    public Dish getDishById(Long id) {
        return menuDao.getDishById(id);
    }

    @Transactional
    public Dish patchDish(String name, Long id) {
        return menuDao.patchDish(name, id);
    }
}
