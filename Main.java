/*
* The MrCoxallStack.
*
* @author  Devin Jhu
* @version 1.0
* @since   2022-11-04
*/

/**
 * This is a program that runs with Vehicle.java
*/

final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final int two = 2;
        final int four = 4;
        final int five = 5;
        final int ten = 10;
        final int hundred = 100;

        // Create Ford Focus
        System.out.println("Created Ford Focus");
        final Vehicle fordFocus = new Vehicle("B40-C4RR0", "white", 4, 284);

        System.out.println("Ford Focus Status:");
        fordFocus.status();

        System.out.println("Accelerating, 10 of power for 10 sec.");
        fordFocus.accelerate(ten, ten);
        System.out.println("New Ford Focus speed: " + fordFocus.getSpeed());

        System.out.println("Changing color to black:");
        fordFocus.setColor("black");
        System.out.println("New Ford Focus coloration: "
                        + fordFocus.getColor());

        // Create Ferrari
        System.out.println("");
        System.out.println("Created Ferrari");
        final Vehicle ferrari = new Vehicle("VHD-35HU", "red", 2, 320);

        System.out.println("Ferrari Status:");
        ferrari.status();

        System.out.println("Accelerating, 100 of power for 4 sec.");
        ferrari.accelerate(hundred, four);
        System.out.println("New Ferrari speed: " + ferrari.getSpeed());

        System.out.println("Breaking, 10 of power for 10 sec.");
        ferrari.breaking(ten, ten);
        System.out.println("New Ferrari speed after brakes: "
                        + ferrari.getSpeed());

        System.out.println("Changing color to racing red:");
        ferrari.setColor("racing red!");
        System.out.println("New Ferrari coloration: " + ferrari.getColor());

        // Create Citroen Ami
        System.out.println("");
        System.out.println("Created Citroen Ami");
        final Vehicle citroenAmi = new Vehicle("FS-695-DQ", "blue", 2, 45);

        System.out.println("Citroen Ami Status:");
        citroenAmi.status();

        System.out.println("Accelerating, 5 of power for 10 sec.");
        citroenAmi.accelerate(five, ten);
        System.out.println("New Citroen Ami speed: " + citroenAmi.getSpeed());

        System.out.println("Breaking, 2 of power for 10 sec.");
        citroenAmi.breaking(two, ten);
        System.out.println("New Citroen Ami speed after brakes: "
                        + citroenAmi.getSpeed());

        System.out.println("Changing color to purple:");
        citroenAmi.setColor("purple");
        System.out.println("New Citroen Ami coloration: "
                        + citroenAmi.getColor());

        System.out.println("\nDone.");
    }
}
