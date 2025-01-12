public class Customer {
    private String name;
    private String contact;
    private  String licenseNo;

    public Customer(String name, String contact, String licenseNo) {
        this.name = name;
        this.contact = contact;
        this.licenseNo = licenseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
}
