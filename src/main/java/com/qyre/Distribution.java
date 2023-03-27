
package com.qyre;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "distributed_by",
        "genre",
        "aired_from",
        "aired_to"
})
@Generated("jsonschema2pojo")
public class Distribution {

    @JsonProperty("distributed_by")
    private List<String> distributedBy = null;
    @JsonProperty("genre")
    private List<String> genre = null;
    @JsonProperty("aired_from")
    private String airedFrom;
    @JsonProperty("aired_to")
    private String airedTo;

    /**
     * No args constructor for use in serialization
     */
    public Distribution() {
    }

    /**
     * @param distributedBy
     * @param genre
     * @param airedTo
     * @param airedFrom
     */
    public Distribution(List<String> distributedBy, List<String> genre, String airedFrom, String airedTo) {
        super();
        this.distributedBy = distributedBy;
        this.genre = genre;
        this.airedFrom = airedFrom;
        this.airedTo = airedTo;
    }

    @JsonProperty("distributed_by")
    public List<String> getDistributedBy() {
        return distributedBy;
    }

    @JsonProperty("distributed_by")
    public void setDistributedBy(List<String> distributedBy) {
        this.distributedBy = distributedBy;
    }

    @JsonProperty("genre")
    public List<String> getGenre() {
        return genre;
    }

    @JsonProperty("genre")
    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    @JsonProperty("aired_from")
    public String getAiredFrom() {
        return airedFrom;
    }

    @JsonProperty("aired_from")
    public void setAiredFrom(String airedFrom) {
        this.airedFrom = airedFrom;
    }

    @JsonProperty("aired_to")
    public String getAiredTo() {
        return airedTo;
    }

    @JsonProperty("aired_to")
    public void setAiredTo(String airedTo) {
        this.airedTo = airedTo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Distribution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("distributedBy");
        sb.append('=');
        sb.append(((this.distributedBy == null) ? "<null>" : this.distributedBy));
        sb.append(',');
        sb.append("genre");
        sb.append('=');
        sb.append(((this.genre == null) ? "<null>" : this.genre));
        sb.append(',');
        sb.append("airedFrom");
        sb.append('=');
        sb.append(((this.airedFrom == null) ? "<null>" : this.airedFrom));
        sb.append(',');
        sb.append("airedTo");
        sb.append('=');
        sb.append(((this.airedTo == null) ? "<null>" : this.airedTo));
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
        result = ((result * 31) + ((this.genre == null) ? 0 : this.genre.hashCode()));
        result = ((result * 31) + ((this.airedTo == null) ? 0 : this.airedTo.hashCode()));
        result = ((result * 31) + ((this.distributedBy == null) ? 0 : this.distributedBy.hashCode()));
        result = ((result * 31) + ((this.airedFrom == null) ? 0 : this.airedFrom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Distribution) == false) {
            return false;
        }
        Distribution rhs = ((Distribution) other);
        return (((((this.genre == rhs.genre) || ((this.genre != null) && this.genre.equals(rhs.genre))) && ((this.airedTo == rhs.airedTo) || ((this.airedTo != null) && this.airedTo.equals(rhs.airedTo)))) && ((this.distributedBy == rhs.distributedBy) || ((this.distributedBy != null) && this.distributedBy.equals(rhs.distributedBy)))) && ((this.airedFrom == rhs.airedFrom) || ((this.airedFrom != null) && this.airedFrom.equals(rhs.airedFrom))));
    }

}
