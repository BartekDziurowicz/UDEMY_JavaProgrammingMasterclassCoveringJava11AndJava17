package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        if (findBranch(branchName) != null) {
            return findBranch(branchName).newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        if (findBranch(branchName) != null) {
            return findBranch(branchName).addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(int i=0;i<branches.size();i++){
            if(branches.get(i).getName().equals(branchName))
                return branches.get(i);
        }
        return null;
    }

    public boolean listCustomers (String branchName, boolean printTransactions) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            System.out.println("Customer details for branch " + existingBranch.getName());
            for (int i=0; i<existingBranch.getCustomers().size(); i++) {
                Customer customer = existingBranch.getCustomers().get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    for (int j=0; j<customer.getTransactions().size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + customer.getTransactions().get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
