/*
 * The stack program
 *
 * By:      Devin Jhu
 * Version: 1.0
 * Since:   2022-11-04
 */

/**
 * Vehicle Class.
 */
public class Vehicle {

    /**
     * Vehicle speed.
     */
    private int speed;

    /**
     * License plate number.
     */
    private String licensePlate;

    /**
     * Vehicle color.
     */
    private String color;

    /**
     * Number of doors.
     */
    private int doorNumber;

    /**
     * Vehicle speed.
     */
    private int maxSpeed;

    /**
     * Vehicle Constructor - main implements variables values.
     *
     * @param licensePlate - license plate number
     * @param color - color of the car
     * @param doorNumber - number of doors
     * @param maxSpeed - maximum speed achievable
     */
    public Vehicle(
        String licensePlate,
        String color,
        int doorNumber,
        int maxSpeed) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.doorNumber = doorNumber;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Status() method - prints all curvalues.
     */
    public void status() {
        System.out.println("");
        System.out.println("    -> Speed: " + this.speed);
        System.out.println("    -> Max Speed: " + this.maxSpeed);
        System.out.println("    -> Number of Doors: " + this.doorNumber);
        System.out.println("    -> License Plate: " + this.licensePlate);
        System.out.println("    -> Color: " + this.color);
        System.out.println("");
    }

    /**
     * GetLicensePlate() method - returns licensePlate value.
     *
     * @return licensePlate
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * SetLicensePlate() method - changes license plate value.
     *
     * @param licensePlateInput - input from Main to replace licensePlate
     */
    public void setLicensePlate(String licensePlateInput) {
        this.licensePlate = licensePlateInput;
    }

    /**
     * GetColor() method - returns color value.
     *
     * @return color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * SetColor() method - changes color value.
     *
     * @param colorInput - input from Main to replace color
     */
    public void setColor(String colorInput) {
        this.color = colorInput;
    }

    /**
     * GetDoorCount() method - returns doorCount value.
     *
     * @return doorCount
     */
    public int getDoorNumber() {
        return this.doorNumber;
    }

    /**
     * GetMaxSpeed() method - returns maxSpeed value.
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * GetSpeed() method - returns speed value.
     *
     * @return speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Accelerate() method - increases the speed of the vehicle.
     *
     * @param accelPower - power of the acceleration
     * @param accelTime - time to accelerate for
     */
    public void accelerate(int accelPower, int accelTime) {
        this.speed += accelPower * accelTime;
        if (!(this.speed < this.maxSpeed)) {
            this.speed = this.maxSpeed;
        }
    }

    /**
     * Breaking() method - decreases the speed of the vehicle.
     *
     * @param breakPower - power of the break
     * @param breakTime - time to break for
     */
    public void breaking(int breakPower, int breakTime) {
        this.speed -= breakPower * breakTime;
        if (!(this.speed >= 0)) {
            this.speed = 0;
        }
    }
}
