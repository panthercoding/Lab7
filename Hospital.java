import java.util.*;

public class Hospital{

  //the main data structure is an arraylist describing several wards 
  //each element in the list represents the number of patient vacancies
  //to treat a new contagious virus 
  private ArrayList<Integer> wardVacancies;

  //constructor method -> -> NO NEED TO CHANGE
  public Hospital(int[] wards){ //creates a hospital given an array of ward vacancies by copying the elements over
    wardVacancies = new ArrayList<Integer>();
    for (int i = 0; i < wards.length; i++){
      wardVacancies.add(wards[i]); //add the ith element to the array-list
    }
  }

  //accessor method -> NO NEED TO CHANGE
  public ArrayList<Integer> getWards(){
    return(wardVacancies);
  }

  //TODO: insert patients into the same ward -> the first one with enough vacancies;
  //return true if successful only and false otherwise
  //the method should search through the arraylist and identify a ward with
  //enough space. It should then decrease that ward's vacancies by the new patients. 
  public boolean insertPatients(int numPatients){
    /* missing code */
  }

  //TODO: release patients from hospital -> should increase the element number at the provided
  //wardIndex by numPatients (increase number of vacancies)
  public void dischargePatients(int wardIndex, int numPatients){
    /* missing code */
  }

  public static void main(String[] args){ // no need to edit
    int[] vacancies = {10,10,10,5,3};
    Hospital clinic = new Hospital(vacancies);

    System.out.println("Initial: " + clinic.getWards());

    //allocate groups of 1,2,3,4,5,6 patients to the wards 
    for (int i = 1; i <= 6; i++){
      if (clinic.insertPatients(i)){
        System.out.println("Patient Allocation Successful");
      }
      else{
        System.out.println("Patient Allocation Failed");
      }
    }

    System.out.println("Final: " + clinic.getWards());
  }

}
