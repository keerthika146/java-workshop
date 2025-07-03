package temperaturedata.beans;

public class Location {
      private String name;
      private Double latitude;
      private Double longitude;
      private String description;
      private String country;
      private String city;
      private String address;
      private String postalcode;

      public void setName(String aName){
        name = aName;
      }

      public String getName(){
        return name;
      }

}
