package library;

public class Book{
  
  String author;
  String title;
  String isbn;
  
  public Book(){
   this("author","title","-1");
  }
  public Book(String a, String b, String c){
    author = a;
    title = b;
    isbn = c;
  }
  
  public void setAuthor(String a){
    author = a;
  }
  public void setTitle(String a){
    title = a;
  }
  public void setISBN(String a){
    isbn=a;
  }
  public String getAuthor(){
    return author;
  }
  public String getTitle(){
    return title;
  }
  public String getISBN(){
    return isbn;
  }
  
  public String toString(){
    return "Author: "+ author+"\nTitle: "+title+"\n ISBN: " + isbn;
  }
}
  
  