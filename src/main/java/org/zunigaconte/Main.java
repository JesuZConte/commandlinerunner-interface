package org.zunigaconte;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main implements CommandLineRunner {

//    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);
//    }
//
//    @Bean
//    public CommandLineRunner run() {
//        return args -> {
//            for (int i = 1; i < 101; i++) {
//                String result = "";
//                result += (i % 3) == 0 ? "Fizz" : "";
//                result += (i % 5) == 0 ? "Buzz" : "";
//                System.out.println(!result.isEmpty() ? result : i);
//            }
//        };
//    }

    public static void main(String[] args) {
        String[] numbers = new String[100];
        for (int i = 1; i < 101; i++) {
            numbers[i - 1] = String.valueOf(i);
        }

        SpringApplication.run(Main.class, numbers);
    }

    @Override
    public void run(String... args) {

        for (String number : args) {
            System.out.println(fizzBuzz(Integer.parseInt(number)));

        }
    }

    public static String fizzBuzz(int number) {
        String value = String.valueOf(number);

        if (number % 3 == 0 && number % 5 == 0) {
            value = "FizzBuzz";
        } else if (number % 3 == 0) {
            value = "Fizz";
        } else if (number % 5 == 0) {
            value = "Buzz";
        }

        return value;

    }
}