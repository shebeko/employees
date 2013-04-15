import employeetables.Employee
import grails.util.Environment;
import org.codehaus.groovy.grails.commons.GrailsApplication

class BootStrap {
	
	GrailsApplication grailsApplication
	
    def init = { servletContext ->
		switch (Environment.current) {
			case Environment.DEVELOPMENT:
			println "No special configuration required"
				break;
				
			case Environment.PRODUCTION:
				createEmployees();
				break;	
		}
    }
	
    def destroy = {
    }
	
	void createEmployees() {
		def applicationContext = grailsApplication.mainContext
        String basePath = applicationContext.getResource("/").getFile().toString()
		String avatarsPath = "${basePath}/images/avatars"
				
		def fis = new FileInputStream("${avatarsPath}/billy_corgan.jpg");
		byte [] photo = new byte[fis.available()]
		fis.read(photo);
		new Employee(firstName: "Billy", lastName:"Corgan", avatar: photo,
			sex:"Male", yearOfBirth:"1967", position:"musician", comment: "The Smashing Pumpkins!").save();
		new Employee(firstName: "Chris", lastName:"Martin",
			sex:"Male", yearOfBirth:"1977", position:"singer-songwriter", comment: "Coldplay!").save();
		new Employee(firstName: "Thom", lastName:"Yorke",
			sex:"Male", yearOfBirth:"1968", position:"singer-songwriter", comment: "Radiohead!").save();
		new Employee(firstName: "Richard", lastName:"Ashcroft",
			sex:"Male", yearOfBirth:"1971", position:"singer-songwriter", comment: "The Verve!").save();
		new Employee(firstName: "Nick", lastName:"McCabe",
			sex:"Male", yearOfBirth:"1971", position:"lead guitarist", comment: "The Verve!").save();
		new Employee(firstName: "Kylie", lastName:"Minogue",
			sex:"Female", yearOfBirth:"1968", position:"singer-songwriter", comment: "Kylie Minogue!").save();
		fis = new FileInputStream("${avatarsPath}/dead_man.jpg");
		photo = new byte[fis.available()]
		fis.read(photo);
		new Employee(firstName: "Neil", lastName:"Young", avatar: photo,
			sex:"Male", yearOfBirth:"1945", position:"singer-songwriter", comment: "Dead man!").save();
		new Employee(firstName: "Amy", lastName:"Winehouse",
			sex:"Female", yearOfBirth:"1983", position:"singer-songwriter", comment: "Amy Winehouse!").save();
		new Employee(firstName: "Jon", lastName:"Birgisson",
			sex:"Male", yearOfBirth:"1975", position:"guitarist-vocalist", comment: "Sigur Ros!").save();
		new Employee(firstName: "Kelly", lastName:"Jones",
			sex:"Male", yearOfBirth:"1974", position:"guitarist-vocalist", comment: "Stereophonics!").save();
	}
}
