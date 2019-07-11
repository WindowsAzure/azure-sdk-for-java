// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.tools.checkstyle.checks;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

import java.util.Stack;

/**
 * The @ServiceClientBuilder class should have the following rules:
 *  1) All service client builder should be named <ServiceName>ClientBuilder and annotated with @ServiceClientBuilder.
 *  2) Has a method 'buildClient()' to build a synchronous client,
 *  3) Has a method 'buildAsyncClient()' to build an asynchronous client
 */
public class ServiceClientBuilderCheck extends AbstractCheck {
    private static final String SERVICE_CLIENT_BUILDER = "ServiceClientBuilder";
    private static final String BUILD_CLIENT = "buildClient";
    private static final String BUILD_ASYNC_CLIENT = "buildAsyncClient";

    private Stack<Boolean> hasServiceClientBuilderAnnotationStack = new Stack();
    private boolean hasServiceClientBuilderAnnotation;
    private boolean hasAsyncClientBuilder;
    private boolean hasClientBuilder;

    @Override
    public int[] getDefaultTokens() {
        return getRequiredTokens();
    }

    @Override
    public int[] getAcceptableTokens() {
        return getRequiredTokens();
    }

    @Override
    public int[] getRequiredTokens() {
        return new int[] {
            TokenTypes.CLASS_DEF,
            TokenTypes.METHOD_DEF
        };
    }

    @Override
    public void leaveToken(DetailAST token) {
        switch (token.getType()) {
            case TokenTypes.CLASS_DEF:
                final boolean previousState = hasServiceClientBuilderAnnotationStack.pop();

                if (!hasServiceClientBuilderAnnotation) {
                    return;
                }

                if (!hasAsyncClientBuilder) {
                    log(token, String.format("The class annotated with @ServiceClientBuilder requires an asynchronous method, ''%s''", BUILD_ASYNC_CLIENT));
                }
                if (!hasClientBuilder) {
                    log(token, String.format("The class annotated with @ServiceClientBuilder requires a synchronous method, ''%s''", BUILD_CLIENT));
                }
                // end of CLASS_DEF node, reset the value back to previous state
                hasServiceClientBuilderAnnotation = previousState;
                break;
            default:
                // Checkstyle complains if there's no default block in switch
                break;
        }
    }

    @Override
    public void visitToken(DetailAST token) {
        switch (token.getType()) {
            case TokenTypes.CLASS_DEF:
                // for the starting root of every class, reset to false
                hasAsyncClientBuilder = false;
                hasClientBuilder = false;

                // Save the state of variable 'hasServiceClientBuilderAnnotation' to limit the scope of accessibility
                hasServiceClientBuilderAnnotationStack.push(hasServiceClientBuilderAnnotation);

                final DetailAST serviceClientAnnotationBuilderToken = getServiceClientBuilderAnnotation(token);
                final String className = token.findFirstToken(TokenTypes.IDENT).getText();

                hasServiceClientBuilderAnnotation = serviceClientAnnotationBuilderToken != null;
                if (hasServiceClientBuilderAnnotation) {
                    // Don't need to check if the 'serviceClients' exist. It is required when using @ServiceClientBuilder

                    // HAS @ServiceClientBuilder annotation but NOT named the class <ServiceName>ClientBuilder
                    if (!className.endsWith("ClientBuilder")) {
                        log(token, String.format("Class annotated with @ServiceClientBuilder ''%s'' should be named <ServiceName>ClientBuilder.", className));
                    }
                } else {
                    // No @ServiceClientBuilder annotation but HAS named the class <ServiceName>ClientBuilder
                    if (className.endsWith("ClientBuilder")) {
                        log(token, String.format("Class ''%s'' should be annotated with @ServiceClientBuilder.", className));
                    }
                }
                break;
            case TokenTypes.METHOD_DEF:
                if (!hasServiceClientBuilderAnnotation) {
                    return;
                }

                // if buildAsyncClient() and buildClient() methods already exist, skip rest of METHOD_DEF checks
                if (hasAsyncClientBuilder && hasClientBuilder) {
                    return;
                }

                final String methodName = token.findFirstToken(TokenTypes.IDENT).getText();
                if (BUILD_ASYNC_CLIENT.equals(methodName)) {
                    hasAsyncClientBuilder = true;
                }
                if (BUILD_CLIENT.equals(methodName)) {
                    hasClientBuilder = true;
                }
                break;
            default:
                // Checkstyle complains if there's no default block in switch
                break;
        }
    }

    /**
     * Checks if the class is annotated with @ServiceClientBuilder.
     *
     * @param classDefToken the CLASS_DEF AST node
     * @return the annotation node if the class is annotated with @ServiceClientBuilder, null otherwise.
     */
    private DetailAST getServiceClientBuilderAnnotation(DetailAST classDefToken) {
        final DetailAST modifiersToken = classDefToken.findFirstToken(TokenTypes.MODIFIERS);

        if (!modifiersToken.branchContains(TokenTypes.ANNOTATION)) {
            return null;
        }

        DetailAST annotationToken = modifiersToken.findFirstToken(TokenTypes.ANNOTATION);
        if (!SERVICE_CLIENT_BUILDER.equals(annotationToken.findFirstToken(TokenTypes.IDENT).getText())) {
            return null;
        }

        return annotationToken;
    }
}
