class Battery {
    private int capacity;
    public Battery(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
}
    class Mobile{
      private Battery battery;
      public Mobile(int batteryCapacity){
        this.battery = new Battery(batteryCapacity);
      }
      public void showBatteryCapacity(){
        System.out.println("Capacity:" + battery.getCapacity());
      }
    } 
public class composition{
  public static void main (String[] args) {
    Mobile r=new Mobile(4000);
    r.showBatteryCapacity();

  }
}
   
