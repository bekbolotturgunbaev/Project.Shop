package shop;

import java.time.LocalDate;

public abstract class Shop {
    private String name;
    private String company;
    private LocalDate from;
    private LocalDate before;

    public Shop() {
    }

    public Shop(String name, String company, LocalDate from, LocalDate before) {
        this.name = name;
        this.company = company;
        this.from = from;
        this.before = before;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public String setCompany(String company) {
        this.company = company;
        return company;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getBefore() {
        return before;
    }

    public void setBefore(LocalDate before) {
        this.before = before;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", from=" + from +
                ", before=" + before +
                '}' ;
    }
}
