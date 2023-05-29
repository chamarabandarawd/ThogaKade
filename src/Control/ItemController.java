/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Item;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author chama
 */
public class ItemController {
    public static Item searchItem(String code) throws ClassNotFoundException, SQLException{
        ResultSet rst =DBConnection.getInstance().getConnection().createStatement().executeQuery("Select * From Item where code='"+code+"'");
        return rst.next()? new Item(rst.getString(code),rst.getString(description),, 0)
    }
}
