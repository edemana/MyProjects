public class Planets {
    /**
     * Attributes Behaviour
     * 1. Name of planet
     * 2. Radius
     * 3. Distance from a particular Star
     * 4. Habitable or not
     * 5. Revolution time
     * 6. Maximum Temperature
     * 7. Number of moons
     * 8. Explored or not
     * 9. Gravitational Force
     * 10. Surface Area of Planet
     * 
     */
    private String name;
    private double rad;
    private double distFromSun;
    private boolean habitable;
    private double revTime;
    private double maxTemp;
    private int moonNumber;
    private boolean explorStats;
    private double gravForce;
    private double surfArea;

    /**
     * Planets is a constructor with parameters below
     * 
     * @param name
     * @param rad
     * @param distFromSun
     * @param habitable
     * @param revTime
     * @param maxTemp
     * @param moonNumber
     * @param explorStats
     * @param gravForce
     */
    public Planets(String name, double rad, double distFromSun, boolean habitable, double revTime, double maxTemp,
            int moonNumber, boolean explorStats, double gravForce) {
        this.name = name;
        this.rad = rad;
        this.distFromSun = distFromSun;
        this.habitable = habitable;
        this.revTime = revTime;
        this.maxTemp = maxTemp;
        this.moonNumber = moonNumber;
        this.explorStats = explorStats;
        this.gravForce = gravForce;

    }

    /**
     * ToString Method
     * This method returns a sentence that tells the surfaces area of the planet.
     */
    public String toString() {

        return (name + " is a planet in the milky way galaxy that has a surface area of " + setSurfArea(rad) + "km^2.");
    }

    /*
     * Accessor Methods
     */
    public String getName() {
        return name;
    }

    public double getRadius() {
        return rad;
    }

    public double getDistfromSun() {
        return distFromSun;
    }

    public boolean getHabitable() {
        return habitable;
    }

    public double getRevTime() {
        return revTime;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public long getMoonNumber() {
        return moonNumber;
    }

    public boolean getExplorStats() {
        return explorStats;
    }

    public double getGravForce() {
        return gravForce;
    }

    /*
     * Mutator Methods
     */
    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setGravForce(double gravForce) {
        this.gravForce = gravForce;
    }

    public double setSurfArea(double rad) {
        surfArea = 4 * Math.PI * Math.pow(this.rad, 2);
        return surfArea;

    }
}
