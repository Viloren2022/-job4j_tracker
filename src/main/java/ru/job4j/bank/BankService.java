package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса используя:
 * 1) аккаунт пользователя {@link Account}
 * 2) модель данных пользователя {@link User}
 * @author Marat Garifullin
 * @version 1.0
 */

public class BankService {
    /**
     * Хранение аккаунтов пользователей банка осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Этот метод добавляет пользователя в систему при условии,
     * что такого пользователя еще нет в системе и создает коллекцию
     * для его счетов типа ArrayList
     * @param user пользователь, который нужно добавить в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет пользователю.
     * Пользователь ищется по пасспорту {@link ru.job4j.bank.BankService#findByPassport(String)}
     * @param passport номер паспорта для поиска пользователя
     * @param account номер счёта, для проверки на наличие счёта
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> allUser = users.get(user);
            if (!allUser.contains(account)) {
                allUser.add(account);
            }
        }
    }

    /**
     * Метод реализует поиск пользователя по номеру паспорта,
     * если пользователя нет, возрващает null
     * @param passport идентификатор для поиска пользователя в системе
     * @return возвращает найденного пользователя, либо null
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport используется для поиска пользователя
     * @param requisite используется для сравнения с реквзитами клиента из системы
     * @return  возвращает найденный по входным данным счет, либо null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account userAccount = null;
        if (user != null) {
            for (Account findAccount : users.get(user)) {
                if (findAccount.getRequisite().equals(requisite)) {
                    userAccount = findAccount;
                    break;
                }
            }
        }
        return userAccount;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт
     * Сначала находится счет с которого будут списаны средства
     * при помощи метода {@link ru.job4j.bank.BankService#findByRequisite(String, String)}
     * После находится счет зачисления по тому же методу
     * Если все счета найдены и сумма для перевода не превышает возможную для списания,
     * происходит списание суммы с исходного счета на заданный
     * @param srcPassport номер паспорта отправителя денег
     * @param srcRequisite реквизиты отправителя денег
     * @param destPassport номер паспорта полуателя денег
     * @param destRequisite реквизиты полуателя денег
     * @param amount сумма перевода
     * @return возвращает true\false в зависимости от успешной\не успешной операции по переводу денег
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if ((accountSrc != null) && (accountDest != null) && (accountSrc.getBalance() >= amount)) {
            accountDest.setBalance(amount + accountDest.getBalance());
            accountSrc.setBalance(accountSrc.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}