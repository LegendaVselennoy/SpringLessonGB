package main;

import com.google.gson.Gson;
import model.Person;

public class Main {
    public static void main(String[] args) {
        Person p=new Person();
        Gson gson=new Gson();
        String jsonString=gson.toJson(p);
        System.out.println("Преобразование объекта Person в строку JSON: "+jsonString);

        p=gson.fromJson(jsonString,Person.class);
        System.out.println("\nПреобразование строки JSON в объект Person "+p.toString());
    }
}
