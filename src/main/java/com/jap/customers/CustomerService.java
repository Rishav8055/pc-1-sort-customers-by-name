package com.jap.customers;



import java.util.*;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
public List<String> getListOfCustomersSortedByName(List<Customer> customerList){
    List<String> stringList=new ArrayList<>();
    Collections.sort(customerList,new NameComparator());
    for (Customer customer:customerList){
        String customerName=customer.getCustomerName();
        stringList.add(customerName);
    }


    return stringList;
}


}
