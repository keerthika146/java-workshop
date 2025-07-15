package workshop.Temperaturedata;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import workshop.Temperaturedata.dao.organization; 
public class JDBCExample {
        public static void main(String[]args){
            Connection dbConnection = null;
                        try{
                            Class.forName("org.h2.Driver");
                        }catch(ClassNotFoundException e){
                            e.printStackTrace();
                        }
                        try{
                            dbConnection = 
                        DriverManager.getConnection(
                            "jdbc:h2:mem:temdataDB","sa",null);    
                        }catch(SQLException sqlException){
                            System.out.println("Error Creating table:"+ sqlException);
                        }
                        OrganizationDAO organizationDAO = new OrganizationDAO();
                        OrganizationDAO.createTable(dbConnection);
                        Organization vet = new Organization("VET ","Vellalar Educational Trust:",
                        "www.vet.com","contact@vet.com","9486841411",
                        128658562L,null);
                        organizationDAO.save(dbconnection,vet);
        }
}
