/**
 * The Conductor class represents a train conductor with a name, age, and years of experience.
 */
public class Conductor{
    private String name;
    private int age;
    private int experience;

    /**
     * Constructs a Conductor with the specified name, age, and experience.
     *
     * @param name       the name of the conductor
     * @param age        the age of the conductor
     * @param experience the years of experience the conductor has
     */
    public Conductor(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    /**
     * Constructs a Conductor with the specified name. The age is set to 21 and experience is set to 0 by default.
     *
     * @param name the name of the conductor
     */
    public Conductor(String name) {
        this.name = name;
        this.age = 21;
        this.experience = 0;
    }

    /**
     * Gets the name of the conductor.
     *
     * @return the name of the conductor
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the conductor.
     *
     * @return the age of the conductor
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the years of experience of the conductor.
     *
     * @return the years of experience of the conductor
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Sets the name of the conductor.
     *
     * @param name the new name of the conductor
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the conductor.
     *
     * @param age the new age of the conductor
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the years of experience of the conductor.
     *
     * @param experience the new years of experience of the conductor
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
    /**
     * Returns a string representation of the Conductor object.
     *
     * @return a string containing the name, age, and years of experience of the conductor
     */
    @Override
    public String toString() {
        return "Conductor {Name='" + name + "', Age=" + age + ", Experience=" + experience + "}";
    }
}
