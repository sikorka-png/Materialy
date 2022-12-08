package inne.streamy.rozwiazania.workshops.domain;

import java.util.List;

public class Company {
    private String name;
    private List<User> users;

    public static final class Builder {
        private String name;
        private List<User> users;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder users(List<User> users) {
            this.users = users;
            return this;
        }

        public Company build() {
            Company company = new Company();
            company.setName(name);
            company.setUsers(users);
            return company;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
