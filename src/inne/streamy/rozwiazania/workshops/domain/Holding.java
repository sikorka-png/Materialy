package inne.streamy.rozwiazania.workshops.domain;

import java.util.List;

public class Holding {
    private String name;
    private List<Company> companies;

    public Holding(String name, List<Company> companies) {
        this.name = name;
        this.companies = companies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
