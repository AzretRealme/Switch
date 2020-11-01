import child.*;
import parent.Range;

import static parent.Range.*;

//import static parent.Range.*;
//import parent.Range;


public class Main {
    public static void main(String[] args) {

       Developer[] developers = new Developer[]{new Developer("I am Junior Developer", JUNIOR),
                new Developer("I am Senior Developer", SENIOR),
                new Developer("I am Middle Developer", MIDDLE),
                new Developer("I am Teamlead Developer", TEAMLEAD)};

/* for (Developer java : developers) {
            java.printDeveloperGrade();
        }*/


    }

    public  static void printDeveloperGrade (Developer developers){
            //Developer developers = new Developer(Range.JUNIOR);
    switch (developers.getRange()) {
        case JUNIOR:
            //developers.printDeveloperGrade("I am junior developer");
            System.out.println("I am junior developer");
            break;
        case SENIOR:
            System.out.println("I am senior developer");
            break;
        case MIDDLE:
            System.out.println("I am middle developer");
            break;
        case TEAMLEAD:
            System.out.println("I am teamlead developer");
            break;
        default:
            System.out.println("THE END");
            break;
    }
            
        }

    }

