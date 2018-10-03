import static input.InputUtils.doubleInput;

public class AverageTest { public static void main(String[] args) {


    //calculate average of five test scores
    int numOfTest = 5;
    double testScore;
    double testScoreSum = 0;
    double testScoreAverage;

    for (int test = 1; test <= numOfTest; test++) {
        testScore = doubleInput("Enter Score #" + test);
        testScoreSum=testScore+testScore;
    }
    testScoreAverage=testScoreSum/numOfTest;
    System.out.println("Average score ="+testScoreAverage);
}
}
