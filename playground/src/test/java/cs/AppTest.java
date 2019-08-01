package cs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void playingWithGenerics()
    {
        CommandExecutor executor = new CommandExecutor();
        
        HelloResult result = executor.execute(new HelloParam());

        assertNotNull(result);
        assertEquals("Hello", result.toString());
    }
}


