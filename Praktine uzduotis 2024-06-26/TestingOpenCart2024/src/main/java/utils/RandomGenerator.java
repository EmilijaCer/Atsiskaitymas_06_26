package utils;

import java.util.Random;

public class RandomGenerator {

    public static String generateRandomUserName() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000) + "Tom";

    }

    //Random first Name//

//    public static String generateRandomFirstName() {
//        // Create a Random object to generate random numbers
//        Random randomGenerator = new Random();
//        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
//        int randomNumber = randomGenerator.nextInt(100);
//        // Concatenate the random number with the string "Task"
//        return "Tom" + "." + randomNumber;
//    }
    //Random first Name//
        public static String generateRandomFirstName() {
        // Create a Random object to generate random numbers
        Random randomGenerator = new Random();
        // Generate a random integer between 0 (inclusive) and 26 (exclusive)
        int randomIndex = randomGenerator.nextInt(26);
        // Convert the randomIndex to a corresponding letter (a-z)
        char randomLetter = (char) ('a' + randomIndex);
        char randomLetter1 = (char) ('c' + randomIndex);
        // Concatenate the random letter with the base name "Tom"
        return "Tom"  + randomLetter + randomLetter1 + ".";
    }
    //Random Last Name
        public static String generateRandomLastName() {
        // Create a Random object to generate random numbers
        Random randomGenerator = new Random();
        // Generate a random integer between 0 (inclusive) and 26 (exclusive)
        int randomIndex = randomGenerator.nextInt(26);
        // Convert the randomIndex to a corresponding letter (a-z)
        char randomLetter = (char) ('a' + randomIndex);
       char randomLetter2 = (char) ('d' + randomIndex);
        char randomLetter3 = (char) ('c' + randomIndex);
        char randomLetter4 = (char) ('k' + randomIndex);
        // Concatenate the random letter with the base name "Tom"
        //return "Sab"  + randomLetter + randomLetter2  + randomLetter3  + randomLetter4 + ".";
        return "Sab"  + randomLetter + "Test" + randomLetter2 + ".";
    }
    //Random Email
    public static String generateRandomEmail() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(1000); // Generate a random number
        String username = "user" + randomNumber; // Generate a random username
        String domain = "mail.com"; // Domain name
        return username + "@" + domain;
    }
    //Random Password
public static String generateRandomPasswordV2() {
    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(1000); // Generate a random number
    String userAdmin = "Admin" + randomNumber; // Generate a random username
    String domain = "ROOT"; // Domain name
    return userAdmin + domain + "@" + ".";
}





}

// public static String generateRandomUserName() {
//        Random randomGenerator = new Random();
//        return randomGenerator.nextInt(1000) + "Tom";
//
//}
////    public static String generateRandomEmail() {
////        Random randomGenerator = new Random();
////        return randomGenerator.nextInt(1000) + "random@mail.com";
////
////    }
//
////    //Random first Name//
//
////    public static String generateRandomFirstName() {
////        // Create a Random object to generate random numbers
////        Random randomGenerator = new Random();
////        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
////        int randomNumber = randomGenerator.nextInt(100);
////        // Concatenate the random number with the string "Task"
////        return "Tom" + "." + randomNumber;
////    }
//    public static String generateRandomFirstName() {
//        // Create a Random object to generate random numbers
//        Random randomGenerator = new Random();
//        // Generate a random integer between 0 (inclusive) and 26 (exclusive)
//        int randomIndex = randomGenerator.nextInt(26);
//        // Convert the randomIndex to a corresponding letter (a-z)
//        char randomLetter = (char) ('a' + randomIndex);
//        // Concatenate the random letter with the base name "Tom"
//        return "Tom"  + randomLetter + ".";
//    }
//
//    //Random Last Name
////    public static String generateRandomLastName(){
////        Random randomGenerator = new Random();
////        int randomNumber = randomGenerator.nextInt(100);
////        return "Sab" + "." + randomNumber;
////    }
//    public static String generateRandomLastName() {
//        // Create a Random object to generate random numbers
//        Random randomGenerator = new Random();
//        // Generate a random integer between 0 (inclusive) and 26 (exclusive)
//        int randomIndex = randomGenerator.nextInt(26);
//        // Convert the randomIndex to a corresponding letter (a-z)
//        char randomLetter = (char) ('a' + randomIndex);
//       char randomLetter2 = (char) ('d' + randomIndex);
////        char randomLetter3 = (char) ('c' + randomIndex);
////        char randomLetter4 = (char) ('k' + randomIndex);
//        // Concatenate the random letter with the base name "Tom"
//        //return "Sab"  + randomLetter + randomLetter2  + randomLetter3  + randomLetter4 + ".";
//        return "Sab"  + randomLetter + "Test" + randomLetter2 + ".";
//    }
//
//    //Random Email
//    public static String generateRandomEmail() {
//        Random randomGenerator = new Random();
//        int randomNumber = randomGenerator.nextInt(1000); // Generate a random number
//        String username = "user" + randomNumber; // Generate a random username
//        String domain = "mail.com"; // Domain name
//        return username + "@" + domain;
//    }
//
////    public static class PasswordGeneratorV3 {
////        private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
////        private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
////        private static final String NUMBER = "0123456789";
////        private static final String OTHER_CHAR = "!@#$%&*()_+-=[]?";
////
////        private static final String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER + OTHER_CHAR;
////        private static SecureRandom random = new SecureRandom();
////
////        public static String generateRandomPassword(int length) {
////            if (length < 1) throw new IllegalArgumentException();
////
////            StringBuilder sb = new StringBuilder(length);
////            for (int i = 0; i < length; i++) {
////                int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
////                char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);
////                sb.append(rndChar);
////            }
////            return sb.toString();
////        }
////        public static void main(String[] args) {
////            int passwordLength = 12;
////            System.out.println("Random Password: " + generateRandomPassword(passwordLength));
////        }
////    }
////Random Password
//public static String generateRandomPasswordV2() {
//    Random randomGenerator = new Random();
//    int randomNumber = randomGenerator.nextInt(1000); // Generate a random number
//    String userAdmin = "Admin" + randomNumber; // Generate a random username
//    String domain = "ROOT"; // Domain name
//    return userAdmin + domain + "@" + ".";
//}
//
//
//
//
//
//
//
//}
//
//
//
//
////package utils;
////
////import java.time.LocalDate;
////import java.util.Random;
////
////public class RandomGenerator {
////    public static String generateRandomUserName() {
////        Random randomGenerator = new Random();
////        return randomGenerator.nextInt(1000) + "Karina";
////
////    }
////
////    public static String generateRandomEmail() {
////        Random randomGenerator = new Random();
////        return randomGenerator.nextInt(1000) + "random@mail.com";
////
////    }
////
////    public static String generateRandomPass() {
////        Random randomGenerator = new Random();
////        return randomGenerator.nextInt(1000) + "Selenium@9";
////
////    }
////
////    //Random Project Name
////    public static String generateRandomProjectName() {
////        Random randomGenerator = new Random();
////        return randomGenerator.nextInt(1000) + "Proj";
////    }
////
////    //Random Project Description
////    public static String generateRandomProjectDescription() {
////        Random randomGenerator = new Random();
////        return randomGenerator.nextInt(1000) + "Description";
////    }
////
////    //Random Task Name//
//////    public static String generateRandomProjectTaskName() {
//////        Random randomGenerator = new Random();
//////        return randomGenerator.nextInt(100) + "Task";
//////    }
////    public static String generateRandomProjectTaskName() {
////        // Create a Random object to generate random numbers
////        Random randomGenerator = new Random();
////        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
////        int randomNumber = randomGenerator.nextInt(100);
////        // Concatenate the random number with the string "Task"
////        return "Task" + " " + randomNumber;
////    }
////
////
////    //Random Task Description//
//////    public static String generateRandomProjectTaskDescription() {
//////        Random randomGenerator = new Random();
//////        return randomGenerator.nextInt(100) + "Description";
//////    }
////    public static String generateRandomProjectTaskDescription() {
////        // Create a Random object to generate random numbers
////        Random randomGenerator = new Random();
////        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
////        int randomNumber = randomGenerator.nextInt(100);
////        // Concatenate the random number with the string "Description"
////        return "Description" + " " + randomNumber;
////    }
////    //Generate random date
//////    public static String generateRandomDate() {
//////    }
//////
//////import java.time.LocalDate;
//////import java.util.Random;
//////
//////    public class Main {
//////        public static void main(String[] args) {
//////            // Generate a random date
//////            LocalDate randomDate = generateRandomDate();
//////
//////            // Output the generated date
//////            System.out.println("Generated Date: " + randomDate);
//////
//////            // Format the date to "MM/dd/yyyy" and output
//////            String formattedDate = randomDate.getMonthValue() + "/" + randomDate.getDayOfMonth() + "/" + randomDate.getYear();
//////            System.out.println("Formatted Date: " + formattedDate);
//////        }
//////
//////        public static LocalDate generateRandomDate() {
//////            // Get the current year
//////            int currentYear = LocalDate.now().getYear();
//////
//////            // Generate a random year between the current year and the next 10 years
//////            Random random = new Random();
//////            int randomYear = currentYear + random.nextInt(11);
//////
//////            // Generate a random month and day within the valid ranges
//////            int randomMonth = random.nextInt(12) + 1; // Adding 1 because months are 1-based
//////            int randomDay = random.nextInt(31) + 1;   // Adding 1 because days are 1-based
//////
//////            // Construct and return the LocalDate object
//////           // return LocalDate.of(randomYear, randomMonth, randomDay);
//////            return LocalDate.of(randomMonth, randomDay, randomYear);
//////        }
//////    }
////
////
////
//////    public static String generateRepeatRandomPass() {
//////        Random randomGenerator = new Random();
//////        return randomGenerator.nextInt(1000) + "Selenium@9";
//////    }
////
//////    public static String generateRandomRegisteredUserName() {
//////        Random randomGenerator = new Random();
//////        return randomGenerator.nextInt(1000) + "Karina";
//////    }
////
//////    public static String generateRandomRegisteredUserPassword() {
//////        Random randomGenerator = new Random();
//////        return randomGenerator.nextInt(1000) + "Selenium@9";
//////    }}
////}
