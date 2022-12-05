package com.cgs.loyalty.service.customer;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cgs.loyalty.dto.CustomerDto;
import com.cgs.loyalty.entity.customer.LoyaltyCustomerDetails;
import com.cgs.loyalty.repository.customer.LoyaltyCustomerRepository;

@Service
public class LoyaltyCustomerServiceImp implements LoyaltyCustomerService {

	@Autowired
	private LoyaltyCustomerRepository customerLoyaltyRepository;

	@Autowired
	private ModelMapper modelMapper;

	// Save customer
	
	@Override
	public CustomerDto save(CustomerDto customerDto) {

		LoyaltyCustomerDetails customer = dtoToLoyCustomerDetails(customerDto);
		LoyaltyCustomerDetails savedCustomer = customerLoyaltyRepository.save(customer);
		return loyCustomerDetailsToDto(savedCustomer);
	}
    
	// get all customer
	
	@Override
	public List<CustomerDto> getAllCustomer() {
		
		List<LoyaltyCustomerDetails> customers =customerLoyaltyRepository.findAll();
		List<CustomerDto> dtoCustomers =customers.stream().
			map(customer -> loyCustomerDetailsToDto(customer)).collect(Collectors.toList());	
		return dtoCustomers;
	}
	
    // get customer
	
	@Override
	public CustomerDto getCustomer(String customerId) {
		
		LoyaltyCustomerDetails customer = customerLoyaltyRepository.findById(customerId).orElse(null);
		return loyCustomerDetailsToDto(customer);
	}
 
	// Update customer
	
	@Override
	public CustomerDto addCustomer(CustomerDto customerDto) {
		
		LoyaltyCustomerDetails customer = dtoToLoyCustomerDetails(customerDto);
		LoyaltyCustomerDetails updatCustomer = customerLoyaltyRepository.save(customer);
		return loyCustomerDetailsToDto(updatCustomer);
	}

	// delete customer
	
	@Override
	public void deleteById(String customerId) {
		
		customerLoyaltyRepository.deleteById(customerId);

	}

	
	// Dto to LoyaltyCustomerDetails
	
	public LoyaltyCustomerDetails dtoToLoyCustomerDetails(CustomerDto customerDto) {

		LoyaltyCustomerDetails customerDetails = this.modelMapper.map(customerDto, LoyaltyCustomerDetails.class);
		return customerDetails;
	}

	// LoyaltyCustomerDetails to Dto
	
	public CustomerDto loyCustomerDetailsToDto(LoyaltyCustomerDetails loyCustomerDetails) {

		CustomerDto customerDto = this.modelMapper.map(loyCustomerDetails, CustomerDto.class);
		return customerDto;
	}
	

}
