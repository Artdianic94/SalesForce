package testdata;

import models.SalesForceAccountModel;
import utilities.GenerateFakeMessage;

public class GetNewAccountModel {
    public static final String accountName = GenerateFakeMessage.getAccountName();

    public static SalesForceAccountModel getAccountWithAllFields() {
        return SalesForceAccountModel.builder()
                .accountName(accountName)
                .phone(GenerateFakeMessage.getPhone())
                .fax(GenerateFakeMessage.getPhone())
                .website(GenerateFakeMessage.getWebsite())
                .type("Analyst")
                .industry("Chemicals")
                .employees("1100")
                .annualRevenue("500000")
                .description("My name is Di")
                .billingStreet("Wall Street")
                .shippingStreet("Victory Street")
                .billingCity("Minsk")
                .billingState(GenerateFakeMessage.getCountry())
                .shippingCity("Mogilev")
                .shippingState(GenerateFakeMessage.getCountry())
                .billingZipCode(GenerateFakeMessage.getZipCode())
                .billingCountry(GenerateFakeMessage.getCountry())
                .shippingZipCode(GenerateFakeMessage.getZipCode())
                .shippingCountry(GenerateFakeMessage.getCountry())
                .build();
    }
}
