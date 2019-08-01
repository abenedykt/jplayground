package cs;

public class HelloCommand implements IHandle<HelloParam, HelloResult>{

    @Override
    public HelloResult execute(HelloParam params) {
        return new HelloResult();
    }

}

