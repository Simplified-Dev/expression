package dev.sbs.api.expression.exception;

import dev.sbs.api.expression.Expression;
import dev.sbs.api.expression.shuntingyard.ShuntingYard;
import dev.sbs.api.expression.tokenizer.Tokenizer;
import org.intellij.lang.annotations.PrintFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Thrown when a mathematical expression is invalid, cannot be parsed, or is
 * configured with incorrect arguments.
 * <p>
 * This covers structural errors such as empty expressions, mismatched parentheses,
 * invalid operator symbols, variable/function name conflicts, unparseable characters,
 * and incorrect argument counts.
 *
 * @see Expression
 * @see ShuntingYard
 * @see Tokenizer
 */
public final class ExpressionException extends MathException {

    /**
     * Constructs a new {@code ExpressionException} with the specified cause.
     *
     * @param cause the underlying throwable that caused this exception
     */
    public ExpressionException(@NotNull Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new {@code ExpressionException} with the specified detail message.
     *
     * @param message the detail message
     */
    public ExpressionException(@NotNull String message) {
        super(message);
    }

    /**
     * Constructs a new {@code ExpressionException} with the specified cause and detail message.
     *
     * @param cause the underlying throwable that caused this exception
     * @param message the detail message
     */
    public ExpressionException(@NotNull Throwable cause, @NotNull String message) {
        super(cause, message);
    }

    /**
     * Constructs a new {@code ExpressionException} with a formatted detail message.
     *
     * @param message the format string
     * @param args the format arguments
     */
    public ExpressionException(@NotNull @PrintFormat String message, @Nullable Object... args) {
        super(message, args);
    }

    /**
     * Constructs a new {@code ExpressionException} with the specified cause and a formatted detail message.
     *
     * @param cause the underlying throwable that caused this exception
     * @param message the format string
     * @param args the format arguments
     */
    public ExpressionException(@NotNull Throwable cause, @NotNull @PrintFormat String message, @Nullable Object... args) {
        super(cause, message, args);
    }

}
