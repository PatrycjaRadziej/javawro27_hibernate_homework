package com.javawro27.hibernate_hw;

import com.javawro27.hibernate_hw.model.Pet;
import com.javawro27.hibernate_hw.model.Race;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetDao dao = new PetDao();
        Scanner scanner = new Scanner(System.in);
        String commend;

        do{
            System.out.println("Podaj komendę [add/list/delete/update/quit]");
            commend = scanner.nextLine();
            if(commend.equalsIgnoreCase("add")){
                addPets(dao, scanner);
            } else if (commend.equalsIgnoreCase("list")){

            } else if (commend.equalsIgnoreCase("delete")){

            } else if (commend.equalsIgnoreCase("update")){

            }

        } while (
                !commend.equalsIgnoreCase("quit")
        );

    }

    private static void addPets(PetDao dao, Scanner scanner) {
        System.out.println("Podaj parametry: imie wiek imie_wlaściciela waga czy_rasowy rasa");
        String linia = scanner.nextLine();
        String [] slowa = linia.split(" ");
        Pet pet = Pet.builder()
                .name(slowa[0])
                .age(Integer.parseInt(slowa[1]))
                .ownerName(slowa[2])
                .weight(Double.parseDouble(slowa[3]))
                .pureRace(Boolean.parseBoolean(slowa[4]))
                .race(Race.valueOf(slowa[5].toUpperCase()))
                .build();
        dao.saveOrUpdate(pet);
    }
}
