
package com.qyre;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "title",
        "season",
        "role_group_id",
        "producer",
        "country",
        "company",
        "director",
        "start_date",
        "end_date",
        "recording",
        "distribution",
        "tags",
        "image"
})
@Generated("jsonschema2pojo")
public class Production {

    @JsonProperty("title")
    private Title title;
    @JsonProperty("season")
    private String season;
    @JsonProperty("role_group_id")
    private String roleGroupId;
    @JsonProperty("producer")
    private List<String> producer = null;
    @JsonProperty("country")
    private String country;
    @JsonProperty("company")
    private String company;
    @JsonProperty("director")
    private List<String> director = null;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("recording")
    private Recording recording;
    @JsonProperty("distribution")
    private Distribution distribution;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("image")
    private String image;

    /**
     * No args constructor for use in serialization
     */
    public Production() {
    }

    /**
     * @param country
     * @param image
     * @param endDate
     * @param director
     * @param recording
     * @param title
     * @param distribution
     * @param tags
     * @param season
     * @param producer
     * @param company
     * @param startDate
     * @param roleGroupId
     */
    public Production(Title title, String season, String roleGroupId, List<String> producer, String country, String company, List<String> director, String startDate, String endDate, Recording recording, Distribution distribution, List<String> tags, String image) {
        super();
        this.title = title;
        this.season = season;
        this.roleGroupId = roleGroupId;
        this.producer = producer;
        this.country = country;
        this.company = company;
        this.director = director;
        this.startDate = startDate;
        this.endDate = endDate;
        this.recording = recording;
        this.distribution = distribution;
        this.tags = tags;
        this.image = image;
    }

    @JsonProperty("title")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Title title) {
        this.title = title;
    }

    @JsonProperty("season")
    public String getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(String season) {
        this.season = season;
    }

    @JsonProperty("role_group_id")
    public String getRoleGroupId() {
        return roleGroupId;
    }

    @JsonProperty("role_group_id")
    public void setRoleGroupId(String roleGroupId) {
        this.roleGroupId = roleGroupId;
    }

    @JsonProperty("producer")
    public List<String> getProducer() {
        return producer;
    }

    @JsonProperty("producer")
    public void setProducer(List<String> producer) {
        this.producer = producer;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    @JsonProperty("director")
    public List<String> getDirector() {
        return director;
    }

    @JsonProperty("director")
    public void setDirector(List<String> director) {
        this.director = director;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("recording")
    public Recording getRecording() {
        return recording;
    }

    @JsonProperty("recording")
    public void setRecording(Recording recording) {
        this.recording = recording;
    }

    @JsonProperty("distribution")
    public Distribution getDistribution() {
        return distribution;
    }

    @JsonProperty("distribution")
    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Production.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null) ? "<null>" : this.title));
        sb.append(',');
        sb.append("season");
        sb.append('=');
        sb.append(((this.season == null) ? "<null>" : this.season));
        sb.append(',');
        sb.append("roleGroupId");
        sb.append('=');
        sb.append(((this.roleGroupId == null) ? "<null>" : this.roleGroupId));
        sb.append(',');
        sb.append("producer");
        sb.append('=');
        sb.append(((this.producer == null) ? "<null>" : this.producer));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null) ? "<null>" : this.country));
        sb.append(',');
        sb.append("company");
        sb.append('=');
        sb.append(((this.company == null) ? "<null>" : this.company));
        sb.append(',');
        sb.append("director");
        sb.append('=');
        sb.append(((this.director == null) ? "<null>" : this.director));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null) ? "<null>" : this.startDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null) ? "<null>" : this.endDate));
        sb.append(',');
        sb.append("recording");
        sb.append('=');
        sb.append(((this.recording == null) ? "<null>" : this.recording));
        sb.append(',');
        sb.append("distribution");
        sb.append('=');
        sb.append(((this.distribution == null) ? "<null>" : this.distribution));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null) ? "<null>" : this.tags));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null) ? "<null>" : this.image));
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
        result = ((result * 31) + ((this.country == null) ? 0 : this.country.hashCode()));
        result = ((result * 31) + ((this.image == null) ? 0 : this.image.hashCode()));
        result = ((result * 31) + ((this.endDate == null) ? 0 : this.endDate.hashCode()));
        result = ((result * 31) + ((this.director == null) ? 0 : this.director.hashCode()));
        result = ((result * 31) + ((this.recording == null) ? 0 : this.recording.hashCode()));
        result = ((result * 31) + ((this.title == null) ? 0 : this.title.hashCode()));
        result = ((result * 31) + ((this.distribution == null) ? 0 : this.distribution.hashCode()));
        result = ((result * 31) + ((this.tags == null) ? 0 : this.tags.hashCode()));
        result = ((result * 31) + ((this.season == null) ? 0 : this.season.hashCode()));
        result = ((result * 31) + ((this.producer == null) ? 0 : this.producer.hashCode()));
        result = ((result * 31) + ((this.company == null) ? 0 : this.company.hashCode()));
        result = ((result * 31) + ((this.startDate == null) ? 0 : this.startDate.hashCode()));
        result = ((result * 31) + ((this.roleGroupId == null) ? 0 : this.roleGroupId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Production) == false) {
            return false;
        }
        Production rhs = ((Production) other);
        return ((((((((((((((this.country == rhs.country) || ((this.country != null) && this.country.equals(rhs.country))) && ((this.image == rhs.image) || ((this.image != null) && this.image.equals(rhs.image)))) && ((this.endDate == rhs.endDate) || ((this.endDate != null) && this.endDate.equals(rhs.endDate)))) && ((this.director == rhs.director) || ((this.director != null) && this.director.equals(rhs.director)))) && ((this.recording == rhs.recording) || ((this.recording != null) && this.recording.equals(rhs.recording)))) && ((this.title == rhs.title) || ((this.title != null) && this.title.equals(rhs.title)))) && ((this.distribution == rhs.distribution) || ((this.distribution != null) && this.distribution.equals(rhs.distribution)))) && ((this.tags == rhs.tags) || ((this.tags != null) && this.tags.equals(rhs.tags)))) && ((this.season == rhs.season) || ((this.season != null) && this.season.equals(rhs.season)))) && ((this.producer == rhs.producer) || ((this.producer != null) && this.producer.equals(rhs.producer)))) && ((this.company == rhs.company) || ((this.company != null) && this.company.equals(rhs.company)))) && ((this.startDate == rhs.startDate) || ((this.startDate != null) && this.startDate.equals(rhs.startDate)))) && ((this.roleGroupId == rhs.roleGroupId) || ((this.roleGroupId != null) && this.roleGroupId.equals(rhs.roleGroupId))));
    }

}
