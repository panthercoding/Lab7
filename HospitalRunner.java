import java.util.*;

public class HospitalRunner{
  public static void main(String[] args){

    int[] vacancies = {100,100,100,50,50,50,50,50,10,10};
    Hospital clinic = new Hospital(vacancies);
    System.out.println("Initial Hospital Wards: " + clinic.getWards());
    //creates a hospital with 10 wards (3 large, 5 medium, 2 small)

    //the scanner will prompt the user to make patient allocation requests
    //for now, we don't include the ability to make patient deallocation requests
    Scanner scan = new Scanner(System.in); 
    
    boolean keepGoing = true;
    while (keepGoing){
      System.out.println("How many patients for ward allocation? (-1 to exit)");
      int numPatients = scan.nextInt();
      if (numPatients < 0){
        keepGoing = false;
      }
      else{
          if (clinic.insertPatients(numPatients)){
            System.out.println("Patient Allocation Successful");
          }
          else{
            System.out.println("Patient Allocation Failed");
          }
          System.out.println("Hospital Wards: " + clinic.getWards() + "\n");
      }
    }

    

    
    }

  }
