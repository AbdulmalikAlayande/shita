package Shitta.Service;

import Shitta.data.repositories.PackageRepository;
import Shitta.dto.Request.PackageRequest;
import Shitta.dto.Response.PackageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageServiceImpl implements IPackageService{
	
	@Autowired
	private PackageRepository packageRepository;
	
	@Override
	public PackageResponse createNewPackage(PackageRequest request) {
		return null;
	}
	
	@Override
	public PackageResponse updateCreatedPackage(PackageRequest request) {
		return null;
	}
	
	@Override
	public PackageResponse findPackageById(String id) {
		return null;
	}
	
	@Override
	public List<PackageResponse> findPackageByUserId(String userId) {
		return null;
	}
	
	@Override
	public List<PackageResponse> findAllPackages() {
		return null;
	}
	
	@Override
	public String deletePackage(String packageId) {
		return null;
	}
	
	@Override
	public List<PackageResponse> findPackageByStatus(boolean isSuccessful) {
		return null;
	}
	
	@Override
	public PackageResponse updatePackageStatus(String packageId, String userId) {
		return null;
	}
}
