package Composite;

abstract class Account {
    public abstract float getBalance();

    static class DepositeAccount extends Account {
        private String accountNo;
        private float accountBalance;

        public DepositeAccount(String accountNo, float accountBalance) {

            this.accountNo = accountNo;
            this.accountBalance = accountBalance;
        }

        public float getBalance() {
            return accountBalance;
        }

    }

    static class SavingAccount extends Account {
        private String accountNo;
        private float accountBalance;

        public SavingAccount(String accountNo, float accountBalance) {

            this.accountNo = accountNo;
            this.accountBalance = accountBalance;
        }

        public float getBalance() {
            return accountBalance;
        }
    }
}
