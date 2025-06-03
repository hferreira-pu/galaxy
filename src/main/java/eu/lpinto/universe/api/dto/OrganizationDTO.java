package eu.lpinto.universe.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Clinic DTO - Data Transformation Object
 *
 * @author Vítor <code>- vitor.martins@petuniversal.com</code>
 */
public class OrganizationDTO extends AbstractDTO implements Serializable {

    public static final long serialVersionUID = 1L;

    private String country;
    private String clientID; //0
    private String clientSecret; //0
    private Boolean enable;
    private String email;
    private String fax;
    private String phone;
    private String street;
    private String town;
    private String zip;
    private String website;
    private List<Long> workers;
    private Long company;
    private Long externalID;
    private String calendarID;
    private Long selectedAvatar;
    private List<Long> avatars;
    private String customField;
    private String preferences;


    /*
     * Constructors
     */
    public OrganizationDTO() {
        super();
    }

    public OrganizationDTO(final Long id) {
        super(id);
    }

    public OrganizationDTO(String country, String clientID, String clientSecret, Boolean enable,
                           String email, String fax, String phone, String street,
                           String town, String zip, String website, List<Long> workers,
                           Long company, Long externalID, String calendarID, Long selectedAvatar, List<Long> avatars, String billingID, String preferences) {
        this.country = country;
        this.clientID = clientID;
        this.clientSecret = clientSecret;
        this.enable = enable;
        this.email = email;
        this.fax = fax;
        this.phone = phone;
        this.street = street;
        this.town = town;
        this.zip = zip;
        this.website = website;
        this.workers = workers;
        this.company = company;
        this.externalID = externalID;
        this.calendarID = calendarID;
        this.selectedAvatar = selectedAvatar;
        this.avatars = avatars;
        this.customField = billingID;
        this.preferences = preferences;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Long> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Long> workers) {
        this.workers = workers;
    }

    public Long getCompany() {
        return company;
    }

    public void setCompany(Long company) {
        this.company = company;
    }

    public Long getExternalID() {
        return externalID;
    }

    public void setExternalID(Long externalID) {
        this.externalID = externalID;
    }

    public String getCalendarID() {
        return calendarID;
    }

    public void setCalendarID(String calendarID) {
        this.calendarID = calendarID;
    }

    public Long getSelectedAvatar() {
        return selectedAvatar;
    }

    public void setSelectedAvatar(Long selectedAvatar) {
        this.selectedAvatar = selectedAvatar;
    }

    public List<Long> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<Long> avatars) {
        this.avatars = avatars;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
}
