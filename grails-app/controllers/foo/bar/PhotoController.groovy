package foo.bar

import employeetables.Employee;

class PhotoController {

    def viewPhoto() {
		def employee = Employee.get( params.id )
		byte[] image = employee.avatar
		response.outputStream << image
	}
}
