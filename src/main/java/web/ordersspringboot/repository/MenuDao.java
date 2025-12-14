package web.ordersspringboot.repository;



import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.ordersspringboot.model.Dish;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MenuDao implements MenuDaoInterface {
   @Autowired
   private EntityManager entityManager;

    @Override
    public List<Dish> getAllDishes() {
         List<Dish> dishes = new ArrayList<>();
         String sqlQuerue = "select dish from Dish dish";
         dishes = entityManager.createQuery(sqlQuerue, Dish.class).getResultList();
         return dishes;
    }

    @Override
    public List<Dish> getMenuSection(String menuSection) {
        String sqlQuery = "select dish from Dish dish where dish.menuSection=:menuSection";
        TypedQuery<Dish> dishTypedQuery = entityManager.createQuery(sqlQuery, Dish.class);
        dishTypedQuery.setParameter("menuSection", menuSection);
       return entityManager.createQuery(sqlQuery, Dish.class).getResultList();

    }
}
