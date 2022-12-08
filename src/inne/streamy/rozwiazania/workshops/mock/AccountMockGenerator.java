package inne.streamy.rozwiazania.workshops.mock;

import inne.streamy.rozwiazania.workshops.domain.Account;
import inne.streamy.rozwiazania.workshops.domain.AccountType;
import inne.streamy.rozwiazania.workshops.domain.Currency;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class AccountMockGenerator implements IGenerator {

    public List<Account> generate() {
        return Arrays.asList(
                new Account //1
                        .Builder()
                        .number("6754")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("10.50"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //2
                        .Builder()
                        .number("1178")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("999.50"))
                        .currency(Currency.USD)
                        .build(),
                new Account //3
                        .Builder()
                        .number("8967")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("1000"))
                        .currency(Currency.EUR)
                        .build(),
                new Account //4
                        .Builder()
                        .number("112221")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("1667.22"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //5
                        .Builder()
                        .number("1234")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("1888822.1"))
                        .currency(Currency.EUR)
                        .build(),
                new Account //6
                        .Builder()
                        .number("2346")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("8236626.12"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //7
                        .Builder()
                        .number("7676")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("1230.00"))
                        .currency(Currency.EUR)
                        .build(),
                new Account //8
                        .Builder()
                        .number("0192")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("88890.00"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //9
                        .Builder()
                        .number("8474")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("10000.60"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //10
                        .Builder()
                        .number("3892")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("70998.8"))
                        .currency(Currency.EUR)
                        .build(),
                new Account //11
                        .Builder()
                        .number("65423")
                        .type(AccountType.ROR1)
                        .amount(new BigDecimal("800.99"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //12
                        .Builder()
                        .number("87631")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("100"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //13
                        .Builder()
                        .number("1235478")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("1"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //14
                        .Builder()
                        .number("72446")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("0.01"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //15
                        .Builder()
                        .number("90753")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("0"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //16
                        .Builder()
                        .number("865423")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("0"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //16
                        .Builder()
                        .number("9612541")
                        .type(AccountType.LO2)
                        .amount(new BigDecimal("23500.86"))
                        .currency(Currency.USD)
                        .build(),
                new Account //17
                        .Builder()
                        .number("971561")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("9999"))
                        .currency(Currency.USD)
                        .build(),
                new Account //18
                        .Builder()
                        .number("97156221")
                        .type(AccountType.LO2)
                        .amount(new BigDecimal("10.00"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //19
                        .Builder()
                        .number("867151")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("109823.00"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //20
                        .Builder()
                        .number("862252")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("123771"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //21
                        .Builder()
                        .number("872562")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("1234"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //22
                        .Builder()
                        .number("86252")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("7332"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //23
                        .Builder()
                        .number("34563")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("2346"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //24
                        .Builder()
                        .number("1122")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("100"))
                        .currency(Currency.USD)
                        .build(),
                new Account //25
                        .Builder()
                        .number("62222")
                        .type(AccountType.RO1)
                        .amount(new BigDecimal("1009"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //24
                        .Builder()
                        .number("73344")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("0"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //26
                        .Builder()
                        .number("8723212")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("2435"))
                        .currency(Currency.USD)
                        .build(),
                new Account //27
                        .Builder()
                        .number("3457117")
                        .type(AccountType.RO2)
                        .amount(new BigDecimal("10000984"))
                        .currency(Currency.PLN)
                        .build(),
                new Account //28
                        .Builder()
                        .number("45218")
                        .type(AccountType.ROR2)
                        .amount(new BigDecimal("108987.0"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //29
                        .Builder()
                        .number("24578")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("13873"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //30
                        .Builder()
                        .number("0000064")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("9766"))
                        .currency(Currency.USD)
                        .build(),
                new Account //31
                        .Builder()
                        .number("2322255")
                        .type(AccountType.ROR2)
                        .amount(new BigDecimal("1000"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //32
                        .Builder()
                        .number("666622")
                        .type(AccountType.ROR2)
                        .amount(new BigDecimal("287"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //33
                        .Builder()
                        .number("998292")
                        .type(AccountType.ROR2)
                        .amount(new BigDecimal("1467"))
                        .currency(Currency.CHF)
                        .build(),
                new Account //34
                        .Builder()
                        .number("938383")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("1600"))
                        .currency(Currency.EUR)
                        .build(),
                new Account //35
                        .Builder()
                        .number("2018543")
                        .type(AccountType.LO1)
                        .amount(new BigDecimal("23000.86"))
                        .currency(Currency.PLN)
                        .build()
        );
    }
}
