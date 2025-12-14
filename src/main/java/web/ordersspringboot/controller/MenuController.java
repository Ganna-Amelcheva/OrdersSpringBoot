package web.ordersspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {
    @GetMapping
    public String getAllDishes(Model modell){
        return "menu";
    }
//    @GetMapping("/{menuSection}")
//    public String getMenuSection(Model model, @PathVariable String menuSection){
//
//    }
}
//Функционал
//Добавление блюд (название, цена)
//Создание заказов (клиент + блюда)
//Просмотр заказов
//
//Страницы:
//Главная (/) — навигация
//Меню (/menu) — список блюд, форма добавления
//Заказы (/orders) — список всех заказов
//Создать заказ (/orders/new) — форма создания заказа