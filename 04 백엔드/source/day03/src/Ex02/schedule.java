package Ex02;

public class schedule {
  private int year;
  private int month;
  private int day;// 통제 불가


  public void setYear(int _year){
    year = _year;
  }
  public void setMonth(int _month){
    month =_month;
  }
  public void setDay(int _day){
    if(month == 2 && _day >2){

    }
    day = _day;
  }

  public int getYear(int _year){

    return _year;
  }
  public int getMonth(int _month){
    return _month;
  }
  public int  getDay(int _day){
    return _day;
  }

  void showDate(){
      System.out.printf("year=%d, month= %d, day=%d%n", year,month, day);
  }

}
