package shop;

import java.time.LocalDate;

public class MeatProducts extends Shop {
    public MeatProducts(String name, String company, LocalDate from,LocalDate before) {
        super(name, company, from, before);
    }

    public MeatProducts() {
    }

    @Override
    public String toString() {
        return "MeatProducts:\n"
                + getName()+"\n"
                + getCompany()+"\n"
                + "from: "+getFrom()+"\n"
                + "before: "+getBefore()+ "\n"
                + "_____________________________" + "\n";
    }
}
