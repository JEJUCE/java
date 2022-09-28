package week3;

public class Employee {

		private String name;
		private String LastName;

    
	public Employee(String name, String LastName) {
		
    }


	public void TestInfo(String name, String LastName, double Salary) {
        this.name = name;
        this.LastName = LastName;
        
    }
     
    public String getName() {
        return name;
    }
    public String getLastName() {
        return LastName; 
    }
   
    public void setName(String name) {
    	this.name = name;
    }
    public void setLastName(String LastName) {
    	this.LastName = LastName;
    }	
    


    }
     

