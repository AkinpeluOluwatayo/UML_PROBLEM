import java.util.ArrayList;
import java.util.Scanner;
public class Problem {
    private String name;
    private String type;
    private String status;


    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setType(String type) {this.type = type;}
    public String getType() {return type;}
    public void setStatus(String status) {this.status= status;
    }public String getStatus() {return status;}


    public static int displayTypeProblem(int user_input) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
         1. Financial
         2. Spiritual 
         3. Education
         4. Business / Technical       
                         """);
        int  problem = input.nextInt();

        if (user_input == problem) {
            return problem;
        }

        return 0;
    }

    public  ArrayList<String> addProblem(String user_input) {
        ArrayList<String> problem = new ArrayList<String>();
        problem.add(user_input);
        return problem;
    }






}