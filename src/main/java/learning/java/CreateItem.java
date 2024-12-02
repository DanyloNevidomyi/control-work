//Клас для створення страв
package learning.java;

public class CreateItem {
    public static MenuItem createGrilledChickenSalad() {
        return new MenuItem("Grilled Chicken Salad", "A fresh mix of greens with grilled chicken, cherry tomatoes, and a light vinaigrette dressing.", 12.99);
    }

    public static MenuItem createSpaghettiBolognese() {
        return new MenuItem("Spaghetti Bolognese", "Traditional Italian pasta served with a rich meat sauce made from beef, tomatoes, and herbs.", 14.50);
    }

    public static MenuItem createVegetarianStirFry() {
        return new MenuItem("Vegetarian Stir-fry", "A colorful mix of stir-fried vegetables served with jasmine rice and a savory soy-based sauce.", 11.00);
    }
}
