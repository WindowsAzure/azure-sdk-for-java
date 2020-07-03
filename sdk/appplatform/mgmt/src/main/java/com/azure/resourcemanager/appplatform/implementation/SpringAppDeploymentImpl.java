// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appplatform.implementation;

import com.azure.resourcemanager.appplatform.AppPlatformManager;
import com.azure.resourcemanager.appplatform.fluent.inner.DeploymentResourceInner;
import com.azure.resourcemanager.appplatform.fluent.inner.LogFileUrlResponseInner;
import com.azure.resourcemanager.appplatform.models.DeploymentInstance;
import com.azure.resourcemanager.appplatform.models.DeploymentResourceProperties;
import com.azure.resourcemanager.appplatform.models.DeploymentResourceStatus;
import com.azure.resourcemanager.appplatform.models.DeploymentSettings;
import com.azure.resourcemanager.appplatform.models.ResourceUploadDefinition;
import com.azure.resourcemanager.appplatform.models.RuntimeVersion;
import com.azure.resourcemanager.appplatform.models.SpringApp;
import com.azure.resourcemanager.appplatform.models.SpringAppDeployment;
import com.azure.resourcemanager.appplatform.models.UserSourceInfo;
import com.azure.resourcemanager.appplatform.models.UserSourceType;
import com.azure.resourcemanager.resources.fluentcore.arm.models.implementation.ExternalChildResourceImpl;
import com.azure.resourcemanager.resources.fluentcore.model.Indexable;
import com.azure.storage.file.share.ShareFileAsyncClient;
import com.azure.storage.file.share.ShareFileClientBuilder;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.GZIPOutputStream;

public class SpringAppDeploymentImpl
    extends ExternalChildResourceImpl<SpringAppDeployment, DeploymentResourceInner, SpringAppImpl, SpringApp>
    implements SpringAppDeployment, SpringAppDeployment.Definition, SpringAppDeployment.Update {
    private static final int BLOCK_SIZE = 4 * 1024 * 1024; // 4MB
    private final SpringAppDeploymentsImpl client;
    private SpringAppDeployment originalDeployment;

    SpringAppDeploymentImpl(String name, SpringAppImpl parent,
                            DeploymentResourceInner innerObject, SpringAppDeploymentsImpl client) {
        super(name, parent, innerObject);
        this.client = client;
    }

    @Override
    public String appName() {
        if (inner().properties() == null) {
            return null;
        }
        return inner().properties().appName();
    }

    @Override
    public DeploymentSettings settings() {
        if (inner().properties() == null) {
            return null;
        }
        return inner().properties().deploymentSettings();
    }

    @Override
    public DeploymentResourceStatus status() {
        if (inner().properties() == null) {
            return null;
        }
        return inner().properties().status();
    }

    @Override
    public boolean isActive() {
        if (inner().properties() == null) {
            return false;
        }
        return inner().properties().active();
    }

    @Override
    public OffsetDateTime createdTime() {
        if (inner().properties() == null) {
            return null;
        }
        return inner().properties().createdTime();
    }

    @Override
    public List<DeploymentInstance> instances() {
        if (inner().properties() == null) {
            return null;
        }
        return inner().properties().instances();
    }

    @Override
    public String getLogFileUrl() {
        return getLogFileUrlAsync().block();
    }

    @Override
    public Mono<String> getLogFileUrlAsync() {
        return manager().inner().getDeployments().getLogFileUrlAsync(
            parent().parent().resourceGroupName(), parent().parent().name(), parent().name(), name()
        )
            .map(LogFileUrlResponseInner::url);
    }

    private void ensureDeploySettings() {
        if (inner().properties() == null) {
            inner().withProperties(new DeploymentResourceProperties());
        }
        if (inner().properties().deploymentSettings() == null) {
            inner().properties().withDeploymentSettings(new DeploymentSettings());
        }
    }

    private void ensureSource() {
        if (inner().properties() == null) {
            inner().withProperties(new DeploymentResourceProperties());
        }
        if (inner().properties().source() == null) {
            inner().properties().withSource(new UserSourceInfo());
        }
    }

    private File compressSource(File sourceFolder) throws IOException {
        File compressFile = File.createTempFile("java_package", "tar.gz");
        try (TarArchiveOutputStream tarArchiveOutputStream = new TarArchiveOutputStream(
                 new GZIPOutputStream(new FileOutputStream(compressFile)))) {
            tarArchiveOutputStream.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

            for (Path sourceFile : Files.walk(sourceFolder.toPath()).collect(Collectors.toList())) {
                String relativePath = sourceFolder.toPath().relativize(sourceFile).toString();
                TarArchiveEntry entry = new TarArchiveEntry(sourceFile.toFile(), relativePath);
                if (sourceFile.toFile().isFile()) {
                    try (InputStream inputStream = new FileInputStream(sourceFile.toFile())) {
                        tarArchiveOutputStream.putArchiveEntry(entry);
                        IOUtils.copy(inputStream, tarArchiveOutputStream);
                        tarArchiveOutputStream.closeArchiveEntry();
                    }
                } else {
                    tarArchiveOutputStream.putArchiveEntry(entry);
                    tarArchiveOutputStream.closeArchiveEntry();
                }
            }
        }
        return compressFile;
    }

    private Mono<ShareFileAsyncClient> createShareFileAsyncClient(ResourceUploadDefinition option, long maxSize) {
        ShareFileAsyncClient shareFileAsyncClient = new ShareFileClientBuilder()
            .endpoint(option.uploadUrl())
            .httpClient(manager().httpPipeline().getHttpClient())
            .buildFileAsyncClient();

        return shareFileAsyncClient.create(maxSize)
            .then(Mono.just(shareFileAsyncClient));
    }

    private Mono<ShareFileAsyncClient> uploadToStorage(byte[] bytes, ResourceUploadDefinition option) {
        inner().properties().source().withRelativePath(option.relativePath());
        return createShareFileAsyncClient(option, bytes.length)
                .flatMap(shareFileAsyncClient -> {
                    List<Integer> blockList = new ArrayList<>();
                    for (int start = 0; start < bytes.length; start += BLOCK_SIZE) {
                        blockList.add(start);
                    }
                    return Flux.fromIterable(blockList)
                        .flatMap(start -> {
                            int length = Math.min(bytes.length - start, BLOCK_SIZE);
                            return shareFileAsyncClient.uploadWithResponse(
                                Flux.just(ByteBuffer.wrap(bytes, start, length)), length, (long) start);
                        })
                        .then(Mono.just(shareFileAsyncClient));
                });
    }

    private Mono<ShareFileAsyncClient> uploadToStorage(File source, ResourceUploadDefinition option) {
        inner().properties().source().withRelativePath(option.relativePath());
        try {
            return createShareFileAsyncClient(option, source.length())
                .flatMap(shareFileAsyncClient -> shareFileAsyncClient.uploadFromFile(source.getAbsolutePath())
                    .then(Mono.just(shareFileAsyncClient)));
        } catch (Exception e) {
            return Mono.error(e);
        }
    }

    @Override
    public SpringAppDeploymentImpl withJarPath(File jar) {
        ensureSource();
        inner().properties().source().withType(UserSourceType.JAR);
        this.addDependency(
            context -> parent().getResourceUploadUrlAsync()
                .flatMap(option -> uploadToStorage(jar, option)
                    .then(context.voidMono()))
        );
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withJarFile(byte[] jar) {
        ensureSource();
        inner().properties().source().withType(UserSourceType.JAR);
        this.addDependency(
            context -> parent().getResourceUploadUrlAsync()
                .flatMap(option -> uploadToStorage(jar, option)
                    .then(context.voidMono()))
        );
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withSourceCodeFolder(File sourceCode) {
        ensureSource();
        inner().properties().source().withType(UserSourceType.SOURCE);
        this.addDependency(
            context -> parent().getResourceUploadUrlAsync()
                .flatMap(option -> {
                    try {
                        return uploadToStorage(compressSource(sourceCode), option);
                    } catch (Exception e) {
                        return Mono.error(e);
                    }
                })
                .then(context.voidMono())
        );
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withExistingSource(UserSourceType type, String relativePath) {
        ensureSource();
        inner().properties().source().withType(type);
        inner().properties().source().withRelativePath(relativePath);
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withSourceCodeTarGzFile(File sourceCodeTarGz) {
        ensureSource();
        inner().properties().source().withType(UserSourceType.SOURCE);
        this.addDependency(
            context -> parent().getResourceUploadUrlAsync()
                .flatMap(option -> uploadToStorage(sourceCodeTarGz, option)
                    .then(context.voidMono()))
        );
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withTargetModule(String moduleName) {
        ensureSource();
        inner().properties().source().withArtifactSelector(moduleName);
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withSingleModule() {
        ensureSource();
        inner().properties().source().withArtifactSelector(null);
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withCurrentActiveSetting() {
        this.addDependency(
            context -> client.getByNameAsync(parent().activeDeployment())
                .map(deployment -> {
                    originalDeployment = deployment;
                    return (Indexable) deployment;
                })
        );
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withSettingsFromDeployment(SpringAppDeployment deployment) {
        originalDeployment = deployment;
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withSettingsFromDeployment(String deploymentName) {
        this.addDependency(
            context -> client.getByNameAsync(deploymentName)
                .map(deployment -> {
                    originalDeployment = deployment;
                    return (Indexable) deployment;
                })
        );
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withCustomSetting() {
        ensureDeploySettings();
        inner().properties().withDeploymentSettings(new DeploymentSettings());
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withInstance(int count) {
        ensureDeploySettings();
        inner().properties().deploymentSettings().withInstanceCount(count);
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withCpu(int cpuCount) {
        ensureDeploySettings();
        inner().properties().deploymentSettings().withCpu(cpuCount);
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withMemory(int sizeInGB) {
        ensureDeploySettings();
        inner().properties().deploymentSettings().withMemoryInGB(sizeInGB);
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withRuntime(RuntimeVersion version) {
        ensureDeploySettings();
        inner().properties().deploymentSettings().withRuntimeVersion(version);
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withJvmOptions(String jvmOptions) {
        ensureDeploySettings();
        inner().properties().deploymentSettings().withJvmOptions(jvmOptions);
        return this;
    }

    private void ensureEnvironments() {
        ensureDeploySettings();
        if (inner().properties().deploymentSettings().environmentVariables() == null) {
            inner().properties().deploymentSettings().withEnvironmentVariables(new HashMap<>());
        }
    }

    @Override
    public SpringAppDeploymentImpl withEnvironment(String key, String value) {
        ensureEnvironments();
        inner().properties().deploymentSettings().environmentVariables().put(key, value);
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withoutEnvironment(String key) {
        ensureEnvironments();
        inner().properties().deploymentSettings().environmentVariables().remove(key);
        return this;
    }

    @Override
    public SpringAppDeploymentImpl withVersionName(String versionName) {
        ensureSource();
        inner().properties().source().withVersion(versionName);
        return this;
    }

    @Override
    public SpringAppDeploymentImpl activate() {
        this.addPostRunDependent(
            context -> parent().update().withActiveDeployment(name()).applyAsync()
                .map(app -> (Indexable) app)
        );
        return this;
    }

    @Override
    public Mono<SpringAppDeployment> createResourceAsync() {
        if (originalDeployment != null) {
            ensureDeploySettings();
            inner().properties().withDeploymentSettings(originalDeployment.settings());
        }
        return manager().inner().getDeployments().createOrUpdateAsync(
            parent().parent().resourceGroupName(), parent().parent().name(),
            parent().name(), name(), inner().properties()
        )
            .map(inner -> {
                originalDeployment = null;
                setInner(inner);
                return this;
            });
    }

    @Override
    public Mono<SpringAppDeployment> updateResourceAsync() {
        if (originalDeployment != null) {
            ensureDeploySettings();
            inner().properties().withDeploymentSettings(originalDeployment.settings());
        }
        return manager().inner().getDeployments().updateAsync(
            parent().parent().resourceGroupName(), parent().parent().name(),
            parent().name(), name(), inner().properties()
        )
            .map(inner -> {
                originalDeployment = null;
                setInner(inner);
                return this;
            });
    }

    @Override
    public Mono<Void> deleteResourceAsync() {
        return manager().inner().getDeployments().deleteAsync(
            parent().parent().resourceGroupName(), parent().parent().name(), parent().name(), name()
        );
    }

    @Override
    protected Mono<DeploymentResourceInner> getInnerAsync() {
        return manager().inner().getDeployments().getAsync(
            parent().parent().resourceGroupName(), parent().parent().name(), parent().name(), name()
        );
    }

    @Override
    public String id() {
        return inner().id();
    }

    @Override
    public SpringAppDeploymentImpl update() {
        prepareUpdate();
        return this;
    }

    private AppPlatformManager manager() {
        return parent().manager();
    }
}
