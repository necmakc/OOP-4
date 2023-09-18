/**
 * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 * Можно сравнивать коробки с яблоками и апельсинами;
 * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 * g. Не забываем про метод добавления фрукта в коробку.
 */
public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        System.out.println("Вес коробки №1 с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки №2 с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Вес коробки №3 с яблоками: " + appleBox2.getWeight());

        System.out.println("Коробка №1 с яблоками и коробка №2 с апельсинами равны? " + appleBox1.compare(orangeBox1));
        System.out.println("Коробка №1 с яблоками и коробка №3 с яблоками равны? " + appleBox1.compare(appleBox2));

        appleBox1.transferFruits(appleBox2);
        System.out.println("\nПересыпали из коробки №1 с яблоками в коробку №3 с яблоками");
        System.out.println("Вес коробки №1 с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес коробки №2 с апельсинами: " + orangeBox1.getWeight());
        System.out.println("Вес коробки №3 с яблоками: " + appleBox2.getWeight());


    }
}

