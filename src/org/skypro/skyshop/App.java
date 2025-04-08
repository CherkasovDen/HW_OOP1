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
        /** addProduct() Метод добавления продукта в корзину: метод принимает в себя продукт и ничего не возвращает
         *
         */
        bas1.addProduct(apple);
        bas1.addProduct(milk);
        bas1.addProduct(bread);
        bas1.addProduct(bananas);
        bas1.addProduct(potato);

        System.out.println("Добавление 6го продукта в корзину");
        bas1.addProduct(meat);
        System.out.println(" ");

        /** getTotalPrice() Метод получения общей стоимости корзины: метод ничего не принимает и возвращает целое число.
         *
         */
        System.out.println("Общая стоимость корзины: " + bas1.getTotalPrice());
        System.out.println(" ");

/** printBasket() Метод, который печатает содержимое корзины: метод ничего не принимает и не возвращает, но печатает в консоль сообщение вида:
 <имя продукта>: <стоимость>
 <имя продукта>: <стоимость>
 <имя продукта>: <стоимость>
 Итого: <общая стоимость корзины>
 Если в корзине ничего нет, нужно напечатать фразу «в корзине пусто».
 *
 */
        System.out.println("Содержимое корзины");
        bas1.printBasket();
        System.out.println(" ");

/** checkProduct Метод, проверяющий продукт в корзине по имени: метод принимает в себя строку имени и возвращает
 boolean
 в зависимости от того, есть продукт в корзине или его нет.
 *
 */
        System.out.println("Поиск товара, который есть в корзине");
        System.out.println("В корзине есть 'Яблоко': " + bas1.checkProduct("Яблоко"));
        System.out.println("Поиск товара, которого нет в корзине.");
        System.out.println("В корзине есть 'Греча': " + bas1.checkProduct("Греча"));
        System.out.println(" ");
/** clearBasket Метод очистки корзины: метод ничего не принимает и очищает массив, проставляя всем его элементам
 null
 *
 */
        System.out.println("Очистка корзины.");
        bas1.clearBasket();

        bas1.printBasket();
        System.out.println("Общая стоимость корзины: " + bas1.getTotalPrice());
        System.out.println("В корзине есть 'Яблоко': " + bas1.checkProduct("Яблоко"));
    }
}