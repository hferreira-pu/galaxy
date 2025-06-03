package eu.lpinto.universe.api.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Encapsulates a company.
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
public class Company extends AbstractDTO implements Serializable {

    public static final long serialVersionUID = 1L;

    private String phone;
    private String facebook;
    private String email;
    private String vatNumber;
    private String customField;

    private String street;
    private String zip;
    private String town;
    private String country;

    private Long avatar;
    private Long parent;
    private String preferences;

    private List<Long> children;
    private List<Long> avatars;

    /*
     * Constructors
     */
    public Company() {
    }

    public Company(Long id) {
        super(id);
    }

    public Company(String phone, String facebook, String email, String vatNumber, String customField,
                   String street, String zip, String town, String country,
                   Long avatar, Long parent, String preferences) {
        this.phone = phone;
        this.facebook = facebook;
        this.email = email;
        this.vatNumber = vatNumber;
        this.customField = customField;
        this.street = street;
        this.zip = zip;
        this.town = town;
        this.country = country;
        this.avatar = avatar;
        this.parent = parent;
        this.preferences = preferences;
    }

    /*
     * Getters/Setters
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getAvatar() {
        return avatar;
    }

    public void setAvatar(Long avatar) {
        this.avatar = avatar;
    }

    public Long getParent() {
        return parent;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public List<Long> getChildren() {
        return children;
    }

    public void setChildren(List<Long> children) {
        this.children = children;
    }

    public List<Long> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<Long> avatars) {
        this.avatars = avatars;
    }
}
