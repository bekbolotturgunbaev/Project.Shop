package shop;

import java.time.LocalDate;

public class DairyProducts extends Shop {
    public DairyProducts(String name, String company, LocalDate from,LocalDate before) {
        super(name, company, from, before);
    }

    public DairyProducts() {
    }


    @Override
    public String toString() {
        return "DairyProducts:\n"
                + getName()+"\n"
                + getCompany()+"\n"
                + "from: "+getFrom()+"\n"
                + "before: "+getBefore()+ "\n"
                + "_____________________________" + "\n";
    }
}
