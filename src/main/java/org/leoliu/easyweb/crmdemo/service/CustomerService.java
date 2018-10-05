package org.leoliu.easyweb.crmdemo.service;

import org.leoliu.easyweb.crmdemo.model.Customer;
import org.leoliu.easyweb.helper.DatabaseHelper;
import org.leoliu.easyweb.utils.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * get customer list
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword){
        //TODO
        return null;
    }

    /**
     * get customer list
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(){
        Connection conn = null;
        try {
            List<Customer> customerList = new ArrayList<>();
            String sql = "SELECT * FROM customer";
            conn = DatabaseHelper.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getLong("id"));
                customer.setName(rs.getString("name"));
                customer.setContact(rs.getString("contact"));
                customer.setTelephone(rs.getString("telephone"));
                customer.setEmail(rs.getString("email"));
                customer.setRemark(rs.getString("remark"));
                customerList.add(customer);
            }
            return customerList;
        }catch (SQLException e){
            LOGGER.error("execute sql failure", e);
            return null;
        }finally {
            DatabaseHelper.closeConnection(conn);
        }
    }

    /**
     * get Customer
     * @param id
     * @return
     */
    public Customer getCustomer(Long id){
        //TODO
        return null;
    }

    /**
     * create Customer
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * update customer
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(Long id, Map<String, Object> fieldMap){
        //TODO
        return false;
    }

    /**
     * delete customer
     * @param id
     * @return
     */
    public boolean deleteCustomer(Long id){
        //TODO
        return false;
    }
}
