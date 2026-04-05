package dev.simplified.expression.tokenizer;

import dev.simplified.expression.shuntingyard.ShuntingYard;

/**
 * Token representing an open parenthesis, bracket, or brace in a mathematical expression.
 * <p>
 * The {@link Tokenizer} emits this token when it encounters a {@code '('},
 * {@code '['}, or <code>{</code> character. All three variants are treated
 * identically by the {@link ShuntingYard ShuntingYard}
 * algorithm.
 *
 * @see Token#TOKEN_PARENTHESES_OPEN
 * @see CloseParenthesesToken
 * @see Tokenizer
 */
class OpenParenthesesToken extends Token {

    /**
     * Creates a new open-parenthesis token.
     */
    OpenParenthesesToken() {
        super(TOKEN_PARENTHESES_OPEN);
    }

}
