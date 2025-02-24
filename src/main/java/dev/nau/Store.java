package dev.nau;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private Long id;
    private String name;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    public Store(Long id, String name, String owner, String taxId) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
    }

    public boolean addComputer(Computer computer) {
        if (computers.stream().anyMatch(c -> c.getBrand().equals(computer.getBrand()))) {
            return false;
        }
        return computers.add(computer);
    }

    public List<Computer> listComputers() {
        return new ArrayList<>(computers);
    }
}
