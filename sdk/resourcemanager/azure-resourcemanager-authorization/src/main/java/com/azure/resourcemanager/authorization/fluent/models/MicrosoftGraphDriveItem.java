// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** driveItem. */
@Fluent
public final class MicrosoftGraphDriveItem extends MicrosoftGraphBaseItemInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphDriveItem.class);

    /*
     * audio
     */
    @JsonProperty(value = "audio")
    private MicrosoftGraphAudio audio;

    /*
     * The content stream, if the item represents a file.
     */
    @JsonProperty(value = "content")
    private Base64Url content;

    /*
     * An eTag for the content of the item. This eTag is not changed if only
     * the metadata is changed. Note This property is not returned if the item
     * is a folder. Read-only.
     */
    @JsonProperty(value = "cTag")
    private String cTag;

    /*
     * deleted
     */
    @JsonProperty(value = "deleted")
    private MicrosoftGraphDeleted deleted;

    /*
     * file
     */
    @JsonProperty(value = "file")
    private MicrosoftGraphFile file;

    /*
     * fileSystemInfo
     */
    @JsonProperty(value = "fileSystemInfo")
    private MicrosoftGraphFileSystemInfo fileSystemInfo;

    /*
     * folder
     */
    @JsonProperty(value = "folder")
    private MicrosoftGraphFolder folder;

    /*
     * image
     */
    @JsonProperty(value = "image")
    private MicrosoftGraphImage image;

    /*
     * geoCoordinates
     */
    @JsonProperty(value = "location")
    private MicrosoftGraphGeoCoordinates location;

    /*
     * package
     */
    @JsonProperty(value = "package")
    private MicrosoftGraphPackage packageProperty;

    /*
     * pendingOperations
     */
    @JsonProperty(value = "pendingOperations")
    private MicrosoftGraphPendingOperations pendingOperations;

    /*
     * photo
     */
    @JsonProperty(value = "photo")
    private MicrosoftGraphPhoto photo;

    /*
     * publicationFacet
     */
    @JsonProperty(value = "publication")
    private MicrosoftGraphPublicationFacet publication;

    /*
     * remoteItem
     */
    @JsonProperty(value = "remoteItem")
    private MicrosoftGraphRemoteItem remoteItem;

    /*
     * root
     */
    @JsonProperty(value = "root")
    private Map<String, Object> root;

    /*
     * searchResult
     */
    @JsonProperty(value = "searchResult")
    private MicrosoftGraphSearchResult searchResult;

    /*
     * shared
     */
    @JsonProperty(value = "shared")
    private MicrosoftGraphShared shared;

    /*
     * sharepointIds
     */
    @JsonProperty(value = "sharepointIds")
    private MicrosoftGraphSharepointIds sharepointIds;

    /*
     * Size of the item in bytes. Read-only.
     */
    @JsonProperty(value = "size")
    private Long size;

    /*
     * specialFolder
     */
    @JsonProperty(value = "specialFolder")
    private MicrosoftGraphSpecialFolder specialFolder;

    /*
     * video
     */
    @JsonProperty(value = "video")
    private MicrosoftGraphVideo video;

    /*
     * WebDAV compatible URL for the item.
     */
    @JsonProperty(value = "webDavUrl")
    private String webDavUrl;

    /*
     * workbook
     */
    @JsonProperty(value = "workbook")
    private MicrosoftGraphWorkbook workbook;

    /*
     * itemAnalytics
     */
    @JsonProperty(value = "analytics")
    private MicrosoftGraphItemAnalytics analytics;

    /*
     * Collection containing Item objects for the immediate children of Item.
     * Only items representing folders have children. Read-only. Nullable.
     */
    @JsonProperty(value = "children")
    private List<MicrosoftGraphDriveItem> children;

    /*
     * listItem
     */
    @JsonProperty(value = "listItem")
    private MicrosoftGraphListItem listItem;

    /*
     * The set of permissions for the item. Read-only. Nullable.
     */
    @JsonProperty(value = "permissions")
    private List<MicrosoftGraphPermission> permissions;

    /*
     * The set of subscriptions on the item. Only supported on the root of a
     * drive.
     */
    @JsonProperty(value = "subscriptions")
    private List<MicrosoftGraphSubscription> subscriptions;

    /*
     * Collection containing [ThumbnailSet][] objects associated with the item.
     * For more info, see [getting thumbnails][]. Read-only. Nullable.
     */
    @JsonProperty(value = "thumbnails")
    private List<MicrosoftGraphThumbnailSet> thumbnails;

    /*
     * The list of previous versions of the item. For more info, see [getting
     * previous versions][]. Read-only. Nullable.
     */
    @JsonProperty(value = "versions")
    private List<MicrosoftGraphDriveItemVersion> versions;

    /*
     * driveItem
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the audio property: audio.
     *
     * @return the audio value.
     */
    public MicrosoftGraphAudio audio() {
        return this.audio;
    }

    /**
     * Set the audio property: audio.
     *
     * @param audio the audio value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withAudio(MicrosoftGraphAudio audio) {
        this.audio = audio;
        return this;
    }

    /**
     * Get the content property: The content stream, if the item represents a file.
     *
     * @return the content value.
     */
    public byte[] content() {
        if (this.content == null) {
            return null;
        }
        return this.content.decodedBytes();
    }

    /**
     * Set the content property: The content stream, if the item represents a file.
     *
     * @param content the content value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withContent(byte[] content) {
        if (content == null) {
            this.content = null;
        } else {
            this.content = Base64Url.encode(CoreUtils.clone(content));
        }
        return this;
    }

    /**
     * Get the cTag property: An eTag for the content of the item. This eTag is not changed if only the metadata is
     * changed. Note This property is not returned if the item is a folder. Read-only.
     *
     * @return the cTag value.
     */
    public String cTag() {
        return this.cTag;
    }

    /**
     * Set the cTag property: An eTag for the content of the item. This eTag is not changed if only the metadata is
     * changed. Note This property is not returned if the item is a folder. Read-only.
     *
     * @param cTag the cTag value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withCTag(String cTag) {
        this.cTag = cTag;
        return this;
    }

    /**
     * Get the deleted property: deleted.
     *
     * @return the deleted value.
     */
    public MicrosoftGraphDeleted deleted() {
        return this.deleted;
    }

    /**
     * Set the deleted property: deleted.
     *
     * @param deleted the deleted value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withDeleted(MicrosoftGraphDeleted deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get the file property: file.
     *
     * @return the file value.
     */
    public MicrosoftGraphFile file() {
        return this.file;
    }

    /**
     * Set the file property: file.
     *
     * @param file the file value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withFile(MicrosoftGraphFile file) {
        this.file = file;
        return this;
    }

    /**
     * Get the fileSystemInfo property: fileSystemInfo.
     *
     * @return the fileSystemInfo value.
     */
    public MicrosoftGraphFileSystemInfo fileSystemInfo() {
        return this.fileSystemInfo;
    }

    /**
     * Set the fileSystemInfo property: fileSystemInfo.
     *
     * @param fileSystemInfo the fileSystemInfo value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withFileSystemInfo(MicrosoftGraphFileSystemInfo fileSystemInfo) {
        this.fileSystemInfo = fileSystemInfo;
        return this;
    }

    /**
     * Get the folder property: folder.
     *
     * @return the folder value.
     */
    public MicrosoftGraphFolder folder() {
        return this.folder;
    }

    /**
     * Set the folder property: folder.
     *
     * @param folder the folder value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withFolder(MicrosoftGraphFolder folder) {
        this.folder = folder;
        return this;
    }

    /**
     * Get the image property: image.
     *
     * @return the image value.
     */
    public MicrosoftGraphImage image() {
        return this.image;
    }

    /**
     * Set the image property: image.
     *
     * @param image the image value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withImage(MicrosoftGraphImage image) {
        this.image = image;
        return this;
    }

    /**
     * Get the location property: geoCoordinates.
     *
     * @return the location value.
     */
    public MicrosoftGraphGeoCoordinates location() {
        return this.location;
    }

    /**
     * Set the location property: geoCoordinates.
     *
     * @param location the location value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withLocation(MicrosoftGraphGeoCoordinates location) {
        this.location = location;
        return this;
    }

    /**
     * Get the packageProperty property: package.
     *
     * @return the packageProperty value.
     */
    public MicrosoftGraphPackage packageProperty() {
        return this.packageProperty;
    }

    /**
     * Set the packageProperty property: package.
     *
     * @param packageProperty the packageProperty value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withPackageProperty(MicrosoftGraphPackage packageProperty) {
        this.packageProperty = packageProperty;
        return this;
    }

    /**
     * Get the pendingOperations property: pendingOperations.
     *
     * @return the pendingOperations value.
     */
    public MicrosoftGraphPendingOperations pendingOperations() {
        return this.pendingOperations;
    }

    /**
     * Set the pendingOperations property: pendingOperations.
     *
     * @param pendingOperations the pendingOperations value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withPendingOperations(MicrosoftGraphPendingOperations pendingOperations) {
        this.pendingOperations = pendingOperations;
        return this;
    }

    /**
     * Get the photo property: photo.
     *
     * @return the photo value.
     */
    public MicrosoftGraphPhoto photo() {
        return this.photo;
    }

    /**
     * Set the photo property: photo.
     *
     * @param photo the photo value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withPhoto(MicrosoftGraphPhoto photo) {
        this.photo = photo;
        return this;
    }

    /**
     * Get the publication property: publicationFacet.
     *
     * @return the publication value.
     */
    public MicrosoftGraphPublicationFacet publication() {
        return this.publication;
    }

    /**
     * Set the publication property: publicationFacet.
     *
     * @param publication the publication value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withPublication(MicrosoftGraphPublicationFacet publication) {
        this.publication = publication;
        return this;
    }

    /**
     * Get the remoteItem property: remoteItem.
     *
     * @return the remoteItem value.
     */
    public MicrosoftGraphRemoteItem remoteItem() {
        return this.remoteItem;
    }

    /**
     * Set the remoteItem property: remoteItem.
     *
     * @param remoteItem the remoteItem value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withRemoteItem(MicrosoftGraphRemoteItem remoteItem) {
        this.remoteItem = remoteItem;
        return this;
    }

    /**
     * Get the root property: root.
     *
     * @return the root value.
     */
    public Map<String, Object> root() {
        return this.root;
    }

    /**
     * Set the root property: root.
     *
     * @param root the root value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withRoot(Map<String, Object> root) {
        this.root = root;
        return this;
    }

    /**
     * Get the searchResult property: searchResult.
     *
     * @return the searchResult value.
     */
    public MicrosoftGraphSearchResult searchResult() {
        return this.searchResult;
    }

    /**
     * Set the searchResult property: searchResult.
     *
     * @param searchResult the searchResult value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withSearchResult(MicrosoftGraphSearchResult searchResult) {
        this.searchResult = searchResult;
        return this;
    }

    /**
     * Get the shared property: shared.
     *
     * @return the shared value.
     */
    public MicrosoftGraphShared shared() {
        return this.shared;
    }

    /**
     * Set the shared property: shared.
     *
     * @param shared the shared value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withShared(MicrosoftGraphShared shared) {
        this.shared = shared;
        return this;
    }

    /**
     * Get the sharepointIds property: sharepointIds.
     *
     * @return the sharepointIds value.
     */
    public MicrosoftGraphSharepointIds sharepointIds() {
        return this.sharepointIds;
    }

    /**
     * Set the sharepointIds property: sharepointIds.
     *
     * @param sharepointIds the sharepointIds value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withSharepointIds(MicrosoftGraphSharepointIds sharepointIds) {
        this.sharepointIds = sharepointIds;
        return this;
    }

    /**
     * Get the size property: Size of the item in bytes. Read-only.
     *
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size property: Size of the item in bytes. Read-only.
     *
     * @param size the size value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the specialFolder property: specialFolder.
     *
     * @return the specialFolder value.
     */
    public MicrosoftGraphSpecialFolder specialFolder() {
        return this.specialFolder;
    }

    /**
     * Set the specialFolder property: specialFolder.
     *
     * @param specialFolder the specialFolder value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withSpecialFolder(MicrosoftGraphSpecialFolder specialFolder) {
        this.specialFolder = specialFolder;
        return this;
    }

    /**
     * Get the video property: video.
     *
     * @return the video value.
     */
    public MicrosoftGraphVideo video() {
        return this.video;
    }

    /**
     * Set the video property: video.
     *
     * @param video the video value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withVideo(MicrosoftGraphVideo video) {
        this.video = video;
        return this;
    }

    /**
     * Get the webDavUrl property: WebDAV compatible URL for the item.
     *
     * @return the webDavUrl value.
     */
    public String webDavUrl() {
        return this.webDavUrl;
    }

    /**
     * Set the webDavUrl property: WebDAV compatible URL for the item.
     *
     * @param webDavUrl the webDavUrl value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withWebDavUrl(String webDavUrl) {
        this.webDavUrl = webDavUrl;
        return this;
    }

    /**
     * Get the workbook property: workbook.
     *
     * @return the workbook value.
     */
    public MicrosoftGraphWorkbook workbook() {
        return this.workbook;
    }

    /**
     * Set the workbook property: workbook.
     *
     * @param workbook the workbook value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withWorkbook(MicrosoftGraphWorkbook workbook) {
        this.workbook = workbook;
        return this;
    }

    /**
     * Get the analytics property: itemAnalytics.
     *
     * @return the analytics value.
     */
    public MicrosoftGraphItemAnalytics analytics() {
        return this.analytics;
    }

    /**
     * Set the analytics property: itemAnalytics.
     *
     * @param analytics the analytics value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withAnalytics(MicrosoftGraphItemAnalytics analytics) {
        this.analytics = analytics;
        return this;
    }

    /**
     * Get the children property: Collection containing Item objects for the immediate children of Item. Only items
     * representing folders have children. Read-only. Nullable.
     *
     * @return the children value.
     */
    public List<MicrosoftGraphDriveItem> children() {
        return this.children;
    }

    /**
     * Set the children property: Collection containing Item objects for the immediate children of Item. Only items
     * representing folders have children. Read-only. Nullable.
     *
     * @param children the children value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withChildren(List<MicrosoftGraphDriveItem> children) {
        this.children = children;
        return this;
    }

    /**
     * Get the listItem property: listItem.
     *
     * @return the listItem value.
     */
    public MicrosoftGraphListItem listItem() {
        return this.listItem;
    }

    /**
     * Set the listItem property: listItem.
     *
     * @param listItem the listItem value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withListItem(MicrosoftGraphListItem listItem) {
        this.listItem = listItem;
        return this;
    }

    /**
     * Get the permissions property: The set of permissions for the item. Read-only. Nullable.
     *
     * @return the permissions value.
     */
    public List<MicrosoftGraphPermission> permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The set of permissions for the item. Read-only. Nullable.
     *
     * @param permissions the permissions value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withPermissions(List<MicrosoftGraphPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the subscriptions property: The set of subscriptions on the item. Only supported on the root of a drive.
     *
     * @return the subscriptions value.
     */
    public List<MicrosoftGraphSubscription> subscriptions() {
        return this.subscriptions;
    }

    /**
     * Set the subscriptions property: The set of subscriptions on the item. Only supported on the root of a drive.
     *
     * @param subscriptions the subscriptions value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withSubscriptions(List<MicrosoftGraphSubscription> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    /**
     * Get the thumbnails property: Collection containing [ThumbnailSet][] objects associated with the item. For more
     * info, see [getting thumbnails][]. Read-only. Nullable.
     *
     * @return the thumbnails value.
     */
    public List<MicrosoftGraphThumbnailSet> thumbnails() {
        return this.thumbnails;
    }

    /**
     * Set the thumbnails property: Collection containing [ThumbnailSet][] objects associated with the item. For more
     * info, see [getting thumbnails][]. Read-only. Nullable.
     *
     * @param thumbnails the thumbnails value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withThumbnails(List<MicrosoftGraphThumbnailSet> thumbnails) {
        this.thumbnails = thumbnails;
        return this;
    }

    /**
     * Get the versions property: The list of previous versions of the item. For more info, see [getting previous
     * versions][]. Read-only. Nullable.
     *
     * @return the versions value.
     */
    public List<MicrosoftGraphDriveItemVersion> versions() {
        return this.versions;
    }

    /**
     * Set the versions property: The list of previous versions of the item. For more info, see [getting previous
     * versions][]. Read-only. Nullable.
     *
     * @param versions the versions value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withVersions(List<MicrosoftGraphDriveItemVersion> versions) {
        this.versions = versions;
        return this;
    }

    /**
     * Get the additionalProperties property: driveItem.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: driveItem.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDriveItem object itself.
     */
    public MicrosoftGraphDriveItem withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withCreatedBy(MicrosoftGraphIdentitySet createdBy) {
        super.withCreatedBy(createdBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withParentReference(MicrosoftGraphItemReference parentReference) {
        super.withParentReference(parentReference);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withWebUrl(String webUrl) {
        super.withWebUrl(webUrl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withCreatedByUser(MicrosoftGraphUserInner createdByUser) {
        super.withCreatedByUser(createdByUser);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withLastModifiedByUser(MicrosoftGraphUserInner lastModifiedByUser) {
        super.withLastModifiedByUser(lastModifiedByUser);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDriveItem withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (audio() != null) {
            audio().validate();
        }
        if (deleted() != null) {
            deleted().validate();
        }
        if (file() != null) {
            file().validate();
        }
        if (fileSystemInfo() != null) {
            fileSystemInfo().validate();
        }
        if (folder() != null) {
            folder().validate();
        }
        if (image() != null) {
            image().validate();
        }
        if (location() != null) {
            location().validate();
        }
        if (packageProperty() != null) {
            packageProperty().validate();
        }
        if (pendingOperations() != null) {
            pendingOperations().validate();
        }
        if (photo() != null) {
            photo().validate();
        }
        if (publication() != null) {
            publication().validate();
        }
        if (remoteItem() != null) {
            remoteItem().validate();
        }
        if (searchResult() != null) {
            searchResult().validate();
        }
        if (shared() != null) {
            shared().validate();
        }
        if (sharepointIds() != null) {
            sharepointIds().validate();
        }
        if (specialFolder() != null) {
            specialFolder().validate();
        }
        if (video() != null) {
            video().validate();
        }
        if (workbook() != null) {
            workbook().validate();
        }
        if (analytics() != null) {
            analytics().validate();
        }
        if (children() != null) {
            children().forEach(e -> e.validate());
        }
        if (listItem() != null) {
            listItem().validate();
        }
        if (permissions() != null) {
            permissions().forEach(e -> e.validate());
        }
        if (subscriptions() != null) {
            subscriptions().forEach(e -> e.validate());
        }
        if (thumbnails() != null) {
            thumbnails().forEach(e -> e.validate());
        }
        if (versions() != null) {
            versions().forEach(e -> e.validate());
        }
    }
}
