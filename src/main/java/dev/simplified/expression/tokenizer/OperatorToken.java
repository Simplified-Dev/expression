package dev.sbs.api.expression.tokenizer;

import dev.sbs.api.expression.operator.MathOperator;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

/**
 * Token representing a mathematical operator in an expression.
 * <p>
 * Each operator token wraps a {@link MathOperator} that defines the operator's
 * symbol, precedence, associativity, and number of operands. The
 * {@link dev.sbs.api.expression.shuntingyard.ShuntingYard ShuntingYard} algorithm
 * uses these properties to correctly order operators when converting from
 * infix to reverse-polish notation.
 *
 * @see Token#TOKEN_OPERATOR
 * @see MathOperator
 * @see Tokenizer
 */
@Getter
public class OperatorToken extends Token {

    /** The mathematical operator this token represents. */
    private final @NotNull MathOperator operator;

    /**
     * Creates a new operator token wrapping the given operator.
     *
     * @param op the mathematical operator this token represents
     * @throws IllegalArgumentException if {@code op} is {@code null}
     */
    public OperatorToken(@NotNull MathOperator op) {
        super(Token.TOKEN_OPERATOR);
        this.operator = op;
    }

}
