class Account {
    private int acc_no;
    private double acc_balance;

    public Account(int num) {
        acc_balance = 0.0;
        acc_no = num;
    }

    public void withdraw(double amt) {
        if (amt > 0) {
            if (amt <= acc_balance) {
                acc_balance -= amt;
                System.out.println(amt + " amount has been withdrawn from your account");
            } else {
                System.out.println("You dont have Sufficient Balance to withdraw this amount");
            }
        } else {
            System.err.println("Cannot withdraw negative amount.");
        }
    }

    public void deposit(double amt) {
        if (amt > 0) {
            acc_balance = acc_balance + amt;
            System.out.println(amt + " amount has been deposited in your account");
        } else {
            System.err.println("Cannot deposit negative amount.");
        }
    }

    public double getBalance() {
        return acc_balance;
    }

    public int getAccountNumber() {
        return acc_no;
    }

    public void print() {
        System.out.println("Account Number= " + acc_no + ", " + "balance = " + acc_balance);
    }
}

class SavingAccount extends Account {
    private double interest;

    public SavingAccount(int acc_no, double interest) {
        super(acc_no);
        this.interest = interest;
    }

    public double getInterset() {
        return getBalance() + getBalance() * interest;
    }

    public void AddInterest(double interest) {
        super.deposit(super.getBalance() * interest);
    }

    public void print() {
        System.out.println("Account Number= " + super.getAccountNumber() + ", " + "balance = " + super.getBalance()
                + ", " + " Interest = " + interest);
    }
}

class CurrentAccount extends Account {
    private double limit;

    public CurrentAccount(int acc_no, double limit) {
        super(acc_no);
        this.limit = limit;
    }

    public double getLimit() {
        return this.limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void withdraw(double limit) {
        if (limit <= this.limit)
            super.withdraw(limit);
        else {
            System.out.println("Sorry, Limit Exceeded");
        }
    }

    public void print() {
        System.out.println("Account Number= " + super.getAccountNumber() + ", " + "balance = " + super.getBalance()
                + ", " + " Limit = " + limit);
    }
}

class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];
        accounts[0] = new SavingAccount(131288, 2);
        accounts[1] = new CurrentAccount(279453, 1000);
        accounts[0].deposit(8000);
        accounts[1].deposit(4000);
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] instanceof SavingAccount) {
                SavingAccount account = (SavingAccount) accounts[i];
                account.print();
            } else {
                CurrentAccount account = (CurrentAccount) accounts[i];
                account.print();
            }
        }
    }
}