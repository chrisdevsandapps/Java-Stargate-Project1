/*
 *
 * enum from sdpt channel
 * https://www.youtube.com/watch?v=D4ZEbQ6v2Zk
 * 
 */


public class App01 {
    public static void main(String[] args) throws Exception {
        System.out.println("enum from sdpt-sln-channel\n");
    
        xxx111();

        spacer();

        xxx222();

        spacer();

        xxx333();

        spacer();

        xxx444();

        spacer();
    }

    public static void xxx111() {
        // using enumn in if-else-statements

        AiLevel level = AiLevel.EASY;
        // AiLevel level = AiLevel.MEDIUM;
        // AiLevel level = AiLevel.HARD;
        System.out.println("level: " + level);

        if (level == AiLevel.EASY) {
            System.out.println("EASY");
        } else if (level == AiLevel.MEDIUM) {
            System.out.println("MEDIUM");
        } else if (level == AiLevel.HARD) {
            System.out.println("HARD");
        }
    }

    public static void xxx222() {
        // using enum in switch statements

        AiLevel level = AiLevel.EASY;
        // AiLevel level = AiLevel.MEDIUM;
        // AiLevel level = AiLevel.HARD;

        switch (level) {
            case EASY: 
                System.out.println("EASY");
                break;
            case MEDIUM:
                System.out.println("MEDIUM");
                break;
            case HARD:
                System.out.println("HARD");
                break;
        }

    }

    public static void xxx333() {
        UsCurrency money = UsCurrency.PENNY;
        // UsCurrency money = UsCurrency.NICKLE;
        // UsCurrency money = UsCurrency.DIME;
        // UsCurrency money = UsCurrency.QUARTS;

        System.out.println("money value: " + money.value);


        float oneDollar = 1.00f;
        float xxx = (float)money.value + oneDollar;
        System.out.println("add to one dollar: " + xxx);
    }

    public static void xxx444() {
        // using enum in arrays

        UsCurrency coins[] = new UsCurrency[4];
        coins[0] = UsCurrency.DIME;
        coins[1] = UsCurrency.QUARTS;
        coins[2] = UsCurrency.NICKLE;
        coins[3] = UsCurrency.PENNY;

        float sum = 0f;

        for (UsCurrency item : coins) {
            sum  = sum + item.value;
        }

        System.out.println("value: " + sum);
    }

    static void spacer() {
        System.out.println(" ");
        System.out.println("###############################################");
        System.out.println("###############################################");
        System.out.println(" ");
    }
}




/* ********************************************************************** */
/* ********************************************************************** */
/* ********************************************************************** */
/* ********************************************************************** */
/* ********************************************************************** */
enum AiLevel {
    EASY,
    MEDIUM,
    HARD
}


/* ********************************************************************** */
/* ********************************************************************** */
/* ********************************************************************** */
/* ********************************************************************** */
/* ********************************************************************** */
// declaring enums with values
enum UsCurrency {
    PENNY(0.01f),
    NICKLE(0.04f),
    DIME(0.1f),
    QUARTS(0.25f);

    float value;

    UsCurrency(float value) {
        this.value = value;
    }
}


// TODO: https://youtu.be/D4ZEbQ6v2Zk?t=1532
// enum na may name