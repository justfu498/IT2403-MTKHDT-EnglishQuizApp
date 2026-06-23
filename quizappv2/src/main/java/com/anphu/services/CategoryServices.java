/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anphu.services;

import com.anphu.pojo.Category;
import com.dht.utils.MyConnSingleton;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class CategoryServices {

    public List<Category> getCategories() throws SQLException {
        String sql = "SELECT * FROM category";
        Statement stm = MyConnSingleton.getInstance().connect().createStatement();
        ResultSet rs = stm.executeQuery(sql);
        
        List<Category> res = new ArrayList<>();
        
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            res.add(new Category(id, name));
        }
        return res;
    }
}
