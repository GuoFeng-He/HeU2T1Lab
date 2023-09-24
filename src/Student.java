public class Student {
    private double average;
    private String name;
    private int numberOfClasses;

    public Student(double studentAverage, String studentName, int studentNumberOfClasses) {
        average = studentAverage;
        name = studentName;
        numberOfClasses = studentNumberOfClasses;
    }

    public void passingDetection() {
        if (average >= 65){
            System.out.println("Student is passing with a " + average + " average.");
        }
        else{
            System.out.println("Student is failing with a " + average + " average.");
        }
    }

    public void studentInfo(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Average: " + average);
        System.out.println("Number of Classes: " + numberOfClasses);
    }
}
