package BackEnd.EventSystem;

import BackEnd.User;
import java.util.ArrayList;

/**
 *
 * @author Ketty Lezama 
 */

public class Task extends ScheduleItem {
    private int COMMITTEE_ID;
    private int TASK_ID;
    private ArrayList<User> responsibleList;
    private boolean completed;
    
    public Task(int committee_id, int task_id, String description){
        super(description);
        COMMITTEE_ID = committee_id;
        TASK_ID = task_id;
        responsibleList = new ArrayList<User>();
        completed = false;
    }
    
    private void setTASK_ID(int task_id) {
        TASK_ID = task_id;
    }
    
    public int getTASK_ID() {
        return TASK_ID;
    }
    
    // Not on UML; Added it.
    public int getCOMMITTEE_ID() {
        return COMMITTEE_ID;
    }
    
    public void setResponsibleList(ArrayList<User> responsibleList) {
        this.responsibleList = responsibleList;
    }
    
    public ArrayList<User> getResponsibleList() {
        return responsibleList;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public boolean getCompleted() {
        return completed;
    }
    
    public boolean equals(Task task) {
        if (this.getCOMMITTEE_ID() == task.getCOMMITTEE_ID() 
                && this.getTASK_ID() == task.getTASK_ID() 
                && this.getResponsibleList().equals(task.getResponsibleList()) 
                && this.getCompleted() == task.getCompleted())
            return true;
        else
            return false;
    }
    
    public String toString() {
        String responsibleListNames = "";
        
        for(User user: responsibleList)
            responsibleListNames += user.getName() + "\n"; // Change.
        
        return "Description: \n" + super.getDescription() + "\nCommittee ID: " + COMMITTEE_ID + 
                "\nTask ID: " + TASK_ID + "\nResponsible Participants: \n" + responsibleListNames + 
                "\nTask Complete: " + completed;
    }
}