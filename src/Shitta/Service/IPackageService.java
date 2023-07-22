package Shitta.Service;

import Shitta.dto.Request.PackageRequest;
import Shitta.dto.Response.PackageResponse;

import java.util.List;

public interface IPackageService {
	PackageResponse createNewPackage(PackageRequest request);
	PackageResponse updateCreatedPackage(PackageRequest request);
	
	PackageResponse findPackageById(String id);
	
	List<PackageResponse> findPackageByUserId(String userId);
	
	List<PackageResponse> findAllPackages();
	
	String deletePackage(String packageId);
	
	List<PackageResponse> findPackageByStatus(boolean isSuccessful);
	
	PackageResponse updatePackageStatus(String packageId, String userId);
}
