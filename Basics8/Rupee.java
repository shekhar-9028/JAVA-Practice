package src.Basics8;
import java.util.Comparator;

class SortbyAmountAsse implements Comparator<Rupee>{

    @Override
    public int compare(Rupee o1, Rupee o2) {
        return Integer.compare(o1.getAmount(),o2.getAmount());
    }
}

class SortbyAmountDesc implements Comparator<Rupee>{

    @Override
    public int compare(Rupee o1, Rupee o2) {
        return Integer.compare(o2.getAmount(),o1.getAmount());
    }
}

class SortbyValueAss implements Comparator<Rupee>{

    @Override
    public int compare(Rupee o1, Rupee o2) {
        return o1.getAmountvalue().compareTo(o2.getAmountvalue());
    }
}

class SortbyValueDesc implements Comparator<Rupee>{

    @Override
    public int compare(Rupee o1, Rupee o2) {
        return o2.getAmountvalue().compareTo(o1.getAmountvalue());
    }
}

public class Rupee implements Comparable<Rupee> {

    public Integer getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Rupee{" +
                "amount=" + amount +
                ", amountvalue='" + amountvalue + '\'' +
                '}';
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getAmountvalue() {
        return amountvalue;
    }

    public void setAmountvalue(String amountvalue) {
        this.amountvalue = amountvalue;
    }

    Integer amount;

    public Rupee(String amountvalue, Integer amount) {
        this.amount = amount;
        this.amountvalue = amountvalue;
    }

    String amountvalue;

    //@Override
    //public int compareTo(Rupee o) {
     //   return Integer.compare(this.amount, o.amount);
   // }

    @Override
    public int compareTo(Rupee o) {
        return CharSequence.compare(this.amountvalue,o.amountvalue);
    }
}
