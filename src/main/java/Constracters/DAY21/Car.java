package Constracters.DAY21;

public class Car {

String make ="Honda";
String model="Accord";
int jear =2023;


Car(String make ,String model,int jear){
    this.make=make;
    this.model=model;
    this.jear=jear;

}// kontraktir

    Car(String make ){
        this.make=make;


    }// kontraktir


  @Override
  public String toString() {
    return "Car{" +
            "make='" + make + '\'' +
            ", model='" + model + '\'' +
            ", jear=" + jear +
            '}';
  }
}// class
