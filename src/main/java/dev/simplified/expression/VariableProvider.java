package dev.simplified.expression;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A provider that resolves variable names to their {@link Double} values during expression evaluation.
 * <p>
 * Implementations supply variable values dynamically, allowing an {@link Expression} to look up
 * variables at evaluation time rather than requiring all values to be set beforehand.
 *
 * @see Expression
 */
public interface VariableProvider {

    /**
     * Returns the value of the variable with the given name.
     *
     * @param variable the name of the variable to resolve
     * @return the value of the variable, or {@code null} if the variable is not recognized
     */
    @Nullable Double getVariable(@NotNull String variable);

}
