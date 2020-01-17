
package com.alexandreobs.hotfood.model.pojo.cidades;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class LocationSuggestion {

    @SerializedName("country_flag_url")
    private String countryFlagUrl;
    @SerializedName("country_id")
    private Long countryId;
    @SerializedName("country_name")
    private String countryName;
    @SerializedName("discovery_enabled")
    private Long discoveryEnabled;
    @SerializedName("has_go_out_tab")
    private Long hasGoOutTab;
    @SerializedName("has_new_ad_format")
    private Long hasNewAdFormat;
    @Expose
    private Long id;
    @SerializedName("is_state")
    private Long isState;
    @Expose
    private String name;
    @SerializedName("should_experiment_with")
    private Long shouldExperimentWith;
    @SerializedName("state_code")
    private String stateCode;
    @SerializedName("state_id")
    private Long stateId;
    @SerializedName("state_name")
    private String stateName;

    public String getCountryFlagUrl() {
        return countryFlagUrl;
    }

    public void setCountryFlagUrl(String countryFlagUrl) {
        this.countryFlagUrl = countryFlagUrl;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Long getDiscoveryEnabled() {
        return discoveryEnabled;
    }

    public void setDiscoveryEnabled(Long discoveryEnabled) {
        this.discoveryEnabled = discoveryEnabled;
    }

    public Long getHasGoOutTab() {
        return hasGoOutTab;
    }

    public void setHasGoOutTab(Long hasGoOutTab) {
        this.hasGoOutTab = hasGoOutTab;
    }

    public Long getHasNewAdFormat() {
        return hasNewAdFormat;
    }

    public void setHasNewAdFormat(Long hasNewAdFormat) {
        this.hasNewAdFormat = hasNewAdFormat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIsState() {
        return isState;
    }

    public void setIsState(Long isState) {
        this.isState = isState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getShouldExperimentWith() {
        return shouldExperimentWith;
    }

    public void setShouldExperimentWith(Long shouldExperimentWith) {
        this.shouldExperimentWith = shouldExperimentWith;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

}
