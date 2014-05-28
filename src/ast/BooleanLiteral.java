package ast;

import ee.ut.cs.akt.aktk.ast.Literal;


/**
 * Murdarvu literaal
 */
public class BooleanLiteral extends Literal<Boolean> {

    public BooleanLiteral(boolean value) {
        super(value);
    }

}
