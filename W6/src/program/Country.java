/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Windows 10
 */
public class Country {
    private final String name;
    private final Continent continent;
    private long numberOfPeople;

    public Country(String name, Continent continent, long numberOfPeople) {
        this.name = name;
        this.continent = continent;
        this.numberOfPeople = numberOfPeople;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getName() {
        return name;
    }

    public Continent getContinent() {
        return continent;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent=" + continent.getName() +
                ", numberOfPeople=" + numberOfPeople +
                '}';
    }
}
