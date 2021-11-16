//To demonstate the memory allocation concept.
package classes;

public class TextBox {
    public String text=""; //Always initialize the String variable so to avoid future NullPointerExceptions 
   
    public void getText(String text)
    {
        this.text = text; //We used this to avoid confusion between the text in class field and text in parameter 
    }
    
    public void clear()
    {
        text = "";
    }
    
}
