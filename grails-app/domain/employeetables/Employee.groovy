package employeetables

class Employee {
	
	String firstName
	String lastName
	String sex
	String yearOfBirth
	String position
	String comment 
	byte[] avatar
	
    static constraints = {
		// Limit upload file size to 1MB
		avatar maxSize: 1024 * 1024, nullable: true
    }
}
