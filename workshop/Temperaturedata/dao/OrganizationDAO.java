package workshop.Temperaturedata.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
public class OrganizationDAO {
        public void createTable(Connection dbConnection){
            try(Statement statement = dbConnection.createStatement()){
            statement.execute("""
                create table organization(
                id int AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(100),
                WEBSITE VARCHAR(100),
                EMAIL VHARCHAR(100),
                CONTACT_NUMBER VARCHAR(100),
                REGISTRATION_NO INT,
                DESCRIPTION VARCHAR(255))
                """);
        }catch(SQLException sqlExpcetion){
            System.out.println("Error creating table"+sqlException);
        }
}
 public int save(Connection dbConnection,Organization vet){
    try( PreparedStatement preparedstatement = dbConnection.preparestatement("""
            insert into organization(name,website),email,contact_number,
            registration_no,description) values(?,?,?,?,?,?)
            """)){
                preparedstatement.setString(1, vet.name());
                preparedstatement.setString(2, vet.website());
                preparedstatement.setString(3, vet.email());
                preparedstatement.setString(4, vet.contact_Number());
                preparedstatement.setString(5, vet.registrationNumber());
                preparedstatement.setString(6, vet.description());
                preparedstatement.executeUpdate();
            }catch (SQLException sqlException){
                System.out.println("Erroe inserting into table :" + sqlException);
            }
   return 0;
 }
 public Organaization findByName(Connection dbConnection,String name){
    Organaization organaization = null;
 try(PreparedStatement preparedStatement = dbConnection.prepareStatement("""
         select * from organaization where name = ?
         """)) {
            preparedStatement.setString(1, name);
            ResultSet redult = preparedStatement.executeQuery();
            if(resultSet != null && resultSet.next()){
                organaization = new Organization(resultSet.getString("name"),
                resultSet.getString("description"),
                resultSet.getString("website"),
                resultSet.getString("email"),
                resultSet.getString("contact_number"),
                resultSet.getString("registration_no"),null);
            }
         }catch(SQLException exception){
            System.out.println("Ecception while fetching the data" + exception);
         }
 }
 
}
