package dk.kea;

import java.util.List;

public abstract class Orbital {
    private String name;
    private List<Orbital> orbitalBodies;
    private Orbital orbital;

    public Orbital() {
    }

    public Orbital(String name, List<Orbital> orbitalBodies, Orbital orbital) {
        this.name = name;
        this.orbitalBodies = orbitalBodies;
        this.orbital = orbital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Orbital> getOrbitalBodies() {
        return orbitalBodies;
    }

    public void setOrbitalBodies(List<Orbital> orbitalBodies) {
        this.orbitalBodies = orbitalBodies;
    }

    public Orbital getOrbital() {
        return orbital;
    }

    public void setOrbital(Orbital orbital) {
        this.orbital = orbital;
    }
}
