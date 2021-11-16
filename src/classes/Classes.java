
package classes;

public class Classes {

    public static void main(String[] args) {
        
      //  var textBox1 = new TextBox(); //var keyword will auto-identify the type of variable textBox1 is. //For 1st and 2nd program
      /*  textBox1.getText("TextBox 1");
        System.out.println(textBox1.text);
        
        var textBox2 = new TextBox();
        textBox2.getText("TextBox 2 ");
        System.out.println(textBox2.text);
        textBox2.clear();
        System.out.println(textBox2.text); */ // 1st program
        
      /* var textBox2 = textBox1; //Now textBox2 and textBox1 will be referencing to same object in heap and changes done in one of them wil reflect in both
       textBox2.getText("Hello World!");
        System.out.println(textBox1.text); */ //2nd program
        
       var emp1 = new Employee(70_000);
        /*emp1.baseSalary = 70_000;
        emp1.hourlyRate = 25; */ //This wont work since we switched both variable to private. We will use getters and setters instead.
        int wage1 = emp1.calculateWage(30);
        System.out.println(wage1);     
        
         var emp2 = new Employee(10_000,20);
        int wage2 = emp2.calculateWage(50);
        System.out.println(wage2);      
        Employee.printNumOfEmp(); //3rd program
        
        /* var req1 = new Browser();
        String response = req1.navigate("https://www.google.com");
        System.out.println(response); */ //4th program
        
    }
    
}
