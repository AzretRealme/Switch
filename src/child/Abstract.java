package child;

import parent.Range;

public abstract class Abstract {
    private String name;
    private Range range;

    public Abstract() {

    }
    public Abstract(String name, Range range) {
        this.name = name;
        this.range = range;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printDeveloperGrade();


}
