package com.company;

public class Main {

    public static void main(String[] args) {
        Person entrepreneur1 = new Person("Kim Yen", 3000000);
        Person entrepreneur2 = new Person("Andry Bims", 29000000);
        Franchise franchise1 = new Franchise(entrepreneur1, "Taco Bell", 4,
                2000000000);
        Franchise franchise2 = new Franchise(entrepreneur1, "Donuts", 12,
                1502000000);

        franchise1.FranchiseInfo();
        franchise2.FranchiseInfo();
        System.out.println(" ");
        System.out.println("Now, let's change");
        System.out.println(" ");

        FranchiseExchange franchiseExchange = new FranchiseExchange();
        franchiseExchange.change(franchise1, franchise2);


        franchise1.FranchiseInfo();
        franchise2.FranchiseInfo();

    }
}
