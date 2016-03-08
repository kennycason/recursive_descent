package com.kennycason.soroban.parser.prefix.ast;

import com.kennycason.soroban.lexer.token.Token;
import com.kennycason.soroban.lexer.token.TokenType;

/**
 * Created by kenny on 3/1/16.
 */
public class NumberNode extends AstNode {

    public NumberNode(final Token token) {
        super(token);

        if (token.getType() != TokenType.NUMBER) {
            throw new IllegalStateException("Token must be of type NUMBER, found type: "
                         + token.getType() + ", value: " + token.getValue());
        }
    }

}
