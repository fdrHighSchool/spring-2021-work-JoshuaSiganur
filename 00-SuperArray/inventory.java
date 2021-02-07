public class inventory{
  private superArray myInventory;

  public inventory(int size){
    this.myInventory = new superArray(size);
  }

  public void gainThing(int amount){
    this.myInventory.add(amount);
  }

  public void discardThing(int where){
    this.myInventory.remove(where);
  }

  public String toString(){
    return ("This is your inventory: " + myInventory.toString());
  }
}
