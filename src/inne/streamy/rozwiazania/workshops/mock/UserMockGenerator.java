package inne.streamy.rozwiazania.workshops.mock;

import inne.streamy.rozwiazania.workshops.domain.Account;
import inne.streamy.rozwiazania.workshops.domain.Permit;
import inne.streamy.rozwiazania.workshops.domain.Sex;
import inne.streamy.rozwiazania.workshops.domain.User;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UserMockGenerator implements IGenerator {
    private AccountMockGenerator accountMockGenerator = new AccountMockGenerator();

    public List<User> generate() {
        final List<Account> accounts = accountMockGenerator.generate();
        final List<User> result = new LinkedList<>();

        result.add( //1
                new User.Builder()
                        .firstName("Adam")
                        .lastName("Wojcik")
                        .age(17)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(0), accounts.get(1))
                        )
                        .build()
        );

        result.add( //2
                new User.Builder()
                        .firstName("Mateusz")
                        .lastName("Kowalski")
                        .age(33)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(2))
                        )
                        .build()
        );

        result.add( //3
                new User.Builder()
                        .firstName("Bartek")
                        .lastName("Pasibrzuch")
                        .age(18)
                        .sex(Sex.OTHER)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(3))
                        )
                        .build()
        );

        result.add( // 4
                new User.Builder()
                        .firstName("Jan")
                        .lastName("Bazuka")
                        .age(46)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(4), accounts.get(5), accounts.get(6))
                        )
                        .build()
        );

        result.add( // 5
                new User.Builder()
                        .firstName("Zosia")
                        .lastName("Psikuta")
                        .age(67)
                        .sex(Sex.WOMAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(7), accounts.get(8), accounts.get(9))
                        )
                        .build()
        );

        result.add( // 6
                new User.Builder()
                        .firstName("Magdalena")
                        .lastName("Warszawska")
                        .age(33)
                        .sex(Sex.WOMAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(10), accounts.get(11))
                        )
                        .build()
        );

        result.add( // 7
                new User.Builder()
                        .firstName("Amadeusz")
                        .lastName("Mocarz")
                        .age(29)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(12))
                        )
                        .build()
        );

        result.add( // 8
                new User.Builder()
                        .firstName("Filip")
                        .lastName("Flirciczart")
                        .age(33)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(13))
                        )
                        .build()
        );

        result.add( // 9
                new User.Builder()
                        .firstName("Zenon")
                        .lastName("Kucowski")
                        .age(21)
                        .sex(Sex.OTHER)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList()
                        )
                        .build()
        );

        result.add( // 10
                new User.Builder()
                        .firstName("Zenek")
                        .lastName("Biednapalka")
                        .age(18)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList()
                        )
                        .accounts(
                                Arrays.asList()
                        )
                        .build()
        );

        result.add( // 11
                new User.Builder()
                        .firstName("Mariusz")
                        .lastName("Dreh")
                        .age(50)
                        .sex(Sex.OTHER)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(14))
                        )
                        .build()
        );

        result.add( // 12
                new User.Builder()
                        .firstName("Marcin")
                        .lastName("Marcinowicz")
                        .age(37)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(
                                        accounts.get(15),
                                        accounts.get(16),
                                        accounts.get(17),
                                        accounts.get(18),
                                        accounts.get(19),
                                        accounts.get(20),
                                        accounts.get(21)
                                )
                        )
                        .build()
        );

        result.add( //13
                new User.Builder()
                        .firstName("Jan")
                        .lastName("Nowicki")
                        .age(45)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(22))
                        )
                        .build()
        );

        result.add( // 14
                new User.Builder()
                        .firstName("Kasia")
                        .lastName("Nawalka")
                        .age(29)
                        .sex(Sex.WOMAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(23), accounts.get(24))
                        )
                        .build()
        );

        result.add( //15
                new User.Builder()
                        .firstName("Martin")
                        .lastName("Prawicowy")
                        .age(29)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(25), accounts.get(26))
                        )
                        .build()
        );

        result.add( // 16
                new User.Builder()
                        .firstName("Karol")
                        .lastName("Romanowicz")
                        .age(64)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.LOAN)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(27), accounts.get(28))
                        )
                        .build()
        );

        result.add( // 17
                new User.Builder()
                        .firstName("Marta")
                        .lastName("Wialkibuz")
                        .age(33)
                        .sex(Sex.WOMAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(29))
                        )
                        .build()
        );

        result.add( // 18
                new User.Builder()
                        .firstName("Patryk")
                        .lastName("Piwny")
                        .age(28)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(30))
                        )
                        .build()
        );

        result.add( //19
                new User.Builder()
                        .firstName("Zenek")
                        .lastName("Jawowy")
                        .age(22)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList()
                        )
                        .accounts(
                                Arrays.asList(accounts.get(31))
                        )
                        .build()
        );

        result.add( //20
                new User.Builder()
                        .firstName("Alfred")
                        .lastName("Pasibrzuch")
                        .age(40)
                        .sex(Sex.MAN)
                        .permits(
                                Arrays.asList(Permit.DEPOSIT, Permit.TRANSFER, Permit.LOAN, Permit.ORDER_HISTORY)
                        )
                        .accounts(
                                Arrays.asList(accounts.get(32), accounts.get(33), accounts.get(34))
                        )
                        .build()
        );

        return result;
    }
}
