package service.impl;

import List.ArrayList;
import List.ManagerList;
import service.Service;
import shop.Manager;
import shop.Shop;

import java.time.LocalDate;
import java.util.Scanner;

public class ServiceImpl implements Service {
    private ArrayList arrayList = new ArrayList();
    private ManagerList managerList = new ManagerList();


    @Override
    public void addProducts(Shop products) {
        arrayList.getArrayList().add(products);
    }

    @Override
    public void showCase(String company) {
        for (int i = 0; i < arrayList.getArrayList().size(); i++) {
            if (arrayList.getArrayList().get(i).getCompany().equals(company)) {
                if ((arrayList.getArrayList().get(i).getFrom()).plusMonths(1).isBefore(arrayList.getArrayList().get(i).getBefore())) {
                    System.out.println("Added to the showcase: " + arrayList.getArrayList().get(i));
                } else if ((arrayList.getArrayList().get(i).getFrom()).isBefore(arrayList.getArrayList().get(i).getBefore())) {
                    System.out.println("Not allowed:" + arrayList.getArrayList().get(i));
                }
            }
        }
    }


    @Override
    public void delete() {
        for (int i = 0; i < arrayList.getArrayList().size(); i++) {
            if (arrayList.getArrayList().get(i).getFrom().minusMonths(1).isAfter(arrayList.getArrayList().get(i).getBefore())) {
                System.out.println("Prosrok delete:\n" + arrayList.getArrayList().remove(arrayList.getArrayList().get(i)));
            } else if (arrayList.getArrayList().get(i).getFrom().plusWeeks(3).isAfter(arrayList.getArrayList().get(i).getBefore())) {
                System.out.println("Show case of discounts : " + arrayList.getArrayList().get(i));

            } else if (arrayList.getArrayList().get(i).getFrom().plusMonths(1).isAfter(arrayList.getArrayList().get(i).getBefore())) {
                System.out.println("Ne Prosrok: " + arrayList.getArrayList().get(i));
            }
        }
    }

    @Override
    public Boolean manager() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            if (managerList.getLogin().equals(scanner.nextLine()) && managerList.getPassword() == scanner.nextInt()) {
                return true;
            }
        }return false;
    }
}






