// Основний клас, запускає програму
package learning.java;

public class RestourantApp {
    public static void main(String[] args) {
        // Створюємо меню
        Menu menu = new Menu();

        // Створюємо елементи меню за допомогою MenuItemCreator
        MenuItem item1 = CreateItem.createSpaghettiBolognese();
        MenuItem item2 = CreateItem.createGrilledChickenSalad();
        MenuItem item3 = CreateItem.createSpaghettiBolognese();

        // Додаємо елементи до меню
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        // Створюємо MenuPrinter для виведення меню
        MenuOutput menuPrinter = new MenuOutput();
        menuPrinter.printMenu(menu); // Виводимо меню
    }
}
