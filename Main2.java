import java.util.Scanner;
public class Main2{
    public static Candidate getCandidateDetails() throws InvalidInternException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the candidate details");
        System.out.println("Name");
        String name=sc.next();
        System.out.println("Gender");
        String gender=sc.next();
        System.out.println("Percentage in 10th");
        int percent=sc.nextInt();
        if(percent<50){
            throw new InvalidInternException("Percentage cannot be less than 50");
        }
        else{
            Candidate candidate=new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percent);
            return candidate;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to InterHiring Tool");
        try {
            Candidate candidate=getCandidateDetails();
            System.out.println("Registration Successful");
        } 
        catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}