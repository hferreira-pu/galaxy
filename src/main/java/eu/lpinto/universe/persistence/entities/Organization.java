package eu.lpinto.universe.persistence.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Rita
 */
@Entity
@Table(name = "Organization")
public class Organization extends AbstractEntity implements Serializable, UniverseEntity {

    private static final long serialVersionUID = 1L;

    public static final String DEFAULT_IMAGE = "https://petuniversal.blob.core.windows.net/images/logo.png";

    private String country;

    private String clientID; //0

    private String clientSecret; //0

    private Boolean enable;

    private String email;

    private Long externalID;

    private String fax;

    private String phone;

    private String street;

    private String town;

    private String zip;

    private String website;

    private String ip;

    @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY)
    private List<Worker> workers;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    private String calendarID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "selectedAvatar_id")
    private Image selectedAvatar;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Organization_Image",
               joinColumns = {
                   @JoinColumn(name = "organization_id", referencedColumnName = "id")},
               inverseJoinColumns = {
                   @JoinColumn(name = "image_id", referencedColumnName = "id")})
    private List<Image> avatars;

    private String customField;

    @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY)
    private List<OrganizationFeature> features;

    private String preferences;

    /*
     * Constructors
     */
    public Organization() {
    }

    public Organization(Long id) {
        super(id);
    }

    public Organization(String country, String clientID, String clientSecret,
                        Boolean enable, String email, Long externalID, String fax, String phone,
                        String street, String town, String zip, String website, List<Worker> workers,
                        Company company, String calendarID, Image selectedAvatar, List<Image> avatars, String billingID,
                        String preferences, String name, User creator, Calendar created, User updater, Calendar updated, Long id) {
        super(name, creator, created, updater, updated, id);
        this.country = country;
        this.clientID = clientID;
        this.clientSecret = clientSecret;
        this.enable = enable;
        this.email = email;
        this.externalID = externalID;
        this.fax = fax;
        this.phone = phone;
        this.street = street;
        this.town = town;
        this.zip = zip;
        this.website = website;
        this.workers = workers;
        this.company = company;
        this.calendarID = calendarID;
        this.selectedAvatar = selectedAvatar;
        this.avatars = avatars;
        this.customField = billingID;
        this.preferences = preferences;
    }

    public Boolean hasFeature(final String featureName) {
        if(features == null || features.isEmpty()) {
            return false;
        }

        return features.stream().anyMatch((pf) -> (featureName.equals(pf.getFeature().getName())));
    }

    /*
     * GETTERS/SETTERS
     */
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

    public Long getExternalID() {
        return externalID;
    }

    public void setExternalID(Long externalID) {
        this.externalID = externalID;
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

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getCalendarID() {
        return calendarID;
    }

    public void setCalendarID(String calendarID) {
        this.calendarID = calendarID;
    }

    public Image getSelectedAvatar() {
        return selectedAvatar;
    }

    public void setSelectedAvatar(Image selectedAvatar) {
        this.selectedAvatar = selectedAvatar;
    }

    public List<Image> getAvatars() {
        return avatars;
    }

    public void addAvatar(final Image avatar) {
        if(this.avatars == null) {
            this.avatars = new ArrayList<>(1);
        }

        this.avatars.add(avatar);
    }

    public void setAvatars(List<Image> avatars) {
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
