package com.wixpress.soap;

import com.cccc.Country;
import com.cccc.GetCountryRequest;
import com.cccc.GetCountryResponse;
import org.springframework.ws.server.endpoint.annotation.*;

/**
  * Created on 07/12/2016.
  */
@Endpoint
class SbsServer20 {
  private static final String NAMESPACE_URI = "http://www.cccc.com/";

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
  @ResponsePayload
  public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
    GetCountryResponse response = new GetCountryResponse();
    Country country = new Country();
    country.setName("Hungary");
    country.setCapital("Budapest");
    response.setCountry(country);
    return response;
  }
}
