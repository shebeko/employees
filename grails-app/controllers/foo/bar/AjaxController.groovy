package foo.bar

class AjaxController {
	
	def getImagePath() {
		String path = resource(dir: 'images', file: params.fileName);
		render(contentType:"text/json") {
			imagePath = path
		}
	}
}
