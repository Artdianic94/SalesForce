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
}
