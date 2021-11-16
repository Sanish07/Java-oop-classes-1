/* To demonstate the encapsulation and Constructor concept.
 */
package classes;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    private static int numOfEmployees;
    
    public static void printNumOfEmp(){
        System.out.println("Number of Employees : "+numOfEmployees);
    }
    
    public Employee(int baseSalary){ //Constructor Overloading for scenario is houlyRate not passed.
      this(baseSalary,0);
    }
    
    public Employee(int baseSalary, int hourlyRate){
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
    numOfEmployees++;
    }
    
    private void setBaseSalary(int baseSalary){  //To set the baseSalary to calculate wage - Setter
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Salary cannot be zero or less.");
        }
        this.baseSalary = baseSalary;
    }
    
    public int getBaseSalary(){ //To return the private int baseSalary if anyone wants to access it outside the Employee class - Getter
      return baseSalary;
    }
    
    private void setHourlyRate(int hourlyRate){  //Setter
    if(hourlyRate < 0){
      throw new IllegalArgumentException("Houly Rate Cannot be zero or less.");
    }
    this.hourlyRate = hourlyRate;
    }
    
    public int getHourlyRate(){   //Getter
    return hourlyRate;
    }
    
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

 }
