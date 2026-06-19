
package studentmain;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;


public class studentdao {
    public Connection dbconnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
      Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/School","postgre","Sulthan@25");
        return con; 
        
    }
    public void insert(Studentmodule s) throws SQLException, ClassNotFoundException
    {
        Connection c=dbconnection();
       PreparedStatement f= c.prepareStatement("insert into Student values(?,?,?,?)");
       f.setInt(1,s.getId());
       f.setString(2,s.getName());
       f.setString(3, s.getEmail());
       f.setString(4,s.getCourse());
       f.setFloat(5,s.getFees());
       f.executeUpdate();
    }
    public void delete(Studentmodule s) throws SQLException, ClassNotFoundException
    {
        Connection con=dbconnection();
        PreparedStatement cs=con.prepareStatement("delete from Student where =?");
        cs.setInt(1,s.getId());
        cs.executeUpdate();
        
    }
    public ArrayList <Studentmodule> display() throws ClassNotFoundException, SQLException
    {
      

          ArrayList<Studentmodule> ad=new ArrayList();        

        Connection c=dbconnection();
      PreparedStatement f= c.prepareStatement("Select*from Student");
        ResultSet rs = f.executeQuery();
            while(rs.next())
            {
                Studentmodule fs=new Studentmodule();
                
            
        fs.setId(rs.getInt(1));
       fs.setName(rs.getString(2));
       fs.setEmail( rs.getString(3));
       fs.setCourse(rs.getString(4));
       fs.setFees(rs.getFloat(5));
      
       ad.add(fs);
    
            }
        return ad;
    
    
}
       public void update(Studentmodule s) throws SQLException, ClassNotFoundException
    {
        Connection c=dbconnection();
       PreparedStatement f= c.prepareStatement("update student set course=?,fee=? where id=?");
       f.setInt(3,s.getId());
       
    
       f.setString(1,s.getCourse());
       f.setFloat(2,s.getFees());
       f.executeUpdate();
       
    }
       public void search(Studentmodule s) throws Exception {

    
         Connection c=dbconnection();   
    PreparedStatement ps =c.prepareStatement("select * from student where email=?");
    ps.setString(1,s.getEmail());
    ResultSet rs = ps.executeQuery();

    while(rs.next()) {

        System.out.println(rs.getInt("id") + " " +rs.getString("name") + " " +rs.getString("email") + " " +rs.getString("course") + " " + rs.getDouble("fee"));
}
   
}
}

