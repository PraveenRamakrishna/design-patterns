package patterns.bdp.command;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@FunctionalInterface
interface CommandFI {
	public void apply();
}

public class CommandPatternUsingFunctionalInterface {
	public static void main(String[] args) {
		CommandFactory factory = CommandFactory.init();
		factory.executeCommand("Light on");
		factory.listCommands();

	}

	private static final class CommandFactory {
		private final Map<String, CommandFI> commands;

		private CommandFactory() {
			commands = new HashMap<>();
		}

		public void addCommand(final String name, final CommandFI command) {
			commands.put(name, command);
		}

		public void executeCommand(String name) {
			if (commands.containsKey(name)) {
				commands.get(name).apply();
			}
		}

		public void listCommands() {
			System.out.println("Enabled commands: " + commands.keySet().stream().collect(Collectors.joining(", ")));
		}

		/* Factory pattern */
		public static CommandFactory init() {
			final CommandFactory factory = new CommandFactory();

			// Commands are added here using lambdas. It is also possible to
			// dynamically add commands without editing the code.
			factory.addCommand("Light on", () -> System.out.println("Lights On..!"));
			factory.addCommand("Light off", () -> System.out.println("Lights off..!"));

			return factory;
		}

	}

}
