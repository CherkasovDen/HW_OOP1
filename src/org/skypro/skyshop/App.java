package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {


        Product apple = new Product("Яблоко", 150);
        Product milk = new Product("Молоко", 82);
        Product bread = new Product("Хлеб", 70);
        Product bananas = new Product("Бананы", 150);
        Product potato = new Product("Картофель", 80);
        Product meat = new Product("Мясо", 400);

        ProductBasket bas1 = new ProductBasket();
        // Добавление продукта в корзину
        bas1.addProduct(apple);
        bas1.addProduct(milk);
        bas1.addProduct(bread);
        bas1.addProduct(bananas);
        bas1.addProduct(potato);

        //Добавление продукта в заполненную корзину, в которой нет свободного места.
        System.out.println("Добавление 6го продукта в корзину");
        bas1.addProduct(meat);
        System.out.println(" ");

        System.out.println("Общая стоимость корзины: " + bas1.getTotalPrice());
        System.out.println(" ");
// Печать содержимого корзины с несколькими товарами и Получение стоимости корзины с несколькими товарами.
        System.out.println("Содержимое корзины");
        bas1.printBasket();
        System.out.println(" ");
//Поиск товара, который есть в корзине.
        System.out.println("Поиск товара, который есть в корзине");
        System.out.println("В корзине есть 'Яблоко': " + bas1.checkProduct("Яблоко"));
        //Поиск товара, которого нет в корзине.
        System.out.println("Поиск товара, которого нет в корзине.");
        System.out.println("В корзине есть 'Греча': " + bas1.checkProduct("Греча"));
        System.out.println(" ");
//Очистка корзины.
        System.out.println("Очистка корзины.");
        bas1.clearBasket1();
//Печать содержимого пустой корзины.
        bas1.printBasket();
//Получение стоимости пустой корзины.
        System.out.println("Общая стоимость корзины: " + bas1.getTotalPrice());
//Поиск товара по имени в пустой корзине.
        System.out.println("В корзине есть 'Яблоко': " + bas1.checkProduct("Яблоко"));
    }
}