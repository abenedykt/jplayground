package cs;

public interface IHandle<TParam, TResult> {
    TResult execute(TParam params);
}