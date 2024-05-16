package com.example.restdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restdemo.model.CloudVendor;
import com.example.restdemo.repository.CloudVendorRepository;
import com.example.restdemo.service.CloudVendorService;

@Service
public class CloudVendorSeriveImpl implements CloudVendorService {
	CloudVendorRepository cloudVendorRepository;
	
	public CloudVendorSeriveImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository=cloudVendorRepository;
	}
	
	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		return cloudVendorRepository.findAll();
	}

}
