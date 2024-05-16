package com.example.restdemo.service;

import java.util.List;
import com.example.restdemo.model.CloudVendor;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudvendorId);
	public CloudVendor getCloudVendor(String cloudvendorId);
	public List<CloudVendor> getAllCloudVendor();
	

}
