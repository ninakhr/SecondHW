package com.company;

public class FranchiseExchange {
    void change(Franchise franchise1, Franchise franchise2) {
        Person temp;
        temp = franchise1.entrepreneur;
        franchise1.entrepreneur = franchise2.entrepreneur;
        franchise2.entrepreneur = temp;
    }

}
