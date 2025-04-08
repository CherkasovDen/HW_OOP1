package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] productsBasket = new Product[5];


    // Наполенение корзины
    public void addProduct(Product product) {
        for (int i = 0; i < productsBasket.length; i++) {
            if (productsBasket[i] == null) {
                productsBasket[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт.");
    }

    // Общая стоимость корзины
    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product product : productsBasket) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

    // Печать содержимого корзины
    public void printBasket() {
        boolean isEmpty = true;
        for (Product product : productsBasket) {
            if (product != null) {
                System.out.println(product.toString());
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("В корзине пусто.");
            return;
        }
        System.out.println("Итого: " + getTotalPrice());
    }

    // Проверка продукта в корзине
    public boolean checkProduct(String nameProduct) {
        for (Product product : productsBasket) {
            if (product != null && product.getNameProduct().equals(nameProduct)) {
                return true;
            }
        }
        return false;
    }

    // Очистка корзины
        public void clearBasket() {
        for (int i = 0; i < productsBasket.length; i++) {
            productsBasket[i] = null;
        }
    }


}
