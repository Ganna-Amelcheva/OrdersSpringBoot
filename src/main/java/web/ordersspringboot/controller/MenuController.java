package web.ordersspringboot.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.ordersspringboot.model.Dish;
import web.ordersspringboot.repository.MenuDao;

import java.util.List;


@RestController
@RequestMapping("/menu")
public class MenuController {
    private MenuDao menuService;

    public MenuController(MenuDao menuDao) {
        this.menuService = menuDao;
    }

    @GetMapping
    public ResponseEntity <List<Dish>> getAllDishes() {
         List<Dish> dishes = menuService.getAllDishes();
        return ResponseEntity.ok(dishes);
    }

    @GetMapping("/{menuSection}")
    public ResponseEntity<List<Dish>> getMenuSection( @PathVariable String menuSection) {
       List<Dish> dishes = menuService.getMenuSection(menuSection);
       if(dishes.isEmpty()){
           return ResponseEntity.noContent().build();
       }
        return ResponseEntity.ok(dishes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDish(@PathVariable Long id) {
        menuService.deleteDish(id);
        return ResponseEntity.noContent().build();
    }
    @PostMapping
    public ResponseEntity<Dish> createDish(@RequestBody Dish dish){
      menuService.createDish(dish);
      return ResponseEntity.status(HttpStatus.CREATED).body(dish);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Dish> updateDish(@RequestBody Dish dish, @PathVariable Long id){
       Dish updateDish = menuService.updateDish(dish, id);
        return ResponseEntity.ok(updateDish);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Dish> patchDish(@RequestBody String name, @PathVariable Long id){
        Dish updateDish = menuService.patchDish(name, id);
        return ResponseEntity.ok(updateDish);
    }
}
