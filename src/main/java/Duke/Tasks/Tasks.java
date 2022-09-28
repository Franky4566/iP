package Duke.Tasks;

import Duke.Duke;
import Duke.UI.UI;

public abstract class Tasks {
    protected String description;
    protected boolean isDone;
    protected String taskType;

    public Tasks(String description) {
        this.description = description;
        this.isDone = false;
        this.taskType = "T";
    }

//    public Tasks(String description, boolean isDone) {
//        this.description = description;
//        this.isDone = isDone;
//
//    }

    /**
     * Get status of list item if it is done or undone
     */
    public String getStatusIcon() {
        return (isDone ? "[X]" : "[ ]"
        ); // mark done task with X
    }

    public String getTaskDescription() {
        return this.description;
    }


    /**
     * Mark an item as not done
     */
    public void markAsNotDone() {
        this.isDone = false;
        System.out.println(
                UI.PRINT_LINE
                        + "OK, I've marked this task as not done:\n"
                        + "[ ] "
                        + description
                        + "\n" + UI.PRINT_LINE
        );
    }

    /**
     * Mark an item as done
     */
    public void markAsDone() {
        this.isDone = true;
        System.out.println(
                UI.PRINT_LINE
                        + "Nice! I've marked this task as done:\n"
                        + "[X] "
                        + description
                        + "\n" + UI.PRINT_LINE
        );
    }

    public void insertDone() {
        this.isDone = true;
    }

    public void insertNotDone() {
        this.isDone = false;
    }

    public abstract String toFile();


};
