package library;

public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
  String callNumber;
  
  public LibraryBook(String a, String b, String c, String d){
    super(a,b,c);
    callNumber =d;
  }
  
  public void setCallNumber(String a){
    callNumber = a;
  }
  public String getCallNumber(){
    return callNumber;
  }
  
  abstract String circulationStatus();
  abstract void checkout(String patron, String dueDate);
  abstract void returned();
  
  
  
  public String toString(){
    return super.toString() + "\n"+circulationStatus()+"\nThe call number is "+ callNumber;
  }
  public int compareTo(LibraryBook lib){
    return callNumber.compareTo(lib.getCallNumber());
  }
    
    
  
  
  
}