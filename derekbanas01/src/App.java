

public class App {
    
    static String randomString = "this is a string hahaha!";

    static final double PiValue = 3.141529;

    static void spacer() {
        System.out.println("###############################################");
        System.out.println("###############################################");
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println("LESSON 01");

        System.out.println("Hello, World!");

        System.out.println(randomString);

        System.out.println(PiValue);

        spacer();

        int integerOne = 33;
        int integerTwo = integerOne + 100;

        System.out.println("integerOne: " + integerOne);
        System.out.println("integerTwo: " + integerTwo);

        spacer();

        System.out.println("maximum size  for float: \t" + Float.MAX_VALUE);
        System.out.println("maximum size  for double: \t" + Double.MAX_VALUE);
        System.out.println("maximum size  for int: \t\t" + Integer.MAX_VALUE);
        System.out.println("maximum size  for long: \t" + Long.MAX_VALUE);


        spacer();


        char randomChar = 65;
        char randomCharToo = 'A';
        System.out.println("randomCharUsingNumber: " + randomChar);
        System.out.println("randomCharUsingLetter: " + randomCharToo);


        spacer();

        
        // random string is technically an object, see syntax below:
        System.out.println("random string is technically an object, see syntax below:");
        String someString = "i am the greatest and happiest and most fulfilled!!!";
        String stringToo = "wazzup!!!";

        System.out.println(someString);
        System.out.println(stringToo);

        System.out.println("combined:");
        System.out.println(stringToo + ' ' + someString);


        spacer();


        // convert a byte to string
        byte someByte123 = 65;
        String byteString = Byte.toString(someByte123);
        System.out.println("byte to string: " + byteString);
        // pause muna itong ibang text sa timeline na ito: 
        // https://youtu.be/TBWX97e1E9g?t=896


        spacer();


        // converting to one primitive type to another (casting)
        double double123 = 234.9384574;
        int doubleToInt123 = (int)double123;
        System.out.println("original double var: " + double123);
        System.out.println("casting from double to int: " + doubleToInt123);


        // what happens if double is bigger than the int:
        double double234 = 742384723948237484234.423432423;
        int doubleToInt234 = (int)double234;
        System.out.println("original double var: " + double234);
        // it will put as many value as it can hold, 
        // which is the maximum value of an a signed int:  2147483647
        System.out.println("casting from double to int: " + doubleToInt234);
        /* other castings available: (double), (float), etc */

        spacer();


        // how to turn a string into one datatypes
        String someString123 = "2323";
        int stringToInt123 = Integer.parseInt(someString123);
        System.out.println("stringToInt123: " + stringToInt123);
        /* 
        other parse available: 
            parseShort, 
            parseLong, 
            parseByte, 
            parseFloat, 
            parseDouble,
            parseBoolean 
        */
    }

}


/*
 * byte bigByte = 127
 * short bigShort = 32767
 * int bigInt = 2.1 billion
 * long bigLong = 920000000000000000L;
 * float bigFloat = 3.14F
 * double bigFloat = 3.14163489573489573;
 * 
 * boolean isTrue = true;
 * boolean isFalse = false;
 * 
 * char randomChar = 65;
 * char randomCharToo = 'A';
 * 
 * 
 * escape characters:
 * backspace \b
 * formfeed \f
 * tab \t
 * line feed \n
 * carriage return \r
 * double quote \"
 * sinngle quote \'
 */