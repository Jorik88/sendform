package com.example.sendform;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestArraySort {

    @Test
    public void testArraySort() {
        int[] array = {0, 7, 0, 8, 4, 0, 0, 1, 0, 1};
        for (int i = 0; i <= array.length-1; i++) {
            if(array[i] == 0 ) {
              for (int l = i + 1; l <= array.length -1; l++) {
                  if (array[l] != 0 ) {
                      int number = array[i];
                      array[i] = array[l];
                      array[l] = 0;
                      break;
                  }
              }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void m() {
        int[] array = {0, 7, 0, 8, 4, 0, 0, 1, 0, 1};
        int zeroNumber = 0;
        for (int i = 0; i <= array.length-1; i++) {
            if(array[i] == 0) {
               zeroNumber = i;
            }else {
                int number = array[i];
                array[i] = 0;
                array[zeroNumber] = number;
                zeroNumber = number;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void testBooleanResult() {
        boolean status = true;
        if (!status || status) {
            System.out.println("not");
        }
    }


    @Test
    public void testMap() {
        String map = "{countryId=UA, countryOfBirth=UA, dateOfBirth=1988-02-03, documentWithoutExpiration=true, firstName=JOHN, gender=MALE, lastName=SNOW, middleName=SNOWOVICH," +
                " passportAuthority=king, passportId=KM234242, passportIssueDate=1993-02-17, passportType=NATIONAL, phoneCode=83574833, phone=+380970704271, placeOfBirth=Winterfell," +
                " registrationAddress1=Odessa Filatova 22 1, registrationApartment=1, registrationCity=Odessa, registrationCountryCode=UA, registrationHouse=22, registrationPostalCode=342," +
                " registrationRegion=Odessa, registrationStreet=Filatova, residenceAddress1=Odessa Filatova 22 1, residenceApartment=1, residenceCity=Odessa, residenceCountryCode=UA," +
                " residenceHouse=22, residencePostalCode=342, residenceRegion=Odessa, residenceRegistrationSame=true, residenceStreet=Filatova}";


        Map<String ,String>  metadata = new LinkedHashMap<>();
        metadata.put("countryId", "UA");
        metadata.put("countryOfBirth", "UA");
//        metadata.put("dateOfBirth", "1988-03-18");
        metadata.put("documentWithoutExpiration", "true");
        metadata.put("firstName", "JORA");
        metadata.put("gender", "MALE");
        metadata.put("lastName", "SNOW");
        metadata.put("middleName", "SNOWOVICH");
        metadata.put("passportAuthority", "cfxttgxt");
        metadata.put("passportId", "KM534555");
//        metadata.put("passportIssueDate", "1998-03-13");
        metadata.put("passportType", "NATIONAL");
        metadata.put("phoneCode", "02110213");
        metadata.put("phone", "+380970704271");
        metadata.put("placeOfBirth", "Kiev");
        metadata.put("registrationAddress1", "Odessa Filatova 3 33");
        metadata.put("registrationApartment", "33");
        metadata.put("registrationCity", "Odessa");
        metadata.put("registrationCountryCode", "UA");
        metadata.put("registrationHouse", "3");
        metadata.put("registrationPostalCode", "3243");
        metadata.put("registrationRegion", "Odessa");
        metadata.put("registrationStreet", "Filatova");
        metadata.put("residenceAddress1", "Odessa Filatova 3 33");
        metadata.put("residenceRegistrationSame", "true");
        metadata.put("residenceApartment", "1");
        metadata.put("residenceCity", "Odessa");
        metadata.put("residenceCountryCode", "UA");
        metadata.put("residenceHouse", "22");
        metadata.put("residencePostalCode", "342");
        metadata.put("residenceRegion", "Odessa");
        metadata.put("residenceStreet", "Filatova");
        System.out.println(metadata);

    }
}
