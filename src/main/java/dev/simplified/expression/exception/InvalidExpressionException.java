package dev.simplified.expression.exception;

import dev.simplified.expression.Expression;
import dev.simplified.expression.shuntingyard.ShuntingYard;
import dev.simplified.expression.tokenizer.Tokenizer;
import org.intellij.lang.annotations.PrintFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Thrown when an expression is invalid, cannot be parsed, or is
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
public final class InvalidExpressionException extends ExpressionException {

    /**
     * Constructs a new {@code InvalidExpressionException} with the specified cause.
     *
     * @param cause the underlying throwable that caused this exception
     */
    public InvalidExpressionException(@NotNull Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new {@code InvalidExpressionException} with the specified detail message.
     *
     * @param message the detail message
     */
    public InvalidExpressionException(@NotNull String message) {
        super(message);
    }

    /**
     * Constructs a new {@code InvalidExpressionException} with the specified cause and detail message.
     *
     * @param cause the underlying throwable that caused this exception
     * @param message the detail message
     */
    public InvalidExpressionException(@NotNull Throwable cause, @NotNull String message) {
        super(cause, message);
    }

    /**
     * Constructs a new {@code InvalidExpressionException} with a formatted detail message.
     *
     * @param message the format string
     * @param args the format arguments
     */
    public InvalidExpressionException(@NotNull @PrintFormat String message, @Nullable Object... args) {
        super(message, args);
    }

    /**
     * Constructs a new {@code InvalidExpressionException} with the specified cause and a formatted detail message.
     *
     * @param cause the underlying throwable that caused this exception
     * @param message the format string
     * @param args the format arguments
     */
    public InvalidExpressionException(@NotNull Throwable cause, @NotNull @PrintFormat String message, @Nullable Object... args) {
        super(cause, message, args);
    }

}
