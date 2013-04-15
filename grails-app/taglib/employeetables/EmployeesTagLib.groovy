package employeetables

class EmployeesTagLib {
	/**
	 * @attr id REQUIRED
	 * @attr collection REQUIRED
	 */
	def customTable = { attrs ->
		def props = Employee.metaClass.properties;
		out << render(template: "customTableTemplate", model:[employees:attrs["collection"],
			tableClass:attrs["class"], frameName:attrs["frame"],
			tableId:attrs["id"]])	
	}
}
