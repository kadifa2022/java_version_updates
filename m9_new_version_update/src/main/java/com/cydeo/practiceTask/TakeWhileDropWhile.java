package com.cydeo.practiceTask;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileDropWhile {

    public static void main(String[] args) {

        List<Stock> stocks= getStocks();
        System.out.println("Stock sorted  \n" + stocks);

    }




    private static List<Stock> getStocks(){

        List<Stock> stocks= new ArrayList<>();

        stocks.add(new Stock("Apple", BigDecimal.valueOf(1000)));
        stocks.add(new Stock("Amazon", BigDecimal.valueOf(600)));
        stocks.add(new Stock("Tesla", BigDecimal.valueOf(300)));
        stocks.add(new Stock("Netflix", BigDecimal.valueOf(400)));
        stocks.add(new Stock("Facebook", BigDecimal.valueOf(500)));
        stocks.add(new Stock("Instagram", BigDecimal.valueOf(700)));


        return stocks.stream()
                .sorted(Comparator.comparing(Stock::getValue))
                .collect(Collectors.toList());




    }
}
