package dairy.products;

import shop.DairyProducts;

import java.time.LocalDate;

public class Kefir extends DairyProducts {
    public Kefir() {
    }

    public Kefir(String name, String company, LocalDate from, LocalDate before) {
        super(name, company, from, before);
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
