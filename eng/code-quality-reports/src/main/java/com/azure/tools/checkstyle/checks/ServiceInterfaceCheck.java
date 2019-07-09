package com.azure.tools.checkstyle.checks;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

public class ServiceInterfaceCheck extends AbstractCheck {

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
            TokenTypes.INTERFACE_DEF
        };
    }

    @Override
    public void visitToken(DetailAST token) {
        switch (token.getType()) {
            case TokenTypes.INTERFACE_DEF:
                checkServiceInterface(token);
                break;
            default:
                // Checkstyle complains if there's no default block in switch
                break;
        }
    }

    private void checkServiceInterface(DetailAST interfaceDefToken) {
        DetailAST modifiersToken = interfaceDefToken.findFirstToken(TokenTypes.MODIFIERS);
        if (modifiersToken == null) {
            return;
        }

        DetailAST serviceInterfaceAnnotationNode = null;
        String nameValue = null;

        for (DetailAST ast = modifiersToken.getFirstChild(); ast != null; ast = ast.getNextSibling()) {

            if (ast.getType() != TokenTypes.ANNOTATION) {
                continue;
            }

            for (DetailAST annotationChild = ast.getFirstChild();
                 annotationChild != null; annotationChild = annotationChild.getNextSibling()) {

                if (annotationChild.getType() == TokenTypes.IDENT) {
                    if (!"ServiceInterface".equals(annotationChild.getText())) {
                        break;
                    } else {
                        serviceInterfaceAnnotationNode = ast;
                    }
                }

                if (annotationChild.getType() == TokenTypes.ANNOTATION_MEMBER_VALUE_PAIR) {
                    DetailAST annotationPairIdent = annotationChild.findFirstToken(TokenTypes.IDENT);
                    if (annotationPairIdent != null && "name".equals(annotationPairIdent.getText())) {
                        nameValue = getNamePropertyValue(annotationChild.findFirstToken(TokenTypes.EXPR));
                    }
                }
            }
        }


        if (serviceInterfaceAnnotationNode != null) {
            if(nameValue == null) {
                log(serviceInterfaceAnnotationNode, "@ServiceInterface annotation missing ''name'' property.");
            } else {
                if (nameValue.contains(" ")) {
                    log(serviceInterfaceAnnotationNode, "The ''name'' property of @ServiceInterface should not contain white space.");
                }
                if (nameValue.length() > 10) {
                    log(serviceInterfaceAnnotationNode, "The ''name'' property of @ServiceInterface should not have a length > 10.");
                }
            }
        }
    }

    private String getNamePropertyValue(DetailAST exprToken) {
        if (exprToken == null) {
            return null;
        }

        DetailAST nameValueToken = exprToken.findFirstToken(TokenTypes.STRING_LITERAL);
        if (nameValueToken == null) {
            return null;
        }

        return nameValueToken.getText();
    }
}
