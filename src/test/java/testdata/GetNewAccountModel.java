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
                .employees(GenerateFakeMessage.getEmployees())
                .annualRevenue(GenerateFakeMessage.getAnnualRevenue())
                .description(GenerateFakeMessage.getDescription())
                .billingStreet(GenerateFakeMessage.getStreet())
                .shippingStreet(GenerateFakeMessage.getStreet())
                .billingCity(GenerateFakeMessage.getCity())
                .billingState(GenerateFakeMessage.getCountry())
                .shippingCity(GenerateFakeMessage.getCity())
                .shippingState(GenerateFakeMessage.getCountry())
                .billingZipCode(GenerateFakeMessage.getZipCode())
                .billingCountry(GenerateFakeMessage.getCountry())
                .shippingZipCode(GenerateFakeMessage.getZipCode())
                .shippingCountry(GenerateFakeMessage.getCountry())
                .build();
    }
}
