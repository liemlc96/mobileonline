package core.dto.model.common;

/**
 * @author DucBa
 */
public class Address {
    private String section;
    private String road;
    private String town;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String section, String road, String town, String district, String city) {
        this.section = section;
        this.road = road;
        this.town = town;
        this.district = district;
        this.city = city;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
