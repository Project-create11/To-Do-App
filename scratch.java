
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.1*;


public  class Scratch {

            private ArrayList<TODOAPP.Task> tasks;

    @BeforeEach
    public void setup() {
        // Initialize a fresh task list before each test
        tasks = new ArrayList<>();
    }

    @Test
    public void testAddTask() {
        // Arrange
        String description = "Complete the assignment";

        // Act
        tasks.add(new TODOAPP.Task(description));

        // Assert
        assertEquals(1, tasks.size());
        assertEquals("Complete the assignment", tasks.get(0).description);
        assertFalse(tasks.get(0).isCompleted);  // New tasks should not be completed
    }


    @Test
    public void testViewAllTasks() {
        // Arrange: add multiple tasks to the list
        tasks.add(new TODOAPP.Task("Complete the assignment"));
        tasks.add(new TODOAPP.Task("Read project documentation"));
        TODOAPP.Task task3 = new TODOAPP.Task("Attend team meeting");
        task3.markAsComplete(); // Mark one task as completed
        tasks.add(task3);

        // Act & Assert
        // Check the number of tasks
        assertEquals(3, tasks.size(), "There should be three tasks in the list.");

        // Verify each task’s details and status
        assertEquals("[Pending] Complete the assignment", tasks.get(0).toString());
        assertEquals("[Pending] Read project documentation", tasks.get(1).toString());
        assertEquals("[Completed] Attend team meeting", tasks.get(2).toString());
    }
}