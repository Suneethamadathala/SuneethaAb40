package arrays;
public class StudentTable {
    public static void main(String[] args) {
        // Define student data
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve", "Felicity", "George", "Hannah"};
        int[] studentIds = {101, 102, 103, 104, 105, 106, 107, 108};
        int[] studentScores = {85, 90, 78, 88, 92, 85, 90, 78};
        
        // Print table header
        System.out.println("Student Table");
        System.out.println("ID\tName\t\t\tScore");
        
        // Print each student's data
        for (int i = 0; i < students.length; i++) {
            // Adjust spacing for names
            String name = students[i];
            if (name.length() < 8) {
                name += "\t\t";
            } else {
                name += "\t";
            }
            System.out.println(studentIds[i] + "\t" + name + "\t" + studentScores[i]);
        }
    }
}