// Клас для виведення меню
package learning.java;

public class MenuOutput {
    public void printMenu(Menu menu) {
        for (MenuItem item : menu.getItems()) {
            System.out.println(item);
        }
    }
}
