/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.attestation.v2020_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSONWebKey model.
 */
public class JSONWebKey {
    /**
     * The "alg" (algorithm) parameter identifies the algorithm intended for
     * use with the key.  The values used should either be registered in the
     * IANA "JSON Web Signature and Encryption Algorithms" registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.
     */
    @JsonProperty(value = "alg", required = true)
    private String alg;

    /**
     * The "crv" (curve) parameter identifies the curve type.
     */
    @JsonProperty(value = "crv")
    private String crv;

    /**
     * RSA private exponent or ECC private key.
     */
    @JsonProperty(value = "d")
    private String d;

    /**
     * RSA Private Key Parameter.
     */
    @JsonProperty(value = "dp")
    private String dp;

    /**
     * RSA Private Key Parameter.
     */
    @JsonProperty(value = "dq")
    private String dq;

    /**
     * RSA public exponent, in Base64.
     */
    @JsonProperty(value = "e")
    private String e;

    /**
     * Symmetric key.
     */
    @JsonProperty(value = "k")
    private String k;

    /**
     * The "kid" (key ID) parameter is used to match a specific key.  This
     * is used, for instance, to choose among a set of keys within a JWK Set
     * during key rollover.  The structure of the "kid" value is
     * unspecified.  When "kid" values are used within a JWK Set, different
     * keys within the JWK Set SHOULD use distinct "kid" values.  (One
     * example in which different keys might use the same "kid" value is if
     * they have different "kty" (key type) values but are considered to be
     * equivalent alternatives by the application using them.)  The "kid"
     * value is a case-sensitive string.
     */
    @JsonProperty(value = "kid", required = true)
    private String kid;

    /**
     * The "kty" (key type) parameter identifies the cryptographic algorithm
     * family used with the key, such as "RSA" or "EC". "kty" values should
     * either be registered in the IANA "JSON Web Key Types" registry
     * established by [JWA] or be a value that contains a Collision-
     * Resistant Name.  The "kty" value is a case-sensitive string.
     */
    @JsonProperty(value = "kty", required = true)
    private String kty;

    /**
     * RSA modulus, in Base64.
     */
    @JsonProperty(value = "n")
    private String n;

    /**
     * RSA secret prime.
     */
    @JsonProperty(value = "p")
    private String p;

    /**
     * RSA secret prime, with p &lt; q.
     */
    @JsonProperty(value = "q")
    private String q;

    /**
     * RSA Private Key Parameter.
     */
    @JsonProperty(value = "qi")
    private String qi;

    /**
     * Use ("public key use") identifies the intended use of
     * the public key. The "use" parameter is employed to indicate whether
     * a public key is used for encrypting data or verifying the signature
     * on data. Values are commonly "sig" (signature) or "enc" (encryption).
     */
    @JsonProperty(value = "use", required = true)
    private String use;

    /**
     * X coordinate for the Elliptic Curve point.
     */
    @JsonProperty(value = "x")
    private String x;

    /**
     * The "x5c" (X.509 certificate chain) parameter contains a chain of one
     * or more PKIX certificates [RFC5280].  The certificate chain is
     * represented as a JSON array of certificate value strings.  Each
     * string in the array is a base64-encoded (Section 4 of [RFC4648] --
     * not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
     * The PKIX certificate containing the key value MUST be the first
     * certificate.
     */
    @JsonProperty(value = "x5c")
    private List<String> x5c;

    /**
     * Y coordinate for the Elliptic Curve point.
     */
    @JsonProperty(value = "y")
    private String y;

    /**
     * Get the "alg" (algorithm) parameter identifies the algorithm intended for
     use with the key.  The values used should either be registered in the
     IANA "JSON Web Signature and Encryption Algorithms" registry
     established by [JWA] or be a value that contains a Collision-
     Resistant Name.
     *
     * @return the alg value
     */
    public String alg() {
        return this.alg;
    }

    /**
     * Set the "alg" (algorithm) parameter identifies the algorithm intended for
     use with the key.  The values used should either be registered in the
     IANA "JSON Web Signature and Encryption Algorithms" registry
     established by [JWA] or be a value that contains a Collision-
     Resistant Name.
     *
     * @param alg the alg value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withAlg(String alg) {
        this.alg = alg;
        return this;
    }

    /**
     * Get the "crv" (curve) parameter identifies the curve type.
     *
     * @return the crv value
     */
    public String crv() {
        return this.crv;
    }

    /**
     * Set the "crv" (curve) parameter identifies the curve type.
     *
     * @param crv the crv value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withCrv(String crv) {
        this.crv = crv;
        return this;
    }

    /**
     * Get rSA private exponent or ECC private key.
     *
     * @return the d value
     */
    public String d() {
        return this.d;
    }

    /**
     * Set rSA private exponent or ECC private key.
     *
     * @param d the d value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withD(String d) {
        this.d = d;
        return this;
    }

    /**
     * Get rSA Private Key Parameter.
     *
     * @return the dp value
     */
    public String dp() {
        return this.dp;
    }

    /**
     * Set rSA Private Key Parameter.
     *
     * @param dp the dp value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withDp(String dp) {
        this.dp = dp;
        return this;
    }

    /**
     * Get rSA Private Key Parameter.
     *
     * @return the dq value
     */
    public String dq() {
        return this.dq;
    }

    /**
     * Set rSA Private Key Parameter.
     *
     * @param dq the dq value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withDq(String dq) {
        this.dq = dq;
        return this;
    }

    /**
     * Get rSA public exponent, in Base64.
     *
     * @return the e value
     */
    public String e() {
        return this.e;
    }

    /**
     * Set rSA public exponent, in Base64.
     *
     * @param e the e value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withE(String e) {
        this.e = e;
        return this;
    }

    /**
     * Get symmetric key.
     *
     * @return the k value
     */
    public String k() {
        return this.k;
    }

    /**
     * Set symmetric key.
     *
     * @param k the k value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withK(String k) {
        this.k = k;
        return this;
    }

    /**
     * Get the "kid" (key ID) parameter is used to match a specific key.  This
     is used, for instance, to choose among a set of keys within a JWK Set
     during key rollover.  The structure of the "kid" value is
     unspecified.  When "kid" values are used within a JWK Set, different
     keys within the JWK Set SHOULD use distinct "kid" values.  (One
     example in which different keys might use the same "kid" value is if
     they have different "kty" (key type) values but are considered to be
     equivalent alternatives by the application using them.)  The "kid"
     value is a case-sensitive string.
     *
     * @return the kid value
     */
    public String kid() {
        return this.kid;
    }

    /**
     * Set the "kid" (key ID) parameter is used to match a specific key.  This
     is used, for instance, to choose among a set of keys within a JWK Set
     during key rollover.  The structure of the "kid" value is
     unspecified.  When "kid" values are used within a JWK Set, different
     keys within the JWK Set SHOULD use distinct "kid" values.  (One
     example in which different keys might use the same "kid" value is if
     they have different "kty" (key type) values but are considered to be
     equivalent alternatives by the application using them.)  The "kid"
     value is a case-sensitive string.
     *
     * @param kid the kid value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get the "kty" (key type) parameter identifies the cryptographic algorithm
     family used with the key, such as "RSA" or "EC". "kty" values should
     either be registered in the IANA "JSON Web Key Types" registry
     established by [JWA] or be a value that contains a Collision-
     Resistant Name.  The "kty" value is a case-sensitive string.
     *
     * @return the kty value
     */
    public String kty() {
        return this.kty;
    }

    /**
     * Set the "kty" (key type) parameter identifies the cryptographic algorithm
     family used with the key, such as "RSA" or "EC". "kty" values should
     either be registered in the IANA "JSON Web Key Types" registry
     established by [JWA] or be a value that contains a Collision-
     Resistant Name.  The "kty" value is a case-sensitive string.
     *
     * @param kty the kty value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withKty(String kty) {
        this.kty = kty;
        return this;
    }

    /**
     * Get rSA modulus, in Base64.
     *
     * @return the n value
     */
    public String n() {
        return this.n;
    }

    /**
     * Set rSA modulus, in Base64.
     *
     * @param n the n value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withN(String n) {
        this.n = n;
        return this;
    }

    /**
     * Get rSA secret prime.
     *
     * @return the p value
     */
    public String p() {
        return this.p;
    }

    /**
     * Set rSA secret prime.
     *
     * @param p the p value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withP(String p) {
        this.p = p;
        return this;
    }

    /**
     * Get rSA secret prime, with p &lt; q.
     *
     * @return the q value
     */
    public String q() {
        return this.q;
    }

    /**
     * Set rSA secret prime, with p &lt; q.
     *
     * @param q the q value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withQ(String q) {
        this.q = q;
        return this;
    }

    /**
     * Get rSA Private Key Parameter.
     *
     * @return the qi value
     */
    public String qi() {
        return this.qi;
    }

    /**
     * Set rSA Private Key Parameter.
     *
     * @param qi the qi value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withQi(String qi) {
        this.qi = qi;
        return this;
    }

    /**
     * Get use ("public key use") identifies the intended use of
     the public key. The "use" parameter is employed to indicate whether
     a public key is used for encrypting data or verifying the signature
     on data. Values are commonly "sig" (signature) or "enc" (encryption).
     *
     * @return the use value
     */
    public String use() {
        return this.use;
    }

    /**
     * Set use ("public key use") identifies the intended use of
     the public key. The "use" parameter is employed to indicate whether
     a public key is used for encrypting data or verifying the signature
     on data. Values are commonly "sig" (signature) or "enc" (encryption).
     *
     * @param use the use value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Get x coordinate for the Elliptic Curve point.
     *
     * @return the x value
     */
    public String x() {
        return this.x;
    }

    /**
     * Set x coordinate for the Elliptic Curve point.
     *
     * @param x the x value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withX(String x) {
        this.x = x;
        return this;
    }

    /**
     * Get the "x5c" (X.509 certificate chain) parameter contains a chain of one
     or more PKIX certificates [RFC5280].  The certificate chain is
     represented as a JSON array of certificate value strings.  Each
     string in the array is a base64-encoded (Section 4 of [RFC4648] --
     not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
     The PKIX certificate containing the key value MUST be the first
     certificate.
     *
     * @return the x5c value
     */
    public List<String> x5c() {
        return this.x5c;
    }

    /**
     * Set the "x5c" (X.509 certificate chain) parameter contains a chain of one
     or more PKIX certificates [RFC5280].  The certificate chain is
     represented as a JSON array of certificate value strings.  Each
     string in the array is a base64-encoded (Section 4 of [RFC4648] --
     not base64url-encoded) DER [ITU.X690.1994] PKIX certificate value.
     The PKIX certificate containing the key value MUST be the first
     certificate.
     *
     * @param x5c the x5c value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withX5c(List<String> x5c) {
        this.x5c = x5c;
        return this;
    }

    /**
     * Get y coordinate for the Elliptic Curve point.
     *
     * @return the y value
     */
    public String y() {
        return this.y;
    }

    /**
     * Set y coordinate for the Elliptic Curve point.
     *
     * @param y the y value to set
     * @return the JSONWebKey object itself.
     */
    public JSONWebKey withY(String y) {
        this.y = y;
        return this;
    }

}
