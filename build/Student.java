public class Student{

 /* Instance Variables */
    // instance variables for 
    // first name (String)
    // last name (String)
    // graduation year (int)
    // sum of test scores (double).. should initialize at 0.0
    // test score count (int) ..should initialize at 0
    // highest test score (double).. should initialize at 0.0
 private String firstName;
 private String lastName;
 private int gradYear;
 private double sum = 0.0;
 private int scoreCount = 0;
 private double highestScore = 0.0;
 
/* Constructor */
public Student(String firstName, String lastName, int gradYear) {
    //implement code here!
    this.firstName = firstName;
    this.lastname = lastName;
    this.gradYear = gradYear;
}

public String getFirstName() {
    //implement code here!
    return firstName;
}

// returns lastName
public String getLastName() {
    //implement code here!
    return lastName;
}
/* Getter Methods */
public double getHighestTestScore() {
    //implement code here!
    return highestScore;
}

public int getTestScoreCount(){
    //implement code here!
    return scoreCount;
}

public int getGradYear(){
    //implement code here!
    return gradYear;
}

/* Setter Methods */
// sets gradYear to newGradYear
public void setGradYear(int newGradYear) {
    gradYear = newGradYear;
}

/* All Other Methods */
// adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
// set new highest test score 
public void addTestScore(double newTestScore) {
    testScoreCount ++;
    sum += newTestScore;
    if (newTestScore > highestScore) {
        highestScore = newTestScore;
    }
}

// returns true if the student's average test score is greater
// than or equal to 65; returns false otherwise (see Note 2 below)
public boolean isPassing() {
    if(averageTestScore>=65){
        return true;
    } else{
        return false; 
    }
    
}

// returns the Student's average test score as the
// quotient of accumulatedTestScores and testScoreCount
public double averageTestScore() {
    double average = sum/testScoreCount;
    return average;
}

// this method prints all info of a Student object to the console 
// I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
public void printStudentInfo() {
    System.out.println("Student Full Name: " + firstName + " " + lastName);
    System.out.println("Graduation Year: " + gradYear);
    System.out.println("Number of tests: " +  scoreCount);
    System.out.println("Average Test Score: " + averageTestScore());
    System.out.println("Highest Test Score: " + highestScore);
    System.out.println("Is passing: " + isPassing());
}
}

