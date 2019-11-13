// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.keys.KeyClientBuilder;
import com.azure.security.keyvault.keys.implementation.AzureKeyVaultConfiguration;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public abstract class CryptographyClientTestBase extends TestBase {
    KeyClientBuilder clientBuilder;
    HttpPipeline httpPipeline;

    @Override
    protected String getTestName() {
        return "";
    }

    void beforeTestSetup() {
        TestMode testMode = getTestMode();

        String endpoint;
        TokenCredential credential;

        if (testMode == TestMode.PLAYBACK) {
            endpoint = "http://localhost:8080";
            credential = resource -> Mono.just(new AccessToken("Some fake token", OffsetDateTime.now(ZoneOffset.UTC)
                .plus(Duration.ofMinutes(30))));
        } else {
            endpoint = System.getenv("AZURE_KEYVAULT_ENDPOINT");
            credential = new DefaultAzureCredentialBuilder().build();
        }

        Objects.requireNonNull(endpoint);
        Objects.requireNonNull(credential);

        List<HttpPipelinePolicy> policies = new ArrayList<>();
        policies.add(new UserAgentPolicy(AzureKeyVaultConfiguration.SDK_NAME, AzureKeyVaultConfiguration.SDK_VERSION,
            Configuration.getGlobalConfiguration().clone(), CryptographyServiceVersion.getLatest()));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(new RetryPolicy());
        policies.add(new BearerTokenAuthenticationPolicy(credential, CryptographyAsyncClient.KEY_VAULT_SCOPE));

        if (testMode == TestMode.RECORD && !testRunVerifier.doNotRecordTest()) {
            policies.add(interceptorManager.getRecordPolicy());
        }

        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS)));

        HttpClient httpClient;

        if (testMode == TestMode.RECORD && !testRunVerifier.doNotRecordTest()) {
            httpClient = new NettyAsyncHttpClientBuilder().wiretap(true).build();
        } else if (testMode == TestMode.PLAYBACK && !testRunVerifier.doNotRecordTest()) {
            httpClient = interceptorManager.getPlaybackClient();
        } else {
            httpClient = new NettyAsyncHttpClientBuilder().build();
        }

        httpPipeline = new HttpPipelineBuilder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .build();

        clientBuilder = new KeyClientBuilder()
            .vaultUrl(endpoint)
            .pipeline(httpPipeline);
    }

    @Test
    public abstract void encryptDecryptRsa() throws Exception;

    void encryptDecryptRsaRunner(Consumer<KeyPair> testRunner) throws Exception {
        testRunner.accept(getWellKnownKey());
    }

    @Test
    public abstract void signVerifyEc() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException;

    @Test
    public abstract void wrapUnwraptRsa() throws Exception;

    @Test
    public abstract void signVerifyRsa() throws Exception;

    private static KeyPair getWellKnownKey() throws Exception {
        BigInteger modulus = new BigInteger("27266783713040163753473734334021230592631652450892850648620119914958066181400432364213298181846462385257448168605902438305568194683691563208578540343969522651422088760509452879461613852042845039552547834002168737350264189810815735922734447830725099163869215360401162450008673869707774119785881115044406101346450911054819448375712432746968301739007624952483347278954755460152795801894283389540036131881712321193750961817346255102052653789197325341350920441746054233522546543768770643593655942246891652634114922277138937273034902434321431672058220631825053788262810480543541597284376261438324665363067125951152574540779");
        BigInteger publicExponent = new BigInteger("65537");
        BigInteger privateExponent = new BigInteger("10466613941269075477152428927796086150095892102279802916937552172064636326433780566497000814207416485739683286961848843255766652023400959086290344987308562817062506476465756840999981989957456897020361717197805192876094362315496459535960304928171129585813477132331538577519084006595335055487028872410579127692209642938724850603554885478763205394868103298473476811627231543504190652483290944218004086457805431824328448422034887148115990501701345535825110962804471270499590234116100216841170344686381902328362376624405803648588830575558058257742073963036264273582756620469659464278207233345784355220317478103481872995809");
        BigInteger primeP = new BigInteger("175002941104568842715096339107566771592009112128184231961529953978142750732317724951747797764638217287618769007295505214923187971350518217670604044004381362495186864051394404165602744235299100790551775147322153206730562450301874236875459336154569893255570576967036237661594595803204808064127845257496057219227");
        BigInteger primeQ = new BigInteger("155807574095269324897144428622185380283967159190626345335083690114147315509962698765044950001909553861571493035240542031420213144237033208612132704562174772894369053916729901982420535940939821673277140180113593951522522222348910536202664252481405241042414183668723338300649954708432681241621374644926879028977");
        BigInteger primeExponentP = new BigInteger("79745606804504995938838168837578376593737280079895233277372027184693457251170125851946171360348440134236338520742068873132216695552312068793428432338173016914968041076503997528137698610601222912385953171485249299873377130717231063522112968474603281996190849604705284061306758152904594168593526874435238915345");
        BigInteger primeExponentQ = new BigInteger("80619964983821018303966686284189517841976445905569830731617605558094658227540855971763115484608005874540349730961777634427740786642996065386667564038755340092176159839025706183161615488856833433976243963682074011475658804676349317075370362785860401437192843468423594688700132964854367053490737073471709030801");
        BigInteger crtCoefficient = new BigInteger("2157818511040667226980891229484210846757728661751992467240662009652654684725325675037512595031058612950802328971801913498711880111052682274056041470625863586779333188842602381844572406517251106159327934511268610438516820278066686225397795046020275055545005189953702783748235257613991379770525910232674719428");

        KeySpec publicKeySpec = new RSAPublicKeySpec(modulus, publicExponent);
        KeySpec privateKeySpec = new RSAPrivateCrtKeySpec(modulus, publicExponent, privateExponent, primeP, primeQ, primeExponentP, primeExponentQ, crtCoefficient);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        return new KeyPair(keyFactory.generatePublic(publicKeySpec), keyFactory.generatePrivate(privateKeySpec));
    }

    public String getEndpoint() {
        final String endpoint = interceptorManager.isPlaybackMode()
            ? "http://localhost:8080"
            : "https://cameravault.vault.azure.net";
        //    : System.getenv("AZURE_KEYVAULT_ENDPOINT");
        Objects.requireNonNull(endpoint);
        return endpoint;
    }
}
