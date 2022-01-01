package src;

import java.util.HashSet;

public class HashSetMainClass {
    public static void main(String[] args) {
        HashSet<String> countrySet = new HashSet<>();
        //1. Составим список стран, которые мы хотим посетить в этом году
            countrySet.add("США");
            countrySet.add("Индия");
            countrySet.add("Германия");
            countrySet.add("Япония");
            countrySet.add("Италия");
            countrySet.add("Греция");
            countrySet.add("Минск");

            System.out.println("_______________________________________");
            System.out.println("Список желаемых к посещнию стран: "+countrySet);

        //2. Удалим Минск из списка
            System.out.println("-Удалось удалить Минск?" +(countrySet.remove("Минск")?": -Да":": -Нет"));

        //3. Теперь найдем в списке Японию
        if (countrySet.contains("Япония")) {
            System.out.println("Ура, Японию не забыли добавить в список!");
        } else {
            System.out.println("Неужели забыли???");
        }

        //4. Узнаем количество стран в нашем списке
            System.out.println("Всего стран в нашем списке "+countrySet.size());

        //5. Блин, на дворе 2021, никуда мы не поедем(
            countrySet.clear();

        //6. Проверим все ли удалилось из списка
            System.out.println("Список очистили?"+ (countrySet.isEmpty()?" -Да, очистили":"Нет, что-то пошло не по плану("));

            System.out.println("______________");
    }
}
