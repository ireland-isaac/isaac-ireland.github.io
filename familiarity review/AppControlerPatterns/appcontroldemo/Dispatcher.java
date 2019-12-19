/** original work by chistianray */

package AppControlDemo;
import java.util.HashMap;

public class Dispatcher  {
    private HashMap<String, Handler> commands;

    private PeanutsReview Peanuts;
    private CreedReview Creed;
    private SpectreReview Spectre;

    public Object Dispatcher()
    {
        commands = new HashMap<String,Handler>();
		commands.put("Peanuts", new PeanutsReview());
		commands.put("Creed", new CreedReview());
		commands.put("Spectre", new SpectreReview());

    }

    public Object doCommand(String commandKey, HashMap<String, String> commandData) throws Exception {
		Handler command = commands.getOrDefault(commandKey, null);
		if (command == null) {
			throw new Exception("There is no command with the key word '" + commandKey + "'.");
		}
		
		return command.review(commandData);
	}

    public void dispatch( String request)
    {
  
            request.review();

    }

}