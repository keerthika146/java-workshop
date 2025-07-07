package workshop.beans.arrays;

public class location {
      private String name;
      private Double latitude;
      private Double longitude;
      private String Description;
      private String Country;
      private String City;
      private String Address;
      private String postalcode;

      public void setName(String aName){
        name = aName;
      }

      public String getName(){
        return name;
      }
      public void setlatitude(Double alatitude){
        latitude = alatitude;
      }
      public Double getlatitude(){
        return latitude;
      }
      public void setlongitude(double alongitude){ 
        longitude = alongitude;
      }
      public void setDescription(String aDescription){
        Description=aDescription;
      }
      public String getdescription(){
        return description;
      }
      public void setcountry(String aCountry){
        country = aCountry;
      }
      public void setCity(String acity){
        City = acity;
      }
      public String getcity(){
        return City;
      }
      public String getAddress(){
         Address = aAddress;
      }
      public String getAddress(){
        return Address;
      }
        return"location { name:"+ name +",latitude:" + latitude +",longitude:" +longitude+",Description:" +Description+",country:" +country+"
                         ,City:" +City+ ",Address:" +Address+ ",postalcode";}
       
} 