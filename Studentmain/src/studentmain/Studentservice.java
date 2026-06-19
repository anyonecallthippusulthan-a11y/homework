package studentmain;

import java.sql.SQLException;

public class Studentservice {

    studentdao a=  new studentdao();
     public void  insert (Studentmodule s) throws ClassNotFoundException, SQLException
     {
         a.insert(s);
     }
     public void  display (Studentmodule s) throws ClassNotFoundException, SQLException
     {
         a.display();
     }
     public void  update(Studentmodule s) throws ClassNotFoundException, SQLException
     {
         a.update(s);
     }
     public void  delete (Studentmodule s) throws ClassNotFoundException, SQLException
     {
         a.delete(s);
     }
    public void  search (Studentmodule s) throws ClassNotFoundException, SQLException, Exception
     {
         a.search(s);
     }
    
    
    
    
}
