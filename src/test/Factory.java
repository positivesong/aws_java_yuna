package test;

class Factory {
	
	private static Factory instance = null;
	private String factoryName;
	private Factory() {}
	
	public static Factory getInstance() {
		if(instance == null) {
			instance = new Factory();
		}
		return instance;
	}
	
}
class School{
	
	private static School instance = null;
	private String schoolName;
	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
}