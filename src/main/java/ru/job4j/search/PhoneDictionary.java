package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */

    public ArrayList<Person> find(String key) {
        Predicate<Person> byName = n -> n.getName().contains(key);
        Predicate<Person> byPhone = p -> p.getPhone().contains(key);
        Predicate<Person> bySurName = s -> s.getSurname().contains(key);
        Predicate<Person> byAdress = a -> a.getAddress().contains(key);
        Predicate<Person> combine = byName.or((byAdress).or((byPhone.
                or((bySurName).or(byPhone)))));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}