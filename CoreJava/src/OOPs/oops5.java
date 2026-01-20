package OOPs;

public class oops5 {
  public static void main(String[] args) {
    Account1 acc = new Account1();
    acc.setBalance(100000);
    System.out.println(acc.getBalance());
  }  
}


class Account1{
    // data/data members
    int balance;

    // function/method
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}