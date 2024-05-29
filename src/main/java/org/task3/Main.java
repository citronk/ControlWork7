package org.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Задание 3
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("123456", false));
        clients.add(new Client(1, "Steve", 20, true, phones));
        phones.clear();
        phones.add(new Phone("89358468321", true));
        clients.add(new Client(2, "Jennifer", 30, false, phones));
        phones.clear();

        Stream<Client> clientStream = clients.stream();
        long count = clientStream.filter(w -> (w.getPhones().stream().anyMatch(p -> !p.mobileOrStationary()))).count();
        System.out.println(count);
        clientStream = clients.stream();
        clientStream
                .filter(w -> w.getAge() >= 18)
                .peek(System.out::println)
                .count();
        clientStream = clients.stream();
        boolean womenAge60 = clientStream.filter(w -> w.getAge() >= 60 && w.getPhones().stream().anyMatch(p -> !p.mobileOrStationary())).count() > 0;
        System.out.println(womenAge60);
        clientStream = clients.stream();
        clientStream
                .sorted(Comparator.comparing(Client::getName))
                .forEach(System.out::println);
        System.out.println();
        clientStream = clients.stream();
        clientStream
                .sorted(Comparator.comparing(Client::getAge))
                .forEach(System.out::println);
    }
}