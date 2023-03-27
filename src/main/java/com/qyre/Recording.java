
package com.qyre;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "countries",
        "cities",
        "primary_location",
        "additional_locations"
})
@Generated("jsonschema2pojo")
public class Recording {

    @JsonProperty("countries")
    private List<String> countries = null;
    @JsonProperty("cities")
    private List<String> cities = null;
    @JsonProperty("primary_location")
    private String primaryLocation;
    @JsonProperty("additional_locations")
    private List<String> additionalLocations = null;

    /**
     * No args constructor for use in serialization
     */
    public Recording() {
    }

    /**
     * @param cities
     * @param primaryLocation
     * @param countries
     * @param additionalLocations
     */
    public Recording(List<String> countries, List<String> cities, String primaryLocation, List<String> additionalLocations) {
        super();
        this.countries = countries;
        this.cities = cities;
        this.primaryLocation = primaryLocation;
        this.additionalLocations = additionalLocations;
    }

    @JsonProperty("countries")
    public List<String> getCountries() {
        return countries;
    }

    @JsonProperty("countries")
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    @JsonProperty("cities")
    public List<String> getCities() {
        return cities;
    }

    @JsonProperty("cities")
    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @JsonProperty("primary_location")
    public String getPrimaryLocation() {
        return primaryLocation;
    }

    @JsonProperty("primary_location")
    public void setPrimaryLocation(String primaryLocation) {
        this.primaryLocation = primaryLocation;
    }

    @JsonProperty("additional_locations")
    public List<String> getAdditionalLocations() {
        return additionalLocations;
    }

    @JsonProperty("additional_locations")
    public void setAdditionalLocations(List<String> additionalLocations) {
        this.additionalLocations = additionalLocations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Recording.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("countries");
        sb.append('=');
        sb.append(((this.countries == null) ? "<null>" : this.countries));
        sb.append(',');
        sb.append("cities");
        sb.append('=');
        sb.append(((this.cities == null) ? "<null>" : this.cities));
        sb.append(',');
        sb.append("primaryLocation");
        sb.append('=');
        sb.append(((this.primaryLocation == null) ? "<null>" : this.primaryLocation));
        sb.append(',');
        sb.append("additionalLocations");
        sb.append('=');
        sb.append(((this.additionalLocations == null) ? "<null>" : this.additionalLocations));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.countries == null) ? 0 : this.countries.hashCode()));
        result = ((result * 31) + ((this.additionalLocations == null) ? 0 : this.additionalLocations.hashCode()));
        result = ((result * 31) + ((this.cities == null) ? 0 : this.cities.hashCode()));
        result = ((result * 31) + ((this.primaryLocation == null) ? 0 : this.primaryLocation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Recording) == false) {
            return false;
        }
        Recording rhs = ((Recording) other);
        return (((((this.countries == rhs.countries) || ((this.countries != null) && this.countries.equals(rhs.countries))) && ((this.additionalLocations == rhs.additionalLocations) || ((this.additionalLocations != null) && this.additionalLocations.equals(rhs.additionalLocations)))) && ((this.cities == rhs.cities) || ((this.cities != null) && this.cities.equals(rhs.cities)))) && ((this.primaryLocation == rhs.primaryLocation) || ((this.primaryLocation != null) && this.primaryLocation.equals(rhs.primaryLocation))));
    }

}
