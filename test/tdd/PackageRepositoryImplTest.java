package tdd;

import Shitta.data.models.Package;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImplTest {
	
	private PackageRepositoryImpl packageRepository;
	private Package thePackage;
	@BeforeEach
	void setUp() {
		thePackage = new Package();
		packageRepository = new PackageRepositoryImpl();
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	@DisplayName("Test that if you save a package the count of the list of packages increments")
	public void saveOnePackage_countIsIncrementingTest(){
		assertEquals(0, packageRepository.count());
		packageRepository.save(thePackage);
		packageRepository.save(thePackage);
		assertEquals(1, packageRepository.count());
	}
	
	@Test
	@DisplayName("Test that if i save a package the id package is set")
	public void saveOnePackage_IdIsOneTest(){
		Package thePackage = new Package();
		assertEquals(0,thePackage.getPackageId());
		Package savedPackage = packageRepository.save(thePackage);
		assertEquals(1, savedPackage.getPackageId());
		assertEquals(1, packageRepository.save(thePackage).getPackageId());
	}
	@Test
	@DisplayName("Find by Id test")
	void saveOnePackage_findPackageById_returnsSavedPackageTest(){
		Package thePackage = new Package();
		thePackage.setPayOnDelivery(true);
		packageRepository.save(thePackage);
		Package foundPackage = packageRepository.findById(1);
		assertEquals(1, foundPackage.getPackageId());
		assertTrue(foundPackage.isPayOnDelivery());
		assertEquals(thePackage, foundPackage);
	}
	
	@Test
	@DisplayName("Update Test")
	void saveTwoItemsWithSameId_CountISOneTest(){
		Package thePackage = new Package();
		thePackage.setPackageWeightInGrammes(34.00);
		packageRepository.save(thePackage);
		Package savedPackage = packageRepository.findById(1);
		assertEquals(thePackage, savedPackage);
		
		Package secondPackage = new Package();
		secondPackage.setPackageId(1);
		thePackage.setPackageWeightInGrammes(22);
		packageRepository.save(secondPackage);
		Package foundPackage = packageRepository.findById(1);
		
		assertEquals(foundPackage, secondPackage);
		assertNotEquals(foundPackage, thePackage);
	}
}