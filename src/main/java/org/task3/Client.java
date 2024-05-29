package org.task3;

import java.util.ArrayList;

public class Client {
    private int uniqueIdentificator;
    private String name;
    private int age;
    private boolean maleOrFemale; //true - male, false - female
    private ArrayList<Phone> phones = new ArrayList<>();

    public Client(int uniqueIdentificator, String name, int age, boolean maleOrFemale, ArrayList<Phone> phones) {
        this.uniqueIdentificator = uniqueIdentificator;
        this.name = name;
        this.age = age;
        this.maleOrFemale = maleOrFemale;
        this.phones.addAll(phones);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public Phone getPhones(int i) {
        return phones.get(i);
    }

    @Override
    public String toString() {
        if (maleOrFemale == true) {
            return name + " " + age + " male " + phones.toString();
        }
        else {
            return name + " " + age + " female " + phones.toString();
        }
    }
}