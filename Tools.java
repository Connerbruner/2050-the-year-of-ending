import java.util.Scanner;

class Tools {
    
    
    int tSpeed;
    //the Colors of gay
    public static final String GO_BACK = "\"\\u001B[A\"";
    public static final String SCREEN_CLEAR = "\033[H\033[2J";
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
        String[] colors = new String[]{RED,GREEN,BLUE,PURPLE,CYAN};

    Scanner scanner = new Scanner(System.in);
    public boolean isGay = false;

    public void setTSpeed(int num) {
        tSpeed = num;
    }

    public int random(int low, int high) {
        int range = high - low + 1;
        return (int) (Math.random() * range) + low;
    }

    //print method
    public void sPrintln(String str) {
        //if 2069 is talking BLUE
        if (isGay) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)); 
            System.out.print(colors[i%colors.length]);
                wait(tSpeed);
            }
        } else if (str.contains("2069:")) {
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(BLUE + str.charAt(i));
                    wait(tSpeed);
                }
            }

        //if 2077 is talking CYAN
        else if (str.contains("2077:")) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(CYAN + str.charAt(i));
                wait(tSpeed);
            }

        }
        //Tech giant talking RED
        else if (str.contains("Mark Zuckerberg:") || str.contains("Elon musk:") || str.contains("Bill gates:") || str.contains("Jeff bezos:")) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(RED + str.charAt(i));
                wait(tSpeed);
            }
        }
        //if sounds then
        else if (str.contains("*")) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(GREEN + str.charAt(i));
                wait(tSpeed);
            }
        }
        //??? talks
        else if (str.contains("???:")) {
            for (int i = 0; i < str.length(); i++) {
                if (random(0, 15) == 10) {
                    System.out.print((char) (random(0, 256)));
                } else {
                    System.out.print(PURPLE + str.charAt(i));
                }
                wait(tSpeed);
            }
        }
        //Anyhthing else
        else {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                wait(tSpeed);
            }
        }
        System.out.println();
        System.out.println(RESET);
        System.out.println("> enter <");
        scanner.nextLine();
    }

    public void wait(int time) {
        long startTime = System.currentTimeMillis();
        while (startTime + time > System.currentTimeMillis()) ;
    }

    public void sPrint(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            wait(tSpeed);
        }
        System.out.println();


    }
}