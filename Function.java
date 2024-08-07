import java.sql.*;

public class Function {
    public static void dbselect(){

        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
            Statement stmt = con.createStatement();
        ){
            String sql ="SELECT AVG(marks) AS average FROM Student";
            ResultSet rs = stmt.executeQuery(sql);
            double avg = 0;
            while (rs.next())
            {
                avg = rs.getDouble(1);
            }
            System.out.println("Average marks "+avg);

            String query ="SELECT COUNT(*) AS count FROM STUDENT";
            ResultSet rs1 = stmt.executeQuery(query);
            int count = 0;
            while(rs1.next()){
                count = rs1.getInt(1);

            }
            System.out.println("The total number of records is "+count);

            rs.close();
            rs1.close();
    }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        dbselect();
    }
}
