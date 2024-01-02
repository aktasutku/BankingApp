public class Account {
    private String Number, Name, Email, PhoneNumber;
    private double Balance;

    public Account(String number, String name, String email, String phoneNumber, double balance) {
        this.Number = number;
        this.Name = name;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
        this.Balance = balance;
    }

    public void DepositMoney(double depositedMoney){
        this.Balance+=depositedMoney;
        System.out.println("Deposit is Successful, new balance is: "+this.Balance);
    }

    public void withDrawMoney(double withDrawalMoney){
        if(this.Balance - withDrawalMoney < 0){
            System.out.println("Unseccessful withdraw - Current balance is: "+this.Balance);
        }else{
            this.Balance-=withDrawalMoney;
            System.out.println("Success withdraw - Current balance is "+this.Balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
}
