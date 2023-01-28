/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gst;
import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Tony
 */
public class conn extends Frame {
  
    public static  void main(String args[]){
        try {
            //step1 load the driver class  
            Class.forName("oracle.jdbc.OracleDriver");

            //step2 create  the connection object  
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "mk", "123");

            String sql = "";
            //String sql = "INSERT INTO ADDPARTYNAME(product_name,HSN_NO,ITEM_CODE,PURCHAS_PRICE,SELLING_PRICE) values ('" + Tprodeuct_name1.getText() + "'," + Thsn_no.getText() + "," + Titem_code1.getText() + "," + Tpuchas_price.getText() + "," + Tsell_price.getText() + "";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();

            JOptionPane.showMessageDialog(null, "you data is inserteteds");
          

            //step3 create the statement object  
        } catch (ClassNotFoundException e) {
            System.out.println("conn not done class not found------>" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("conn not done------>" + e.getMessage());
        }
    }
    
    
    
}
