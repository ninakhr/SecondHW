package com.company;

public class Franchise {
    Person entrepreneur;
    protected String name;
    int rank;
    double initialInvestment;

    public Franchise() {
    }

    public Franchise(Person entrepreneurOfFranchise, String franchiseName, int franchise500Rank, double initialInvestment) {
        this.entrepreneur = entrepreneurOfFranchise;
        this.name = franchiseName;
        this.rank = franchise500Rank;
        this.initialInvestment = initialInvestment;
    }

    public void FranchiseInfo() {
        System.out.println("Franchise name is " + this.name);
        System.out.println("The entrepreneur is " + this.entrepreneur.name);
        System.out.println("Position in 500rank is " + this.rank);
        System.out.println("Average initial investment of " + this.name + " is " + this.initialInvestment);
    }
}
