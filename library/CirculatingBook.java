package library;


public class CirculatingBook extends LibraryBook{
  String currentHolder,dueDate;
  public CirculatingBook(String a,String b, String c, String d){
    super(a,b,c,d);
  }
  
  public String circulationStatus(){
    if(currentHolder == null)
      return "book available on shelves";
    return "Holder: "+currentHolder+ "\nDue date is: " + dueDate;
  }
  
  public String getCurrentHolder(){
    return currentHolder;
  }
  public String getDueDate(){
    return dueDate;
  }
  public void setCurrentHolder(String a){
    currentHolder=a;
  }
  public void setDueDate(String a){
    dueDate = a;
  }
  
  public void checkout(String a, String b){
    currentHolder = a;
    dueDate = b;
  }
  public void returned(){
    currentHolder = null;
    dueDate = null;
  }
  
  public String toString(){
    if(currentHolder != null)
      return super.toString() + "\n current holder: "+ currentHolder + "\n due date: "+dueDate;
    return super.toString() + "\n the book is on the shelfs";
  }
    
    
  
}