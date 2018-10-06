package org.leoliu.easyweb.crmdemo.service;

import org.leoliu.easyweb.crmdemo.model.Customer;
import org.leoliu.easyweb.helper.DatabaseHelper;

import java.util.List;
import java.util.Map;

public class CustomerService {

    public List<Customer> getCustomerList(String keyword){
        //TODO
        return null;
    }

    public List<Customer> getCustomerList(){

        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);

    }

    public Customer getCustomer(Long id){
        String sql = "SELECT * FROM customer WHERE id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    public boolean createCustomer(Map<String, Object> fieldMap){

        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(Long id, Map<String, Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }


    public boolean deleteCustomer(Long id){
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
