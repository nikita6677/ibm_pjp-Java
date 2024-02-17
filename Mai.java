//Is-a relationship in Java example
public class Mai {
    public static void main(String[] args) { 
        Device device = new Tablet(); 
        System.out.println("Device name is Tablet"); 
        device.setDeviceName("Tablet"); 
        System.out.println(device.getDeviceName()); 
    } 
}
class Device { 
    private String deviceName;

    public void setDeviceName(String deviceName) { 
        this.deviceName = deviceName; 
    } 

    public String getDeviceName() { 
        return this.deviceName + " is a Device"; 
    } 
}

class Tablet extends Device { 
    // Tablet class without the main method
}

