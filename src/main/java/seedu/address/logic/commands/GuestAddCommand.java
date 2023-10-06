package seedu.address.logic.commands;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.person.Person;
public class GuestAddCommand extends Command {
    // below implementation more or less copied from AddCommand
    public static final String COMMAND_WORD = "guest add";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a person to the address book. ";
    public static final String MESSAGE_SUCCESS = "New person added: %1$s";

    public GuestAddCommand(Person person) {

    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        return null;
    }
}
