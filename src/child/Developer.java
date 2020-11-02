package child;

import parent.Range;

public class Developer extends Abstract{
        private String name;
        private Range range;

       public Developer() {

        }
        public Developer(String name, Range range) {
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

        public void printDeveloperGrade(){
            System.out.println(name);
        }

    }

