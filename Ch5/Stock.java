public class Stock{
  int arrival;
  String name;
  double price;
  
  public Stock(int arrival, String name, double price){
    this.arrival = arrival;
    this.name = name;
    this.price = price;
  }
  
  public String toString(){
    return name+", Arrival: "+getArrivalFormat()+" $"+price;
  }
  
  public String getArrivalFormat(){
    return ""; // implement method
  }
  
}