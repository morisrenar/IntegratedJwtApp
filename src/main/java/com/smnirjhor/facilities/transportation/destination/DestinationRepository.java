package com.smnirjhor.facilities.transportation.destination;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nahid on 8/9/17.
 */

public interface DestinationRepository extends CrudRepository<Destination, String> {
    public List<Destination> findByFacilitiesFacilitiesId(String facilitiesId);
}
