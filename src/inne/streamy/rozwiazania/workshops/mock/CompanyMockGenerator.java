package inne.streamy.rozwiazania.workshops.mock;



import inne.streamy.rozwiazania.workshops.domain.Company;
import inne.streamy.rozwiazania.workshops.domain.User;

import java.util.Arrays;
import java.util.List;

public class CompanyMockGenerator implements IGenerator {

    public List<Company> generate() {
        final UserMockGenerator userMockGenerator = new UserMockGenerator();
        final List<User> users = userMockGenerator.generate();

        return Arrays.asList(
                new Company //1
                        .Builder()
                        .name("Fanta")
                        .users(
                                Arrays.asList(
                                        users.get(0),
                                        users.get(1),
                                        users.get(2)
                                )
                        )
                        .build(),
                new Company //2
                        .Builder()
                        .name("Sprite")
                        .users(
                                Arrays.asList(
                                        users.get(3),
                                        users.get(4)
                                )
                        )
                        .build(),
                new Company //3
                        .Builder()
                        .name("Nescafe")
                        .users(
                                Arrays.asList(
                                        users.get(5),
                                        users.get(6),
                                        users.get(7),
                                        users.get(8)
                                )
                        )
                        .build(),
                new Company //4
                        .Builder()
                        .name("Gerber")
                        .users(
                                Arrays.asList(
                                        users.get(9),
                                        users.get(10),
                                        users.get(11)
                                )
                        )
                        .build(),
                new Company //5
                        .Builder()
                        .name("Nestea")
                        .users(
                                Arrays.asList(
                                        users.get(12)
                                )
                        )
                        .build(),
                new Company //6
                        .Builder()
                        .name("Lays")
                        .users(
                                Arrays.asList(
                                        users.get(13),
                                        users.get(14)
                                )
                        )
                        .build(),
                new Company //7
                        .Builder()
                        .name("Pepsi")
                        .users(
                                Arrays.asList(
                                        users.get(15),
                                        users.get(16),
                                        users.get(17)
                                )
                        )
                        .build(),
                new Company //8
                        .Builder()
                        .name("Mirinda")
                        .users(
                                Arrays.asList(
                                        users.get(18),
                                        users.get(19)
                                )
                        )
                        .build()
        );
    }
}
