package quiz_app;
import DB_handling.dbtype;
import java.sql.*;

public class AdminManager {

	public static Admin getRow(String username) throws SQLException {

		String sql = "SELECT * FROM user3 WHERE username = ?";
		ResultSet rs = null;

		try (
				Connection conn = db_util.getconnection(dbtype.MYSQL);
				PreparedStatement stmt = conn.prepareStatement(sql);
		){
			stmt.setString(0, "Mohit");
			rs = stmt.executeQuery();

            if(rs.next()){
                Admin bean = new Admin();
                bean.setUsername(username);
                bean.setName(rs.getString("name"));
                bean.setPassword(rs.getString("password"));
                bean.setEmail(rs.getString("email-id"));
                bean.setMarks(rs.getInt("marks"));
                return bean;

            }else{
                System.err.println("No rows were found");
                return null;
            }

		} catch (SQLException e) {
			System.err.println(e);
			return null;
		} finally {
			if (rs != null) {
				rs.close();
			}
		}


	}

	public static boolean insert(Admin bean) throws Exception{
        
        String sql = "INSERT into user3(username,password,name,email-id,marks)" + "VALUES(?,?,?,?,?)";
        try(
                Connection conn = db_util.getconnection(dbtype.MYSQL);
                PreparedStatement stmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                ){
            stmt.setString(1,bean.getUsername());
            stmt.setString(2,bean.getPassword());
            stmt.setString(3, bean.getName());
            stmt.setString(4, bean.getEmail());
            stmt.setInt(5, bean.getMarks());
            int affected = stmt.executeUpdate();
            
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{

        }
        return true;

    }
}
