package guru.springfamework.api.v1.mapper.impl;

import guru.springfamework.api.v1.mapper.CustomerMapper;
import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.domain.Customer;

public class CustomerMapperImpl implements CustomerMapper {
    @Override
    public CustomerDTO customerToCustomerDTO(Customer customer) {
        if (customer == null) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setFirstname(customer.getFirstname());
        customerDTO.setLastname(customer.getLastname());

        return customerDTO;
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDTO customerDTO) {
        if (customerDTO == null) {
            return null;
        }

        Customer customer = new Customer();

        customer.setFirstname(customerDTO.getFirstname());
        customer.setLastname(customer.getLastname());

        return customer;

    }
}
