package com.cydeo.practiceTask;

import java.math.BigDecimal;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.cydeo.java9.TakeWhileDropWhile.getStocksBelowFiveHundred;

public class TakeWhileDropWhile {

    public static void main(String[] args) {

        List<Stock> stocks= getStocks();
        System.out.println("Stock sorted  \n" + stocks);

        List<String>stockBelow500Filter= getStocksBelowFiveHundredFilter(stocks);
        System.out.println("Filter output :" + stockBelow500Filter);

        List<String>stockBelow500= getStocksBelowFiveHundred(stocks);
        System.out.println("Filter output: " + stockBelow500);

        List<String>stockAbove500 = getStocksAboveFiveHundred(stocks);
        System.out.println("Filter output : " + stockAbove500);

    }

    public static List<String>getStocksBelowFiveHundredFilter (List<Stock> stocks) {
        return stocks.stream()
                .peek(stock -> System.out.println("Filter processing: " + stock))
                .filter(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());

    }
        public static List<String> getStocksBelowFiveHundred(List<Stock>stocks){
            return stocks.stream()
                    .peek(stock -> System.out.println("TakeWhile Processing:" + stock))
                    .takeWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
                    .map(Stock::getName)
                    .collect(Collectors.toList());
    }

    public static List<String> getStocksAboveFiveHundred(List<Stock>stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("DropWhile Processing: " + stock))
                .dropWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());


    }

    public static boolean isStockLessThanFiveHundred(Stock stock){
        return stock.getValue().compareTo(BigDecimal.valueOf(500))<0;
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
