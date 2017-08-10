package com.smnirjhor.facilities.transportation.transportationDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nahid on 8/10/17.
 */
@RestController
@RequestMapping("/ru/facilities")
public class TransportationDetailsController {
    @Autowired
    TransportationDetailsService transportationDetailsService;


    

}
