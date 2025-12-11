package web.ordersspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdersSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdersSpringBootApplication.class, args);
    }

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