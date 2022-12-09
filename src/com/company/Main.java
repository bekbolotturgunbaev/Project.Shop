package com.company;

import List.ManagerList;
import dairy.products.Kefir;
import dairy.products.Milk;
import dairy.products.Yogurt;
import meat.products.Fish;
import meat.products.Meat;
import meat.products.Sausage;
import myExeption.MyExeption;
import service.impl.ServiceImpl;
import shop.DairyProducts;
import shop.MeatProducts;
import shop.WheatProducts;
import wheat.products.Bread;
import wheat.products.Flour;
import wheat.products.Pasta;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                        try {

                                DairyProducts dairyProducts1 = new Milk("Milk", "MILKA", LocalDate.of(2022, 12, 5), LocalDate.of(2023, 1, 20));
                                DairyProducts dairyProducts2 = new Kefir("Kefir", "MILKA", LocalDate.of(2022, 12, 1), LocalDate.of(2022, 12, 31));
                                DairyProducts dairyProducts3 = new Yogurt("YogUrt", "MILKA", LocalDate.of(2022, 12, 3), LocalDate.of(2023, 1, 15));
                                DairyProducts dairyProducts4 = new Yogurt("Dove", "DOVE", LocalDate.of(2022, 12, 2), LocalDate.of(2022, 12, 30));
                                DairyProducts dairyProducts5 = new Yogurt("Klubnika", "Domik v derevne", LocalDate.of(2022, 12, 8), LocalDate.of(2022, 12, 25));

                                WheatProducts wheatProducts1 = new Bread("Bread", "NUR", LocalDate.of(2022, 11, 15), LocalDate.of(2022, 12, 27));
                                WheatProducts wheatProducts2 = new Pasta("Pasta", "NUR", LocalDate.of(2022, 11, 30), LocalDate.of(2023, 2, 28));
                                WheatProducts wheatProducts3 = new Flour("Flour", "NUR", LocalDate.of(2022, 12, 1), LocalDate.of(2022, 12, 19));
                                WheatProducts wheatProducts4 = new Flour("Kruasan", "MY BREAD", LocalDate.of(2022, 11, 26), LocalDate.of(2022, 12, 9));

                                MeatProducts meatProducts1 = new Sausage("Sausage", "TOIBOSS", LocalDate.of(2022, 12, 6), LocalDate.of(2023, 2, 2));
                                MeatProducts meatProducts2 = new Meat("Meat", "TOIBOSS", LocalDate.of(2022, 11, 30), LocalDate.of(2023, 3, 29));
                                MeatProducts meatProducts3 = new Fish("Fish", "TOIBOSS", LocalDate.of(2022, 11, 30), LocalDate.of(2023, 2, 11));
                                MeatProducts meatProducts4 = new Fish("Fish fuga", "Fish", LocalDate.of(2022, 11, 15), LocalDate.of(2022, 12, 15));



                                ServiceImpl service = new ServiceImpl();
                                /**
                                 * login = Login
                                 * password = 1234
                                 */
                                service.manager();


                                service.addProducts(dairyProducts1);
                                service.addProducts(dairyProducts2);
                                service.addProducts(dairyProducts3);
                                service.addProducts(dairyProducts4);
                                service.addProducts(dairyProducts5);

                                service.addProducts(wheatProducts1);
                                service.addProducts(wheatProducts2);
                                service.addProducts(wheatProducts3);
                                service.addProducts(wheatProducts4);

                                service.addProducts(meatProducts1);
                                service.addProducts(meatProducts2);
                                service.addProducts(meatProducts3);
                                service.addProducts(meatProducts4);

                                /**
                                 * Добавления в витрину и проверка товаров
                                 */
                                service.showCase("MILKA");
                                service.showCase("NUR");
                                service.showCase("TOIBOSS");
                                System.out.println("Продукты добавлены в витрину\n\n");

                                /**
                                 * Удаления просроков и витрина скидок
                                 */
                                service.delete();


                        } catch (MyExeption e) {
                                System.out.println(e.getMessage());
                        }
                }
        }

