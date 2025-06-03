package eu.lpinto.universe.persistence.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * A Company is a Legal Entity which contains a group of employees. This has hierarchy capabilities, meaning a company
 * can have a parent company.
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Entity
@Table(name = "Company")
@Inheritance(strategy = InheritanceType.JOINED)
public class Company extends AbstractEntity implements Serializable {

    public static final String DEFAULT_IMG = "data:image/png;base64,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";
    private static final long serialVersionUID = 1L;

    private String phone;
    private String facebook;
    private String email;
    private String vatNumber;
    private String customField;

    private String street;
    private String zip;
    private String town;
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "selectedAvatar_id")
    private Image selectedAvatar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Company parent;

    private String preferences;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<Company> children;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Company_Image",
               joinColumns = {
                   @JoinColumn(name = "company_id", referencedColumnName = "id")},
               inverseJoinColumns = {
                   @JoinColumn(name = "image_id", referencedColumnName = "id")})
    private List<Image> avatars;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private List<Employee> employees;

    /*
     * Constructors
     */
    public Company() {
        super();
    }

    public Company(final Long id) {
        super(id);
    }

    public Company(String phone, String facebook, String email, String vatNumber, String customField,
                   String street, String zip, String town, String country,
                   Image selectedAvatar, Company parent, String preferences) {
        this.phone = phone;
        this.facebook = facebook;
        this.email = email;
        this.vatNumber = vatNumber;
        this.customField = customField;
        this.street = street;
        this.zip = zip;
        this.town = town;
        this.country = country;
        this.selectedAvatar = selectedAvatar;
        this.parent = parent;
        this.preferences = preferences;
    }


    /*
     * Getters/Setters
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        assertNotNull(phone);
        this.phone = phone;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(final String facebook) {
        assertNotNull(facebook);
        this.facebook = facebook;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        assertNotNull(email);
        this.email = email;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(final String vatNumber) {
        assertNotNull(vatNumber);
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

    public Image getSelectedAvatar() {
        return selectedAvatar;
    }

    public void setSelectedAvatar(final Image selectedAvatar) {
        this.selectedAvatar = selectedAvatar;
    }

    public Company getParent() {
        return parent;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public void setParent(final Company parent) {
        assertNotNull(parent);
        assertNotNull(parent.getId());

        if(parent.getId().equals(this.getId())) {
            throw new IllegalArgumentException("Cannot set parent with same id as current object");
        }

        this.parent = parent;
    }

    public List<Company> getChildren() {
        return this.children == null ? new ArrayList<>(0) : this.children;
    }

    public void setChildren(final List<Company> children) {
        assertNotNull(children);

        this.children = children;
    }

    public List<Image> getAvatars() {
        return avatars;
    }

    public void setAvatars(final List<Image> avatars) {
        this.avatars = avatars;
    }

    public void addAvatar(final Image avatar) {
        if(this.getAvatars() == null) {
            this.setAvatars(new ArrayList<>(1));
        }

        this.avatars.add(avatar);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
