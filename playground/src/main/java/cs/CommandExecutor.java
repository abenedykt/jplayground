package cs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CommandExecutor {

    private List<IHandle<?,?>> _commands;

    public CommandExecutor() {
        _commands = new ArrayList<IHandle<?,?>>();
        _commands.add(new HelloCommand());
        _commands.add(new ByeCommand());

    }

    public <TParam, TResult> TResult execute(IResponseWith<TParam, TResult> parameter) {

        Optional<IHandle<TParam, TResult>> maybeCommand = _commands
            .stream()
            .findFirst(....);

        if(maybeCommand.empty()) return null;

        IHandle<TParam, TResult> command = maybeCommand.get();

        return command.execute((TParam) parameter);
    }
    

}