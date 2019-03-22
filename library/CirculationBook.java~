package library;


public class CirculationBook extends LibraryBook{
  String currentHolder,dueDate;
  public CirculationBook(Sring a,String b, String c, String d){
    super(a,b,c,d);
  }
  
  public String circulationStatus(){
    if(currentHolder == null)
      return "book available on shelves";
    return "Holder: "+currentHolder+ "\nDue date is: " + dueDate;
  }
  
}