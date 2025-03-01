package java8features.stream;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transactionlist
{
  private String date;
  private int amount;

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }
    public Transactionlist(String date,int amount)
    {
        this.date=date;
        this.amount=amount;
    }

    @Override
    public String toString() {
        return "Transactionlist{" +
                "date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        List<Transactionlist> transactions = Arrays.asList(
                new Transactionlist("2022-01-01", 100),
                new Transactionlist("2022-01-01", 200),
                new Transactionlist("2022-01-02", 300),
                new Transactionlist("2022-01-02", 400),
                new Transactionlist("2022-01-03", 500),
                new Transactionlist("2022-01-03", 100),
                new Transactionlist("2022-01-04", 200),
                new Transactionlist("2022-01-04", 300),
                new Transactionlist("2022-01-05", 400),
                new Transactionlist("2022-01-05", 500));
       // Map<String, Integer> sumByDay1 = transactions.stream()
              //  .collect(Collectors.groupingBy(Transactionlist::getDate,
                      //  Collectors.summingInt(Transactionlist::getAmount)));
       // System.out.println(sumByDay1);
               Map<String ,Integer> sumbydY2= transactions.stream()
                .collect(Collectors.groupingBy
                (Transactionlist::getDate,Collectors.summingInt(Transactionlist::getAmount)));













    }


}





