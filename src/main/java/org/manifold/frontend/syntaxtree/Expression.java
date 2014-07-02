package org.manifold.frontend.syntaxtree;

public abstract class Expression {
  public abstract TypeValue getType();
  public abstract Value evaluate();
  public abstract void verify() throws Exception;
  public abstract boolean isAssignable();
  public abstract boolean isCompiletimeEvaluable();
  public abstract boolean isSynthesizable();
}
