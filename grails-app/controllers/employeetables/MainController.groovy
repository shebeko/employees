package employeetables

class MainController {

    def index() {
		
	}
	
	def showAll() {
		[employees:Employee.list()]
	}
	
	def edit() {
		[employee: Employee.get(params.id)]	
	}
	
	def update() {
		def employee = Employee.get(params.id)
		byte[] avatar = employee.avatar;
		def version = employee.version
		employee.properties = params
		if (employee.avatar.length == 0) {
			employee.avatar = avatar
		} 
		employee.save(flush:true)
		boolean updated = !(version == employee.version);
		render(view:'showAll', model:[employees:Employee.list(), updatedEmployee:employee, updated:updated])
	}
}
