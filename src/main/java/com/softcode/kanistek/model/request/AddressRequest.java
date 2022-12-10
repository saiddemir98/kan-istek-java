package com.softcode.kanistek.model.request;

import lombok.Data;

@Data
public class AddressRequest {
    private int cityNo;
    private int districtNo;
    private String fullAddress;
    private String zipcode;
}
