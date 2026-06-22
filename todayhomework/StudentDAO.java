package todayhomework;

import java.sql.*;

public class StudentDAO {

    public void insertStudent(Studentm s) throws Exception {

        Connection con = DBConnection.getConnection();

        String sql =
        "insert into studentm(id,name,email,course,fee) values(?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, s.getId());
        ps.setString(2, s.getName());
        ps.setString(3, s.getEmail());
        ps.setString(4, s.getCourse());
        ps.setDouble(5, s.getFee());

        int row = ps.executeUpdate();

        if(row > 0)
            System.out.println("Inserted Successfully");

        con.close();
    }

    public void viewAllStudents() throws Exception {

        Connection con = DBConnection.getConnection();

        String sql = "select * from studentm";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {

            System.out.println(
                    rs.getInt("id")+" "+
                    rs.getString("name")+" "+
                    rs.getString("email")+" "+
                    rs.getString("course")+" "+
                    rs.getDouble("fee"));
        }

        con.close();
    }

    public void updateStudent(int id,String course,double fee)
            throws Exception {

        Connection con = DBConnection.getConnection();

        String sql =
                "update studentm set course=?,fee=? where id=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, course);
        ps.setDouble(2, fee);
        ps.setInt(3, id);

        int row = ps.executeUpdate();

        if(row > 0)
            System.out.println("Updated Successfully");
        else
            System.out.println("ID Not Found");

        con.close();
    }

    public void deleteStudent(int id) throws Exception {

        Connection con = DBConnection.getConnection();

        String sql = "delete from studentm where id=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        int row = ps.executeUpdate();

        if(row > 0)
            System.out.println("Deleted Successfully");
        else
            System.out.println("ID Not Found");

        con.close();
    }

    public void searchByEmail(String email)
            throws Exception {

        Connection con = DBConnection.getConnection();

        String sql =
                "select * from studentm where email=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, email);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            System.out.println(
                    rs.getInt("id")+" "+
                    rs.getString("name")+" "+
                    rs.getString("email")+" "+
                    rs.getString("course")+" "+
                    rs.getDouble("fee"));
        }
        else {
            System.out.println("Student Not Found");
        }

        con.close();
    }
}