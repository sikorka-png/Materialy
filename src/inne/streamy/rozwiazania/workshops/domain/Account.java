package inne.streamy.rozwiazania.workshops.domain;

import java.math.BigDecimal;

public class Account {
    private AccountType type;
    private String number;
    private BigDecimal amount;
    private Currency currency;

    public static final class Builder {
        private AccountType type;
        private String number;
        private BigDecimal amount;
        private Currency currency;

        public Builder type(AccountType type) {
            this.type = type;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public Account build() {
            Account account = new Account();
            account.setType(type);
            account.setNumber(number);
            account.setAmount(amount);
            account.setCurrency(currency);
            return account;
        }
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
