package dev.sbs.api.expression.exception;

import org.intellij.lang.annotations.PrintFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Thrown when the math expression evaluator encounters a parsing, evaluation,
 * or operator error.
 *
 * @see ExpressionException
 * @see EvaluationException
 * @see UnknownFunctionException
 * @see UnknownOperatorException
 */
public class MathException extends RuntimeException {

    /**
     * Constructs a new {@code MathException} with the specified cause.
     *
     * @param cause the underlying throwable that caused this exception
     */
    public MathException(@NotNull Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new {@code MathException} with the specified detail message.
     *
     * @param message the detail message
     */
    public MathException(@NotNull String message) {
        super(message);
    }

    /**
     * Constructs a new {@code MathException} with the specified cause and detail message.
     *
     * @param cause the underlying throwable that caused this exception
     * @param message the detail message
     */
    public MathException(@NotNull Throwable cause, @NotNull String message) {
        super(message, cause);
    }

    /**
     * Constructs a new {@code MathException} with a formatted detail message.
     *
     * @param message the format string
     * @param args the format arguments
     */
    public MathException(@NotNull @PrintFormat String message, @Nullable Object... args) {
        super(String.format(message, args));
    }

    /**
     * Constructs a new {@code MathException} with the specified cause and a formatted detail message.
     *
     * @param cause the underlying throwable that caused this exception
     * @param message the format string
     * @param args the format arguments
     */
    public MathException(@NotNull Throwable cause, @NotNull @PrintFormat String message, @Nullable Object... args) {
        super(String.format(message, args), cause);
    }

}
