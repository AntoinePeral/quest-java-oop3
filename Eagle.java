public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    @Override
    public void descend(int meters) {
        if(this.altitude < meters){
            System.out.println(this.getName() + " can't go underground.");
            return;
        }
        this.setAltitude(this.altitude - meters);
        System.out.println(this.getName()+ " flies downward, altitude: " + this.altitude);
    }

    @Override
    public void ascend(int meters) {
        this.setAltitude(this.altitude + meters);
        System.out.println(this.getName()+ " flies upward, altitude: " + this.altitude);
    }
    
    @Override
    public void takeOff() {
        if(this.altitude == 0 && !this.flying) {
            System.out.println(this.flying);
            System.out.println(this.getName() + " takes off in the sky.");
            this.setFlying();
        }
    }

    @Override
    public void land() {
        if(this.flying && this.altitude> 1){;
            System.out.println(this.getName() + " is too high, it can't land.");
        } else{
            System.out.println(this.getName() + " lands on the ground.");
            this.setFlying();
        }  
    }

    @Override
    public void glide() {
        System.out.println(this.getName() + " glides into the air.");
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(){
        this.flying = !this.flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}
