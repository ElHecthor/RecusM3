class Employee implements Comparable<Employee> {
	
	private String firstName;
	private String lastName;
	private int birthYear;
	
	String getFirstName() {
		return firstName;
		}
	
	String getLastName() {
		return lastName; 
		}
	
	int getBirthYear() { 
		return birthYear;
		}

	public Employee(String f, String l, int year) {
		firstName = f; lastName = l; birthYear = year;
	}
	
	public String toString() {
		
		return "Nombre: " + this.firstName + " Apellidos: " + lastName + " Año: " + birthYear; 
		
		}

	public int compareTo(Employee other) {
		
		if(this.lastName.compareTo(other.lastName) != 0){
			return this.lastName.compareTo(other.lastName);
		}else if(this.lastName.compareTo(other.lastName) == 0){
			return this.firstName.compareTo(other.firstName);
		}else if(this.firstName.compareTo(other.firstName) == 0 && this.lastName.compareTo(other.lastName) == 0){
			return this.birthYear - other.birthYear;
		}else{
			return 0;
		}
				
	}	
}
