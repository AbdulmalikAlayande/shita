package Shitta.data.repositories;

import Shitta.data.models.Package;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PackageRepository extends MongoRepository<Package, String> {
	
}
