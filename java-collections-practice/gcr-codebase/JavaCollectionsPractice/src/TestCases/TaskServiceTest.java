package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.TaskService;

public class TaskServiceTest {

    TaskService service = new TaskService();

    @Test
    @Timeout(2)   // fails if execution > 3 seconds, timeout value > 3 then it will pass the test 
    void testLongRunningTaskPerformance() throws InterruptedException {

        String result = service.longRunningTask();

        assertEquals("Task Completed", result);
    }
}

