import java.util.Scanner;
//e.l
public class superArray {
  private int[] array;

  public superArray(int a){
    this.array = new int[10];
    System.out.println(this.array.length);
  }

  public superArray(){
    this.array = new int[10];
    System.out.println(this.array.length);
  }

  public void add(int value){
    for (int i = 0; i < this.array.length; i++){
      if (array[i] == 0){
        array[i] = value;
        return;
      }
    }
    grow(1);
    int lastNumber = this.array.length - 1;
    this.array[lastNumber] = value;
  }

  public void add(int ind, int value){

  }

  public void grow(int b){
    int[] tempArray = new int[this.array.length];
    for (int i = 0; i < this.array.length; i++){
      tempArray[i] = this.array[i];
    }

    this.array = new int[b + this.array.length];
    for (int i = 0; i < tempArray.length; i++){
      this.array[i] = tempArray[i];
    }
  }
}
