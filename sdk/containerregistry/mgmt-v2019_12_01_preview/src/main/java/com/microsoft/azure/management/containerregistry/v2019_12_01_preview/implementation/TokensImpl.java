/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.Tokens;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.Token;

class TokensImpl extends WrapperImpl<TokensInner> implements Tokens {
    private final ContainerRegistryManager manager;

    TokensImpl(ContainerRegistryManager manager) {
        super(manager.inner().tokens());
        this.manager = manager;
    }

    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public TokenImpl define(String name) {
        return wrapModel(name);
    }

    private TokenImpl wrapModel(TokenInner inner) {
        return  new TokenImpl(inner, manager());
    }

    private TokenImpl wrapModel(String name) {
        return new TokenImpl(name, this.manager());
    }

    @Override
    public Observable<Token> listAsync(final String resourceGroupName, final String registryName) {
        TokensInner client = this.inner();
        return client.listAsync(resourceGroupName, registryName)
        .flatMapIterable(new Func1<Page<TokenInner>, Iterable<TokenInner>>() {
            @Override
            public Iterable<TokenInner> call(Page<TokenInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TokenInner, Token>() {
            @Override
            public Token call(TokenInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Token> getAsync(String resourceGroupName, String registryName, String tokenName) {
        TokensInner client = this.inner();
        return client.getAsync(resourceGroupName, registryName, tokenName)
        .flatMap(new Func1<TokenInner, Observable<Token>>() {
            @Override
            public Observable<Token> call(TokenInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Token)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String registryName, String tokenName) {
        TokensInner client = this.inner();
        return client.deleteAsync(resourceGroupName, registryName, tokenName).toCompletable();
    }

}
