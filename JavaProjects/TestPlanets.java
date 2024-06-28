public class TestPlanets {
    public static void main(String[] args) {

        Planets Earth = new Planets("Earth", 6371.0, 149.6, true, 365.25, 58.24, 1, true, 9.81);

        System.out.println("Name: " + Earth.getName());
        System.out.println("Radius: " + Earth.getRadius() + " km");
        System.out.println("Distance from Sun: " + Earth.getDistfromSun() + " million km");
        System.out.println("Revolution Time: " + Earth.getRevTime() + " days");
        System.out.println("Maximum Temperature: " + Earth.getMaxTemp() + " °C");
        System.out.println("Number of Moons: " + Earth.getMoonNumber());
        System.out.println("Explored: " + Earth.getExplorStats());
        System.out.println("Gravitational Force: " + Earth.getGravForce() + " m/s^2");
        System.out.println(Earth.toString());
    }

}