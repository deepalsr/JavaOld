import java.sql.*;
import java.util.Scanner;

public class DBDemo {
   public static void dbselect(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the program: ");
        String program = scanner.nextLine();

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcedb", "root", "");
            Statement stmt = con.createStatement();
            ){
            String sql ="SELECT * FROM tbl_student WHERE program ='"+program+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println("ID:"+rs.getInt("id"));
                System.out.println("Name:"+rs.getString("name"));
                System.out.println("program:"+rs.getString("program"));
                System.out.println("\n");

            }
            rs.close();


        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        dbselect();
    }
}
