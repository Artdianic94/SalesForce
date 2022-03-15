package utilities;

import com.github.javafaker.Faker;

public class GenerateFakeMessage {
    public static String getAccountName() {
        Faker faker = new Faker();
        return faker.beer().name();
    }

    public static String getPhone() {
        Faker faker = new Faker();
        return faker.phoneNumber().phoneNumber();
    }

    public static String getWebsite() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String getZipCode() {
        Faker faker = new Faker();
        return faker.address().zipCode();
    }

    public static String getCountry() {
        Faker faker = new Faker();
        return faker.country().countryCode2();
    }

    public static String getEmployees() {
        Faker faker = new Faker();
        return String.valueOf(faker.number().numberBetween(1000, 5000));
    }

    public static String getAnnualRevenue() {
        Faker faker = new Faker();
        return String.valueOf(faker.number().numberBetween(500000, 1000000));
    }

    public static String getDescription() {
        Faker faker = new Faker();
        return faker.company().industry();
    }

    public static String getStreet() {
        Faker faker = new Faker();
        return faker.address().streetAddress();
    }

    public static String getCity() {
        Faker faker = new Faker();
        return faker.address().city();
    }
}
