package psu.ist311;

import javax.print.attribute.standard.DateTimeAtCompleted;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    /*
        What is the runtime complexity O(.) of this algorithm
     */
    public void algorithm1and2(int n){

        // Problem 1: I have to print from 1 to 'n' elements
        for (int i=0; i < n; i++){
            System.out.println(i);
        }

        // Time complexity of the previous loop:
        // Observation 1: the time complexity of this algorithm is determined by the loop above
        // Ask: How many times this loop will run in relationship to the input n
        // Answer: n times
        // So, time_complexity_of_loop_1 is proportionate to n
        // in big-O notation: time_complexity_of_loop_1 = O(n)


        // Problem 2: I have to print the first three element starting from 0
        for (int i=0; i < 3; i++){
            System.out.println(i);
        }

        // Time complexity of the previous loop:
        // Observation 2: the time complexity of this algorithm is also determined by the loop above
        // Ask: How many times this loop will run in relationship to the input n
        // Answer: the loop will run 3 times; in fact, it is agnostic to the input n
        // So, time_complexity_of_loop_2 is a constant, 3
        // in big-O notation: time_complexity_of_loop_2 = O(1)


        // Total Complexity analysis:
        // Clue: the code runs sequentially from top to bottom
        // So, we need to add up the time complexity of  time_complexity_of_loop_1 and time_complexity_of_loop_2
        // In big-O notation: total complexity = time_complexity_of_loop_1 + time_complexity_of_loop_2
        // Replacing the variables: total complexity = O(n) + O(1)
        // Simplifying the big-O operators: O(n)
        // Final time complexity: O(n)
    }


    /*
        I have a number in mind (between 1 and n). Can you guess this number?
     */
    public void algorithm3(int n, int numberInMind){
        int myGuess = 0;

        // You can only ask me if the number in my mid is equal to a number
        for (myGuess = 1; myGuess <= n; myGuess++) {
            if (myGuess == numberInMind){
                System.out.println("Guessed it. Is it "+ myGuess + "?");
                break;
            }
        }

        // Time complexity analysis:
        // Observation 1: the time complexity of this algorithm will be determined by the loop above
        // Ask: How many times this loop will run in relationship to the input n
        // Answer: n times
        // So, time_complexity_of_loop_1 is proportionate to n
        // in big-O notation: time_complexity_of_loop_1 = O(n)

        // Total time complexity:
        // Since the algorithm has only one code block, the final complexity is the same as this block's complexity
        // Final answer: O(n)
    }

    /*
        I have a number in mind (between 1 and n). Can you guess this number?
     */
    public void algorithm4(int n, int numberInMind){

        int startNum = 1;
        int endNum   = n;
        int midNum = (startNum + endNum)/2;

        // You can ask me if the number in my mind is equal to a number,
        while (midNum != numberInMind){

            // You can also ask me if the number in my mind is greater (or smaller) than a number
            if (midNum < numberInMind){
                // reduce the start and end range by half
                startNum =  midNum;
                endNum = endNum;
            } else {
                // reduce the start and end range by half
                startNum = startNum;
                endNum = midNum;
            }

            // update the mid
            midNum = (startNum + endNum)/2;
        }

        // out of the loop, must have found the number
        System.out.println("Guessed it. Is it " + midNum + "?");


        // Time complexity analysis:
        // Observation 1: the time complexity of this algorithm will be determined by the while loop above
        // Ask: How many times this loop will run in relationship to the input n
        // Answer: n/2 , n/ (2*2), n/ (2*2*2), n/ (2*2*2*2), ... 1 times
        // So, time_complexity_of_loop_1 is proportionate to log2(n)
        // in big-O notation: time_complexity_of_loop_1 = log2(n)

        // Total time complexity:
        // Since the algorithm has only one code block, the final complexity is the same as this block's complexity
        // Final answer: log2(n)
    }

    public void algorithmQuestion1(int n){
        for (int i=0; i < n; i++){
            System.out.println(i);
        }

        for (int i=0; i < 10; i++){
            System.out.println(i);
        }

        for (int i=0; i < n; i++){
            for (int j=0; j < n; j++) {
                System.out.println("(" +i+ "," + j+ ")");
            }
        }

        // what is the time complexity of this algorithm?
    }


    public void algorithmQuestion2(int n, int numberInMind){
        for (int i=0; i < n; i++){
            System.out.println(i);
        }


        int startNum = 1;
        int endNum   = n;
        int midNum = (startNum + endNum)/2;

        // You can ask me if the number in my mind is equal to a number,
        while (midNum != numberInMind){

            // You can also ask me if the number in my mind is greater (or smaller) than a number
            if (midNum < numberInMind){
                // reduce the start and end range by half
                startNum =  midNum;
                endNum = endNum;
            } else {
                // reduce the start and end range by half
                startNum = startNum;
                endNum = midNum;
            }

            // update the mid
            midNum = (startNum + endNum)/2;
        }

        // out of the loop, must have found the number
        System.out.println("Guessed it. Is it " + midNum + "?");

        // what is the time complexity of this algorithm?
    }


    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Main app = new Main();

        // calling algorithm1and2
        System.out.println("Calling algorithm1and2: ");
        app.algorithm1and2(10);

        // calling algorithm1and2
        System.out.println();
        System.out.println("Calling algorithm3: ");
        app.algorithm3(128, 10);

        //Calling algorithm4"
        System.out.println();
        System.out.println("Calling algorithm4: ");
        app.algorithm4(128, 20);

    }
}