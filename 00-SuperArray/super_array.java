import java.util.Scanner;

public class superArray {
  private int[] array;

  public superArray(int a){ //makes the actual array where the values are inputted, this one is if a value is given
    this.array = new int[a];
    System.out.println(this.array.length);
  }

  public superArray(){ ////makes the actual array where the values are inputted, this one is if no value is given
    this.array = new int[10];
    System.out.println(this.array.length);
  }

  public void add(int value){ //this adds the value the user inputs to the array
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
    grow(1); //which requires I use the grow method to increase the size of the array
    for (int i = this.array.length - 1; i > ind; i--){
      this.array[i] = this.array[i - 1];
    }
    this.array[ind] = value;
  }

  public void grow(int b){ //this "grows" the array by making a temporary one then moving the results to the new and bigger one
    int[] tempArray = new int[this.array.length];
    for (int i = 0; i < this.array.length; i++){
      tempArray[i] = this.array[i];
    }

    this.array = new int[b + this.array.length];
    for (int i = 0; i < tempArray.length; i++){
      this.array[i] = tempArray[i];
    }
  }

  public void set(int x, int value){ //this sets the value at a specific spot in the array
    this.array[x] = value;
  }
}
