import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductionModel {
    @JsonProperty("name")
    private String name;

    @JsonProperty("role_group_id")
    private String roleGroupId;

    @JsonProperty("recording_city")
    private String recordingCity;

    @JsonProperty("recording_country")
    private String recordingCountry;

    @JsonProperty("production_company")
    private String productionCompany;

    @JsonProperty("production_country")
    private String productionCountry;

    @JsonProperty("season")
    private String season;

    @JsonProperty("distributed_by")
    private String distributedBy;

    @JsonProperty("start_date")
    private String startDate;

    @JsonProperty("end_date")
    private String endDate;

    @JsonProperty("aired_at")
    private String airedAt;


    public ProductionModel() {
    }


    public ProductionModel(String name, String roleGroupId, String recordingCity,
                           String recordingCountry, String productionCompany,
                           String productionCountry, String season,
                           String distributedBy, String startDate,
                           String endDate, String airedAt) {
        super();
        this.name = name;
        this.roleGroupId = roleGroupId;
        this.recordingCity = recordingCity;
        this.recordingCountry = recordingCountry;
        this.productionCompany = productionCompany;
        this.productionCountry = productionCountry;
        this.season = season;
        this.distributedBy = distributedBy;
        this.startDate = startDate;
        this.endDate = endDate;
        this.airedAt = airedAt;
    }

}