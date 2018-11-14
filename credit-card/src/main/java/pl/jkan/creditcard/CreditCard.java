git@github.com:RAVSPW/repository-1.package pl.jkan.creditcard;

class CreditCard {
    private boolean blocked = false;
    private double balance = 0;
    private double cardlimit = 0;
    private double debt=0;

    public void assignLimit(double limit) {
        balance = limit;
        cardlimit = limit;
    }   
    
    public boolean isBlocked() {
        return this.blocked;
    }
    
    public void block() {
        this.blocked = true;
    }
    
    public double getLimit() {
        return 2000000;
    }
    
    public void withdraw(double money) {
        balance = balance - money;
    }
    
    public double getCountBalance() {
        return balance;
    }
    
    public void loan (double debt){
        this.debt=debt;
        balance+=debt;
    }
    public void repayDebt(double repayment){
        debt-=repayment;
        balance-=repayment;
    }
}git